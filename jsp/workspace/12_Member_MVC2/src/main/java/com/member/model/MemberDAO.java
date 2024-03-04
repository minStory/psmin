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
	
	// 페이징 처리 없이 리스트 출력
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
	
	//페이징 처리하여 리스트 출력 (오버로딩)
	public List<MemberDTO> getMemberList(int page, int rowSize) {
		
		List<MemberDTO> list = new ArrayList<>();
		
		// 해당 페이지에서 시작 번호
		int startNo = (page * rowSize) - (rowSize - 1);
		
		// 해당 페이지에서 끝 번호
		int endNo = (page * rowSize);
		
		try {
			
			openConn();
			
			sql = "select * from (select @row_number:=@row_number+1 as rnum, m.* from member as m, (select @row_number:=0) as dummy order by num desc) as subquery where rnum >= ? and rnum <= ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, startNo);
			ps.setInt(2, endNo);
			
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
	
	public int memberInsert(MemberDTO dto) {
		
		int result = 0, count = 0;
		
		try {
			openConn();
			
			sql = "select max(num) from member";
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				count = rs.getInt(1);
			}

			sql = "insert into member values(?, ?, ?, ?, ?, ?, ?, ?, now())";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, count + 1);
			ps.setString(2, dto.getMemid());
			ps.setString(3, dto.getMemname());
			ps.setString(4, dto.getPwd());
			ps.setInt(5, dto.getAge());
			ps.setInt(6, dto.getMileage());
			ps.setString(7, dto.getJob());
			ps.setString(8, dto.getAddr());
			
			result = ps.executeUpdate();

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		return result;
	}
	
	public MemberDTO getMemberContent(int num) {
		
		MemberDTO dto = null;
		
		try {
			openConn();
			
			sql = "select * from member where num = ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, num);
			
			rs = ps.executeQuery();
			
			if(rs.next()) {
				
				dto = new MemberDTO();
				
				dto.setNum(rs.getInt("num"));
				dto.setMemid(rs.getString("memid"));
				dto.setMemname(rs.getString("memname"));
				dto.setPwd(rs.getString("pwd"));
				dto.setAge(rs.getInt("age"));
				dto.setMileage(rs.getInt("mileage"));
				dto.setJob(rs.getString("job"));
				dto.setAddr(rs.getString("addr"));
				dto.setRegdate(rs.getString("regdate"));
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		return dto;
	}

	public int memberModify(MemberDTO dto) {
		
		int result = 0;
		
		try {
			openConn();
			
			sql = "select pwd from member where num = ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, dto.getNum());
			
			rs = ps.executeQuery();
			
			String temp = null;
			
			if(rs.next()) {
				temp = rs.getString(1);
			}
			
			System.out.println("설정된 비번 >>> " + temp);
			
			if(temp.equals(dto.getPwd())) {
				
				sql = "update member set memname = ?, age = ?, job = ?, addr = ? where num = ?";
				
				ps = con.prepareStatement(sql);
				
				ps.setString(1, dto.getMemname());
				ps.setInt(2, dto.getAge());
				ps.setString(3, dto.getJob());
				ps.setString(4, dto.getAddr());
				ps.setInt(5, dto.getNum());
				
				result = ps.executeUpdate();
			}else {
				
				result = -1;
			}
			
		}catch(Exception e) {
			
		}finally {
			closeConn(rs, ps, con);
		}
		return result;
	}
	
	public int memberDelete(int num, String pwd) {
		
		int result = 0;
		
		try {
			openConn();
			
			sql = "select pwd from member where num = ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, num);
			
			rs = ps.executeQuery();
			
			String temp = null;
			
			if(rs.next()) {
				temp = rs.getString(1); 
			}
			
			System.out.println("설정된 비번 >>> " + temp);
			
			if(temp.equals(pwd)) {
				
				sql = "delete from member where num = ?";
				
				ps = con.prepareStatement(sql);
				
				ps.setInt(1, num);
				
				result = ps.executeUpdate();
				
			}else {
				
				result = -1;
			}
					
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		return result;
		
	}
	
	// 삭제 시 회원번호 정렬
	public void updateSequence(int num) {
		
		try {
			openConn();
			
			sql = "update member set num = num - 1 where num > ?";
			
			ps = con.prepareStatement(sql);
			
			ps.setInt(1, num);
			
			ps.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			closeConn(ps, con);
		}	
	}
	
	public List<MemberDTO> memberSearch(String field, String keyword) {
		
		List<MemberDTO> list = new ArrayList<>();
		
		try {
			openConn();
			
			if(field.equals("id")) {
				sql = "select * from member where memid like ? order by memid desc";
				ps = con.prepareStatement(sql);
				ps.setString(1, "%" + keyword + "%");
			} else if(field.equals("name")) {
				sql = "select * from member where memname like ? order by memid desc";
				ps = con.prepareStatement(sql);
				ps.setString(1, "%" + keyword + "%");
			} else if(field.equals("job")) {
				sql = "select * from member where job like ? order by memid desc";
				ps = con.prepareStatement(sql);
				ps.setString(1, "%" + keyword + "%");
			} else if(field.equals("addr")) {
				sql = "select * from member where addr like ? order by memid desc";
				ps = con.prepareStatement(sql);
				ps.setString(1, "%" + keyword + "%");
			}
			
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
	
	public int getMemberCount() {
		
		int count = 0;
		
		try {
			openConn();
			
			sql = "select count(*) from member";
			
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
	
	
}









