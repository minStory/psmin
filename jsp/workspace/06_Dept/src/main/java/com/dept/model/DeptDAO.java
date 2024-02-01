package com.dept.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DeptDAO {
	
	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String sql = null;
	
	public DeptDAO() {
		
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/psm";
		String user = "root";
		String pwd = "1234";
		
		try {
			Class.forName(driver);
			
			con = DriverManager.getConnection(url, user, pwd);
		}catch(Exception e) {
			e.printStackTrace();
		}
				
	} //기본생성자 end
	
	//DAO 코딩 구역
	
	//전체 목록 조회
	public List<DeptDTO> selectList(){
		
		List<DeptDTO> list = new ArrayList<>();
		
		try {
			sql = "select * from dept";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				DeptDTO dto = new DeptDTO();
				
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				
				list.add(dto);
			}
			
			rs.close();
			ps.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}

	//목록 삭제
	public int deleteList(String deptno) {
		
		int result = 0 ;
		
		try {
			sql = "delete from dept where deptno = ?";
			ps = con.prepareStatement(sql);
			ps.setString(1, deptno);
			result = ps.executeUpdate();
			
			ps.close();
			con.close();
						
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}








