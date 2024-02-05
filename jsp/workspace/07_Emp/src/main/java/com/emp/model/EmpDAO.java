package com.emp.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmpDAO {

	Connection con = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String sql = null;
	
	//EmpDAO 객체를 싱글톤 방식으로 만들어보자.
	//1단계: EmpDAO 객체를 정적(static) 멤버로 선언을 해주어야 한다.
	private static EmpDAO instance = null;
	
	//2단계: 싱글톤 방식으로 객체를 만들기 위해서는 우선적으로
	//		기본 생성자의 접근제어자를 public이 아닌
	//		private으로 바꿔주어야 한다.
	//		즉, 외부에서 직접적으로 기본생성자를 접근하여
	//		호출하지 못하도록 하는 방법
	public static EmpDAO getInstance() {
		
		if(instance == null) {
			instance = new EmpDAO();
		}
		return instance;
	} //getInstance() 메서드 end
	
	//DB 연동하는 메서드 생성
	public void openConn() {
		
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
		
	} //openConn() end
	
	//DB에 연결된 자원을 종료하는 메서드(자원이 3개일 때)
	public void closeConn(ResultSet rs, PreparedStatement ps, Connection con) {
		
		try {
			//open한 역순으로 close 실행
			if(rs != null) {
				rs.close();
			}
			if(ps != null) {
				ps.close();
			}
			if(con != null) {
				con.close();				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	
	//DB에 연결된 자원을 종료하는 메서드(자원이 2개일 때)
	public void closeConn(PreparedStatement ps, Connection con) {
		
		try {
			//open한 역순으로 close 실행
			if(ps != null) {
				ps.close();
			}
			if(con != null) {
				con.close();				
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	} //closeConn() end

	public List<EmpDTO> allList() {
		
		List<EmpDTO> list = new ArrayList<>();
		
		openConn();
		
		try {
			sql = "select * from emp";
			ps = con.prepareStatement(sql);
			rs = ps.executeQuery();
			
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
				
				list.add(dto);
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);			
		}
		
		return list;
	} //allList() end

	public int deleteList(int empno) {
		
		int result = 0;
		
		openConn();
		
		try {
			sql = "delete from emp where empno = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, empno);
			result = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn(ps, con);
		}
		
		return result;
		
	}

	public int insertList(EmpDTO dto) {
		
		int result = 0;
		
		openConn();
		
		try {
			sql = "insert into emp values(?, ?, ?, ?, ?, ?, ?, ?)";
			ps = con.prepareStatement(sql);
			ps.setInt(1, dto.getEmpno());
			ps.setString(2, dto.getEname());
			ps.setString(3, dto.getJob());
			ps.setInt(4, dto.getMgr());
			ps.setString(5, dto.getHiredate());
			ps.setInt(6, dto.getSal());
			ps.setInt(7, dto.getComm());
			ps.setInt(8, dto.getDeptno());
			result = ps.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn(ps, con);
		}
		
		return result;
	}
	
	
} //class end