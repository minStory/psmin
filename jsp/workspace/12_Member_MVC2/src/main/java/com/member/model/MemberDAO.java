package com.member.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {

	Connection con = null;
	
	PreparedStatement ps = null;
	
	ResultSet rs = null;
	
	String sql = null;
	
	private static MemberDAO instance = null;
	
	public static MemberDAO getInstance() {
		
		if(instance == null) {
			instance = new MemberDAO();
		}
		
		return instance;
	}
	
	public void openConn(){
		
		try {
		
			Context InitCtx = new InitialContext();
			
			Context Ctx = (Context) InitCtx.lookup("java:comp/env");
			
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
	
	public List<MemberDTO> getMemberList(){
		
		List<MemberDTO> list = new ArrayList<>();
		
		try {
			openConn();
			
			sql = "select * from member order by num desc";
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				MemberDTO dto = new MemberDTO();
				
				dto.setNum(rs.getInt("num"));
				dto.setMemid(rs.getString("memid"));
				dto.setMemname(rs.getString("memname"));
				dto.setPwd(rs.getString("pwd"));
				dto.setAge(rs.getInt("age"));
				dto.setMileage(rs.getInt("mileage"));
				dto.setJob(rs.getString("job"));
				dto.setAddr(rs.getString("addr"));
				dto.setRegdate(rs.getString("regdate"));
				
				list.add(dto);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		return list;
	}
			
	
	
	
	
}









