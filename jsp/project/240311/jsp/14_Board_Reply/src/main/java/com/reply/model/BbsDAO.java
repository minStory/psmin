package com.reply.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BbsDAO {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String sql = null;

	// BbsDAO 객체를 싱글톤 방식으로 만든다.

	// 1. BbsDAO 객체를 정적(static) 멤버로 선언 해 준다.
	private static BbsDAO instance = null;

	// 2. 기본 생성자를 private 로 선언한다.
	private BbsDAO() {}

	// 3. 기본 생성자 대신 instance 를 return 해 주는 getInstance() 매서드 선언.
	public static BbsDAO getInstance() {

		if (instance == null) {
			instance = new BbsDAO();
		}

		return instance;
	} // getInstance() end.

	
	// JDBC 방식이 아닌 DBCP 방식으로 DB와 연동 작업 진행.
	public void openConn() {

		try {
			
			// 1. JNDI 서버 객체 생성.
			// 자바의 네이밍 서비스(JNDI)에서 이름과 실제 객체를 연결 해 주는 개념이 Context 객체이며
			// , InitialContext 객체는 네이밍 서비스를 이용하기 위한 시작점이 된다.
			Context initCtx = new InitialContext();
			
			// 2. Context 객체를 얻어와야 함.
			// "java:comp/env" 라는 이름의 인수로 Context 객체를 얻어옴.
			// "java:comp/env" 는 현재 웹 애플리케이션에서 네이밍 서비스를 이용시 루트 디렉토리라고 생각하면 됨.
			// 즉, 현재 웹 애플리케이션이 사용 할 수 있는 모든 자원은 "java:comp/env" 아래에 위치를 하게 됨.
			Context ctx = (Context)initCtx.lookup("java:comp/env");
			
			// 3. lookup() 매서드를 이용하여 매칭되는 커넥션을 찾아옴.
			// "java:comp/env" 아래에 위치한 "jdbc/mysql" 자원을 얻어옴
			// 이 자원이 바로 데이터 소스(커넥션 풀)임.
			// 여기서 "jdbc/mysql" 은 context.xml 파일에 추가했던
			// <Resource> 태그 안에 있던 name 속성의 값임.
			DataSource ds = (DataSource)ctx.lookup("jdbc/mysql");
			
			// 4. DataSource 객체를 이용하여 커넥션을 하나 가져오면 됨.
			con = ds.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // openConn() end.

	
	// DB에 연결된 자원을 종료하는 매서드.
	public void closeConn(ResultSet rs, PreparedStatement ps, Connection con) {

		try {

			if (rs != null) rs.close();
			if (ps != null) ps.close();
			if (con != null) con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // closeConn() end.

	public void closeConn(PreparedStatement ps, Connection con) {

		try {

			if (ps != null) ps.close();
			if (con != null) con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // closeConn() end.
	
	
	// jsp_bbs 테이블의 전체 게시물을 조회하는 매서드.
	public List<BbsDTO> getBbsList() {
		
		List<BbsDTO> list = new ArrayList<BbsDTO>();
		
		try {

			openConn();
			
			sql = "select * from jsp_bbs order by board_no desc, board_date asc";
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				BbsDTO dto = new BbsDTO();
				
				dto.setBoard_no(rs.getInt("board_no"));
				dto.setBoard_writer(rs.getString("board_writer"));
				dto.setBoard_title(rs.getString("board_title"));
				dto.setBoard_cont(rs.getString("board_cont"));
				dto.setBoard_pwd(rs.getString("board_pwd"));
				dto.setBoard_hit(rs.getInt("board_hit"));
				dto.setBoard_date(rs.getString("board_date"));
				dto.setBoard_update(rs.getString("board_update"));
				dto.setBoard_group(rs.getInt("board_group"));
				dto.setBoard_step(rs.getInt("board_step"));
				dto.setBoard_indent(rs.getInt("board_indent"));
				
				list.add(dto);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, ps, con);
		}
		
		return list;
	}	// getBbsList() end.
	
	public int getBbsCount() {
		
		int count = 0;
		
		try {
			openConn();
			
			sql = "select count(*) from jsp_bbs where board_step = 0";
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt(1);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		return count;
	}

	public int bbsInsert(BbsDTO dto) {
		
		int result = 0, count = getBbsCount();
		
		try {
			openConn();
			
			sql = "insert into jsp_bbs values(?, ?, ?, ?, ?, default, now(), null, ?, ?, ?)";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, count + 1);
			ps.setString(2, dto.getBoard_writer());
			ps.setString(3, dto.getBoard_title());
			ps.setString(4, dto.getBoard_cont());
			ps.setString(5, dto.getBoard_pwd());
			ps.setInt(6, count + 1);
			ps.setInt(7, 0);
			ps.setInt(8, 0);
			
			result = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(ps, con);
		}
		return result;
	}

	public BbsDTO getBbsContent(int no) {
		
		BbsDTO dto = null;
		
		try {
			openConn();
			
			sql = "select * from jsp_bbs where board_no = ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto = new BbsDTO();
				
				dto.setBoard_no(rs.getInt("board_no"));
				dto.setBoard_writer(rs.getString("board_writer"));
				dto.setBoard_title(rs.getString("board_title"));
				dto.setBoard_cont(rs.getString("board_cont"));
				dto.setBoard_pwd(rs.getString("board_pwd"));
				dto.setBoard_hit(rs.getInt("board_hit"));
				dto.setBoard_date(rs.getString("board_date"));
				dto.setBoard_update(rs.getString("board_update"));
				dto.setBoard_group(rs.getInt("board_group"));
				dto.setBoard_step(rs.getInt("board_step"));
				dto.setBoard_indent(rs.getInt("board_indent"));
				
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		return dto;
	}
	
	public void updateHit(int no) {
		
		try {
			openConn();
			
			sql = "update jsp_bbs set board_hit = board_hit + 1 where board_no = ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			ps.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(ps, con);
		}
	}
	
	public int bbsDelete(int no) {

		int result = 0;
		
		try {
			openConn();
			
			sql = "delete from jsp_bbs where board_no = ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			result = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(ps, con);
		}
		
		return result;
	}
	
	public void updateSequence(int no) {
		
		try {
			openConn();
			
			sql = "update jsp_bbs set board_no = board_no - 1, board_group = board_group - 1 where board_no > ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(ps, con);
		}
	}

	public int bbsReply(BbsReplyDTO dto) {
		
		int result = 0;
		
		try {
			openConn();
			
			sql = "insert into jsp_bbs_reply values(?, ?, ?, ?, now(), default, default)";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, dto.getBoard_group());
			ps.setString(2, dto.getBoard_writer());
			ps.setString(3, dto.getBoard_reply());
			ps.setString(4, dto.getBoard_pwd());
			
			result = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(ps, con);
		}
		
		return result;
	}

	public List<BbsReplyDTO> getBbsContentReply(int no) {
		
		List<BbsReplyDTO> list = new ArrayList<>();
		
		try {
			openConn();
			
			sql = "select * from jsp_bbs_reply where board_group = ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				BbsReplyDTO rDto = new BbsReplyDTO();
				
				rDto.setBoard_group(rs.getInt("board_group"));
				rDto.setBoard_writer(rs.getString("board_writer"));
				rDto.setBoard_reply(rs.getString("board_reply"));
				rDto.setBoard_pwd(rs.getString("board_pwd"));
				rDto.setBoard_date(rs.getString("board_date"));
				rDto.setBoard_step(rs.getInt("board_step"));
				rDto.setBoard_indent(rs.getInt("board_indent"));
				
				list.add(rDto);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		return list;
	}

	public List<Integer> getreplyCount() {
		
		List<Integer> list = new ArrayList<>();
		
		int count = getBbsCount();
		
		try {
			openConn();
			
			for(int i = 1; i <= count; i++) {
				
				sql = "select count(*) from jsp_bbs_reply where board_group = ?";
				
				ps = con.prepareStatement(sql);
				
				ps.setInt(1, i);
				
				rs = ps.executeQuery();
				
				if(rs.next()) {
					list.add(rs.getInt(1));
				}
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(rs,  ps, con);
		}
		
		return list;
	}

	
	
	
}	// class end.
