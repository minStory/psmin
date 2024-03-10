package com.dept.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
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
	public List<DeptDTO> list() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}