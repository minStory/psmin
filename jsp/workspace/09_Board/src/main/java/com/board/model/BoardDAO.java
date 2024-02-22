package com.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

public class BoardDAO {
	
	//DB와 연결하는 객체
	Connection con = null;
	//DB에 SQL문을 전송하는 객체
	PreparedStatement ps = null;
	//SQL문을 실행한 후에 결과값을 가지고 있는 객체
	ResultSet rs = null;
	//SQL문을 저장할 변수
	String sql = null;
	
	//BoardDAO 객체를 싱글톤 방식으로 만들어 보자
	//1단계: BoardDAO 객체를 정적(static) 멤버로 선언을 해 주어야 한다.
	//static은 객체 생성없이 사용할 수 있는 멤버로 프로그램 시작 시 바로 메모리에 올라간다.
	private static BoardDAO instance = null;
	
	//2단계: 싱글톤 방식으로 객체를 만들기 위해서는 우선적으로
	//		기본생성자의 접근제어자를 public이 아닌 private으로 바꾸어 주어야 한다.
	//		즉, 외부에서 직접적으로 기본생성자를 접근하여 호출하지 못하도록 하는 방법이다.
	
	private BoardDAO() {} //기본생성자
	
	//3단계: 기본 생성자 대신에 싱글턴 객체를 return 해주는 getInstance() 라는 메서드를 만들어서
	//		해당 getInstance() 메서드를 외부에서 접근할 수 있도록 해주면 됨
	
	public static BoardDAO getInstance() {
		
		if(instance == null) {
			instance = new BoardDAO();
		}
		
		return instance;
	} //getInstance() end
	
	//DB 연동하는 작업을 진행하는 메서드
	
	public void openConn() {
		
		try {
			
			//DBCP 방식
			Context initCtx = new InitialContext();
			
			Context Ctx = (Context) initCtx.lookup("java:comp/env");
			
			DataSource ds = (DataSource) Ctx.lookup("jdbc/mysql");
			
			con = ds.getConnection();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//JDBC 방식
//		String driver = "com.mysql.cj.jdbc.Driver";
//		String url = "jdbc:mysql://localhost:3306/psm";
//		String user = "root";
//		String pwd = "1234";
//		
//		try {
//			Class.forName(driver);
//			
//			con = DriverManager.getConnection(url, user, pwd);
//			
//		}catch(Exception e) {
//			e.printStackTrace();
//		}
		
	} //openConn() end
	
	//DB에 연결된 자원을 종료하는 메서드
	public void closeConn(ResultSet rs, PreparedStatement ps, Connection con) {
		
		try {
			
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(con != null) con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	} //closeConn() end
	
	public void closeConn(PreparedStatement ps, Connection con) {
		
		try {
			
			if(rs != null) rs.close();
			if(ps != null) ps.close();
			if(con != null) con.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	} //closeConn() end

	//board 테이블의 전체 게시물의 수를 조회하는 메서드
	
	public int getBoardCount() {
		
		int count = 0;
		
		try {
			openConn();
			
			sql = "select count(*) from board";
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt(1);
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		return count;
	} //getBoardCount() end

	public List<BoardDTO> getBoardList() {
		
		List<BoardDTO> list = new ArrayList<>();
		
		try {
			openConn();
			
			sql = "select * from board order by 1 desc";
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
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
			
		}catch(SQLException e) {
			
		}finally {
			closeConn(rs, ps, con);
		}
		
		return list;
	}

	public int insertBoard(BoardDTO dto) {
		
		int result = 0, count = 0;
		
		try {
			openConn();
			
			sql = "select count(*) from board";
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt(1);
			}
			
			sql = "insert into board values(?, ?, ?, ?, ?, default, now(), null)";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, count + 1);
			ps.setString(2, dto.getBoard_writer());
			ps.setString(3, dto.getBoard_title());
			ps.setString(4, dto.getBoard_cont());
			ps.setString(5, dto.getBoard_pwd());
			
			result = ps.executeUpdate();
			
		}catch(SQLException e){
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		return result;
	}

	public BoardDTO getBoardContent(int board_no) {
		
		BoardDTO dto = null;
		
		try {
			openConn();
			
			sql = "select * from board where board_no = ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, board_no);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				
				dto = new BoardDTO();
				
				dto.setBoard_no(rs.getInt("board_no"));
				dto.setBoard_writer(rs.getString("board_writer"));
				dto.setBoard_title(rs.getString("board_title"));
				dto.setBoard_cont(rs.getString("board_cont"));
				dto.setBoard_pwd(rs.getString("board_pwd"));
				dto.setBoard_hit(rs.getInt("board_hit"));
				dto.setBoard_date(rs.getString("board_date"));
				dto.setBoard_update(rs.getString("board_update"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		return dto;
		
	}

	public int deleteBoard(int board_no, String board_pwd) {
		
		int result = 0;
		
		try {
			openConn();
			
			sql = "select * from board where board_no = ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, board_no);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				
				if(board_pwd.equals(rs.getString("board_pwd"))) {
					
					sql = "delete from board where board_no = ?";
					
					ps = con.prepareStatement(sql);
					
					ps.setInt(1, board_no);
					
					result = ps.executeUpdate();
				}
			}	
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		return result;
	}

	public int modifyBoard(BoardDTO dto) {
		
		int result = 0;
		
		try {
			openConn();
			
			sql = "select * from board where board_no = ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, dto.getBoard_no());
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				
				if(dto.getBoard_pwd().equals(rs.getString("board_pwd"))) {
					
					sql = "update board set board_title = ?, board_cont = ?, board_update = now() "
							+ "where board_no = ?";
					
					ps = con.prepareStatement(sql);
					
					ps.setString(1, dto.getBoard_title());
					ps.setString(2, dto.getBoard_cont());
					ps.setInt(3, dto.getBoard_no());
					
					result = ps.executeUpdate();
				}
				
			}
	
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		return result;
	}

	public void boardHit(int board_no) {
		
		try {
			openConn();
			
			sql = "update board set board_hit = board_hit + 1 where board_no = ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, board_no);
			
			ps.executeUpdate();			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn(ps, con);
		}
		
	}

	public void updateSequence(int board_no) {
		
		try {
			openConn();
			
			sql = "update board set board_no = board_no - 1 where board_no > ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, board_no);
			
			ps.executeUpdate();
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn(ps, con);
		}
		
	}



} //class end












