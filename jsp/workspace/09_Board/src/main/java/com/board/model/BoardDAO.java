package com.board.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
	

	
	
	
	
	
}












