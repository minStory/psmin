package com.reply.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	
	private static BbsDAO instance = null;
	
	public static BbsDAO getInstance() {
		
		if(instance == null) {
			instance = new BbsDAO();
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

	//jsp_bbs 테이블의 전체 게시물을 조회하는 메서드
	public List<BbsDTO> getBbsList() {
		
		List<BbsDTO> list = new ArrayList<>();
		
		try {
			openConn();
			
			sql = "select * from jsp_bbs order by board_group desc, board_step";
			
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
					
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		return list;
	}
	
	
	
	
} // class end




