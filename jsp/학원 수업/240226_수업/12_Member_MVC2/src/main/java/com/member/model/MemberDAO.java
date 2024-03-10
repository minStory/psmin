package com.member.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class MemberDAO {
	
		//DB와 연결하는 객체
		Connection con = null;
		//DB에 SQL문을 전송하는 객체
		PreparedStatement ps = null;
		//SQL문을 실행한 후에 결과값을 가지고 있는 객체
		ResultSet rs = null;
		//SQL문을 저장할 변수
		String sql = null;
		
		//MemberDAO 객체를 싱글톤 방식으로 만들어 보자
		//1단계: MemberDAO 객체를 정적(static) 멤버로 선언을 해 주어야 한다.
		//static은 객체 생성없이 사용할 수 있는 멤버로 프로그램 시작 시 바로 메모리에 올라간다.
		private static MemberDAO instance = null;
		
		//2단계: 싱글톤 방식으로 객체를 만들기 위해서는 우선적으로
		//		기본생성자의 접근제어자를 public이 아닌 private으로 바꾸어 주어야 한다.
		//		즉, 외부에서 직접적으로 기본생성자를 접근하여 호출하지 못하도록 하는 방법이다.
		
		private MemberDAO() {} //기본생성자
		
		//3단계: 기본 생성자 대신에 싱글턴 객체를 return 해주는 getInstance() 라는 메서드를 만들어서
		//		해당 getInstance() 메서드를 외부에서 접근할 수 있도록 해주면 됨
		
		public static MemberDAO getInstance() {
			
			if(instance == null) {
				instance = new MemberDAO();
			}
			
			return instance;
		} //getInstance() end
		
		//DB 연동하는 작업을 진행하는 메서드
		
		public void openConn() {
			
			try {
				
				//DBCP 방식
				Context initCtx = new InitialContext();
				
				Context Ctx = (Context) initCtx.lookup("java:comp/env");
				
				DataSource ds = (DataSource) Ctx.lookup("jdbc/mysql");
				
				con = ds.getConnection();
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
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
		
		// 전체 회원 정보를 가져오는 메서드
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
		
		
} //class end
