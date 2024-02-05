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
		//JSP 나머지
		//1. EL, JSTL 사용법
		//2. 게시판 구현(CRUD)
		//3. 댓글 구현
		//4. 페이징(고난이도)
		
		//웹프로젝트
		//1. 프로젝트(백엔드 초간단 쇼핑몰)
		// - 게시판, 댓글, 페이징, 장바구니, 상품등록, 검색
		// - 나머지는 팀프로젝트(프론트 포함)
		
		//2. 스프링(방식, 문법)
		// - 스프링 프로젝트
		
		//포트폴리오
		//스프링을 활용한
		//게시판 작성
		//페이징 처리
		//세션 처리
		
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
	
	//부서 조회
	public List<DeptDTO> selectList(){
		
		//여러개의 DTO를 담기 위해 DeptDTO 타입 리스트 생성
		List<DeptDTO> list = new ArrayList<>();
		
		try {
			//sql문 작성
			sql = "select * from dept";
			
			//sql문을 ps 객체에 대입
			ps = con.prepareStatement(sql);
			
			//sql문을 대입한 ps 객체를 실제로 실행하여 그 결과를 rs 객체에 대입 
			rs = ps.executeQuery();
			
			//next()를 통하여 rs객체의 첫줄(컬럼명) 건너뛰기
			while(rs.next()) {
				//dto 객체 생성
				DeptDTO dto = new DeptDTO();
				
				//rs.get메서드로 매개변수(컬럼명)에 해당하는 값을 불러온 후
				//dto의 setter메서드로 값 설정
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
				
				//list의 하나의 dto 객체 추가
				list.add(dto);
			} // -> rs.next()가 null일 때까지 반복
			
			//사용한 자원 반환
			rs.close();
			ps.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
		return list;
	}

	//부서 삭제
	public int deleteList(int deptno) {
		
		int result = 0 ;
		
		try {
			sql = "delete from dept where deptno = ?";
			ps = con.prepareStatement(sql);
			ps.setInt(1, deptno);
			result = ps.executeUpdate();
			
			ps.close();
			con.close();
						
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	//부서 삽입
	public int insertList(DeptDTO dto) {
		
		//insert 여부를 리턴하기 위한 변수
		int result = 0;
		
		try {
			//sql문 작성
			sql = "insert into dept values(?, ?, ?)";
			
			//sql문을 전송 객체에 저장
			ps = con.prepareStatement(sql);
			
			//플레이스홀더에 데이터 배정
			ps.setInt(1, dto.getDeptno());
			ps.setString(2, dto.getDname());
			ps.setString(3, dto.getLoc());
			
			//sql문 전송 및 실행 후 result에 결과 대입
			result = ps.executeUpdate();
			
			//사용한 자원 반환
			ps.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}

	//부서 수정
	public DeptDTO updateList(int deptno) {
		
		DeptDTO dto = new DeptDTO();
		
		try {
			//sql문 작성
			sql = "select * from dept where deptno = ?";
			
			//sql문을 전송 객체에 저장
			ps = con.prepareStatement(sql);
			
			//플레이스홀더에 데이터 배정
			ps.setInt(1, deptno);
			
			//sql문 전송 및 실행 후 rs 객체에 저장
			rs = ps.executeQuery();
			
			//1명의 데이터만 가져오는 것이므로 while 대신 if 사용
			//제목(컬럼)줄을 제외한 다른 데이터가 있다면
			if(rs.next()) {
				
				//rs 객체안에 해당 컬럼의 값을 dto 객체의 setter메서드를 이용하여 설정한다.
				dto.setDeptno(rs.getInt("deptno"));
				dto.setDname(rs.getString("dname"));
				dto.setLoc(rs.getString("loc"));
			}
			
			//사용한 자원 반환
			rs.close();
			ps.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return dto;
	}

	//부서 수정 확인
	public int UpdateCheck(DeptDTO dto) {
		
		//insert여부를 리턴하기 위한 변수
		int result = 0;
		
		try {
			//sql문 작성
			sql = "update dept set dname = ?, loc = ? where deptno = ?";
			
			//sql문을 전송 객체에 저장
			ps = con.prepareStatement(sql);
			
			//플레이스홀더에 데이터 배정
			ps.setString(1, dto.getDname());
			ps.setString(2, dto.getLoc());
			ps.setInt(3, dto.getDeptno());
			
			//sql문 전송 및 실행 후 그 결과를 변수에 대입
			result = ps.executeUpdate();
			
			//사용한 자원 반환
			ps.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
}








