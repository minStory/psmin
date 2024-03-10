package com.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



public class BoardDAO {

	// DB와 연결하는 객체
	Connection con = null;
	
	// DB에 SQL문을 전송하는 객체.
	PreparedStatement pstmt = null;
	
	// SQL문을 실행한 후에 결과값을 가지고 있는 객체.
	ResultSet rs = null;
	
	// SQL문을 저장할 변수
	String sql = null;
	
	
	// BoardDAO 객체를 싱글턴 방식으로 만들어 보자.
	// 1단계 : BoardDAO 객체를 정적(static) 멤버로
	//        선언을 해 주어야 한다.
	private static BoardDAO instance = null;
	
	// 2단계 : 싱글턴 방식으로 객체를 만들기 위해서는 우선저긍로
	//        기본생성자의 접근제어자를 public이 아닌
	//        private으로 바꾸어 주어야 한다.
	//        즉, 외부에서 직접적으로 기본생성자를 접근하여
	//        호출하지 못하도록 하는 방법이다.
	private BoardDAO() {  }  // 기본 생성자
	
	// 3단계 : 기본 생성자 대신에 싱글턴 객체를 return 해 주는
	//        getInstance() 라는 메서드를 만들어서 해당
	//        getInstance() 메서드를 외부에서 접근할 수 
	//        있도록 해 주면 됨.
	public static BoardDAO getInstance() {
		
		if(instance == null) {
			instance = new BoardDAO();
		}
		
		return instance;
	}  // getInstance() 메서드 end
	
	
	//JDBC 방식이 아닌 DBCP 방식으로 DB와 연동 작업 진행
	public void openConn() {
		
		try {
			//1단계: JNDI 서버 객체 생성
			//자바의 네이밍 서비스(JNDI)에서 이름과 실제 객체를
			//연결해 주는 개념이 COntext 객체이며,
			//InitialContext 객체는 네이밍 서비스를 이용하기 위한 시작점이 된다.
			Context initCtx = new InitialContext();
			
			//2단계: Context 객체를 얻어와야 한다.
			//"java.comp/env" 라는 이름의 인수로 Context 객체를 얻어온다.
			//"java.comp/env" 는 현재 웹 애플리케이션에서
			//네이밍 서비스를 이용 시 루트 디렉토리라고 생각하면 된다.
			//즉, 현재 웹 애플리케이션이 사용할 수 있는 모든 자원은
			//"java.comp/env" 아래에 위치하게 된다.
			Context ctx = (Context) initCtx.lookup("java:comp/env");
							//lookup의 리턴타입은 Object 타입
			
			//3단계: lookup() 메서드를 이용하여 매칭되는 커넥션을 찾아온다.
			//"java.comp.env" 아래에 위치한 "jdbc/mysql" 자원을 얻어온다.
			//이 자원이 바로 데이터 소스(커넥션 풀)이다.
			//여기서 "jdbc/mysql" 은 context.xml 파일에 추가했던
			//<Resource> 태그 안에 있던 name 속성의 값이다.
			DataSource ds = (DataSource) ctx.lookup("jdbc/mysql");
			
			//4단계: DataSource 객체를 이용하여 커넥션을 하나 가져오면 된다.
			con = ds.getConnection();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}  // openConn() 메서드 end
	
	// DB에 연결된 자원을 종료하는 메서드.
	public void closeConn(ResultSet rs, PreparedStatement pstmt, Connection con) {
		
			try {
				if(rs != null) rs.close();
				
				if(pstmt != null) pstmt.close();
				
				if(con != null) con.close();
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}  // closeConn() 메서드 end
	
	
	// DB에 연결된 자원을 종료하는 메서드.
	public void closeConn(PreparedStatement pstmt, Connection con) {
		
		try {
			
			if(pstmt != null) pstmt.close();
			
			if(con != null) con.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}  // closeConn() 메서드 end

	// board 테이블의 전체 게시물의 수를 조회하는 메서드.
	public int getBoardCount() {
		
		int count = 0;
		
		
		try {
			openConn();
			
			sql = "select count(*) from board";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				count = rs.getInt(1);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		
		return count;
	}  // getBoardCount() 메서드 end
	
	// board 테이블의 전체 게시물을 조회하는 메서드.
	public List<BoardDTO> getBoardList() {
		
		List<BoardDTO> list = new ArrayList<BoardDTO>();
		
		
		try {
			openConn();
			
			sql = "select * from board "
					+ " order by board_no desc";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				// board 테이블에서 하나의 레코드를 가져 와서
				// 각각 컬럼의 데이터를 DTO 객체의 setter()
				// 메서드의 인자로 전달.
				BoardDTO dto = new BoardDTO();
				
				dto.setBoard_no(rs.getInt("board_no"));
				dto.setBoard_writer(rs.getString("board_writer"));
				dto.setBoard_title(rs.getString("board_title"));
				dto.setBoard_cont(rs.getString("board_cont"));
				dto.setBoard_pwd(rs.getString("board_pwd"));
				dto.setBoard_hit(rs.getInt("board_hit"));
				dto.setBoard_date(rs.getString("board_date"));
				dto.setBoard_update(rs.getString("board_update"));
				
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		
		return list;
	}  // getBoardList() 메서드 end
		
} //class end









