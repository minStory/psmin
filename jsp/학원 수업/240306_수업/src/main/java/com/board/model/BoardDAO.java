package com.board.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class BoardDAO {

	Connection con = null;
	
	PreparedStatement ps = null;
	
	ResultSet rs = null;
	
	String sql = null;
	
	private static BoardDAO instance = null;
	
	public static BoardDAO getInstance() {
		
		if(instance == null) {
			instance = new BoardDAO();
		}
		
		return instance;
	}
	
	public void openConn() {
		
		try {
			
			Context initCtx = new InitialContext();
			
			Context Ctx = (Context) initCtx.lookup("java:comp/env");
			
			DataSource ds = (DataSource) Ctx.lookup("jdbc/mysql");
			
			con = ds.getConnection();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void closeConn(ResultSet rs, PreparedStatement ps, Connection con) {		
		
		try {
			
			if(rs != null) {
				rs.close();
			}
			if(ps != null) {
				ps.close();
			}
			if(con != null) {
				con.close();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public void closeConn(PreparedStatement ps, Connection con) {		
		
		try {
			
			if(ps != null) {
				ps.close();
			}
			if(con != null) {
				con.close();
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public int getBoardCount() {
		
		int count = 0;
		
		try {
			openConn();
			
			sql = "select count(*) from board";
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				// 검색된 결과 값은 1개 이므로 1로 지정한다.
				count = rs.getInt(1);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(ps, con);
		}
		
		return count;
	}
	
	// board 테이블에서 현재 페이지에 해당하는 게시물을 조회하는 메서드
	public List<BoardDTO> getBoardList(int page, int rowsize){
		
		List<BoardDTO> list = new ArrayList<>();
		
		// 해당 페이지에서 시작 번호
		int startNo = (page * rowsize) - (rowsize - 1);
		
		// 해당 페이지에서 끝 번호
		int endNo = (page * rowsize);
		
		try {
			openConn();
			
			// 오라클에서는 row_number() 함수가 있으나
			// mysql에서는 지원하지 않아 코딩으로 페이지를 검색한다.
//			sql = "SELECT * FROM (SELECT @row_number:=@row_number+1 AS rnum, b.* " +
//				      "FROM board b, (SELECT @row_number:=0) AS dummy " +
//				      "ORDER BY board_no DESC) AS subquery " +
//				      "WHERE rnum >= ? AND rnum <= ?";
			
			sql = "SELECT * FROM (SELECT @row_number:=@row_number+1 AS rnum, b.* " +
				      "FROM board b, (SELECT @row_number:=0) AS dummy " +
				      "ORDER BY board_no DESC) AS subquery " +
				      "WHERE rnum >= ? AND rnum <= ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, startNo);
			ps.setInt(2, endNo);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				BoardDTO dto = new BoardDTO();
				
				dto.setBoard_cont(rs.getString("board_cont"));
				dto.setBoard_date(rs.getString("board_date"));
				dto.setBoard_hit(rs.getInt("board_hit"));
				dto.setBoard_no(rs.getInt("board_no"));
				dto.setBoard_pwd(rs.getString("board_pwd"));
				dto.setBoard_title(rs.getString("board_title"));
				dto.setBoard_update(rs.getString("board_update"));
				dto.setBoard_writer(rs.getString("board_writer"));
				
				list.add(dto);				
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		return list;
	}

	public int InsertBoard(BoardDTO dto) {
		
		int result = 0, count = 0;
		
		try {
			openConn();
			
			sql = "select max(board_no) from board";
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt(1);
			}
			
			sql = "insert into board(board_no, board_writer, board_title, board_cont, board_pwd)"
					+ " values (?, ?, ?, ?, ?)";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, count + 1);
			ps.setString(2, dto.getBoard_writer());
			ps.setString(3, dto.getBoard_title());
			ps.setString(4, dto.getBoard_cont());
			ps.setString(5, dto.getBoard_pwd());
			
			result = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		return result;
	}

	// board 테이블의 게시글 번호에 해당하는 게시글의
	// 조회수를 증가시켜주는 메서드
	public void boardHit(int no) {
		
		try {
			openConn();
			
			sql = "update board set board_hit = board_hit + 1 where board_no = ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(ps, con);
		}
	}

	// board 테이블에서 게시글 번호에 해당하는 게시글을
	// 조회하는 메서드
	public BoardDTO getBoardContent(int no) {
		
		BoardDTO dto = null;
		
		try {
			openConn();
			
			sql = "select * from board where board_no = ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, no);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				dto = new BoardDTO();
				
				dto.setBoard_cont(rs.getString("board_cont"));
				dto.setBoard_date(rs.getString("board_date"));
				dto.setBoard_hit(rs.getInt("board_hit"));
				dto.setBoard_no(rs.getInt("board_no"));
				dto.setBoard_pwd(rs.getString("board_pwd"));
				dto.setBoard_title(rs.getString("board_title"));
				dto.setBoard_update(rs.getString("board_update"));
				dto.setBoard_writer(rs.getString("board_writer"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		return dto;
	}

	public int updateBoard(BoardDTO dto) {
		
		int result = 0;
		
		try {
			openConn();
			
			sql = "update board set board_title = ?, board_cont = ?, board_update = now() where board_no = ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setString(1, dto.getBoard_title());
			ps.setString(2, dto.getBoard_cont());
			ps.setInt(3, dto.getBoard_no());
			
			result = ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(ps, con);
		}
		
		return result;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}