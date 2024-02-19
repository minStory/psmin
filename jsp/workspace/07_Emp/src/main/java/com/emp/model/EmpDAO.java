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


	public List<String> getJobList() {
		
		//리스트에 담당업무 글자를 넣기 위해 객체를 생성한다.
		List<String> list = new ArrayList<>();
		
		//드라이버 로딩 및 데이터베이스와 연동 작업 진행
		openConn();
		
		try {
			//emp테이블에서 job을 중복없이 가져오면서 job을 기준으로 오름차순 정렬
			sql = "select distinct(job) from emp order by job";
			
			//SQL문을 데이터베이스 전송 객체에 인자로 전달
			ps = con.prepareStatement(sql);
			
			//SQL문을 DB에 전송 및 실행
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				//rs가 가져온 job을 list에 추가한다.
				list.add(rs.getString("job"));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		
		return list;
	}//getJobList() end
	
	//EMP 테이블에서 관리자를 조회하는 메서드
	public List<EmpDTO> getMgrList() {
		
		List<EmpDTO> list = new ArrayList<>();
		
		openConn();
		
		try {
			
			//EMP 테이블에서 관리자를 중복없이 검색 후
			//관리자번호에 해당하는 사람의 모든 정보를 가져와라
			sql = "select * from emp where empno in (select distinct(mgr) from emp)";
			
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
	} //getMgrList() end
	
	//DEPT 테이블의 전체 부서 리스트를 조회하는 메서드
	public List<DeptDTO> getDeptList() {
		
		List<DeptDTO> list = new ArrayList<>();
		
		openConn();
		
		try {
			sql = "select * from dept order by deptno";
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				//DEPT 테이블 정보를 dto(객체)로 만들어서 리턴할 예정
				DeptDTO dto = new DeptDTO();
				
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				
				list.add(dto);
			}
		}catch(SQLException e) {
			
		}finally {
			closeConn(rs, ps, con);
		}
		
		return list;
	}
	
	
	
	
	
	

	public EmpDTO showContent(int empno) {
		
		EmpDTO dto = new EmpDTO();
		
		openConn();
		
		try {
			sql = "select * from emp where empno = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, empno);
			System.out.println(empno+"ㅋㅋ");
			rs = ps.executeQuery();
			
			if(rs.next()) {
				
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getString("job"));
				dto.setMgr(rs.getInt("mgr"));
				dto.setHiredate(rs.getString("hiredate"));
				dto.setSal(rs.getInt("sal"));
				dto.setComm(rs.getInt("comm"));
				dto.setDeptno(rs.getInt("deptno"));
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}finally {
			closeConn(rs, ps, con);
		}
		
		return dto;
	}

	public int deleteList(int empno) {
		return 0;
	}


} //class end