package sbs.model;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

//DAO(Data Access Object)
// - 데이터 접근 객체 -> DB에 접속(연동)하는 객체
// - DAO란 데이터베이스에 접속해서 데이터를 추가, 수정, 삭제, 조회 등의 작업을 하는 클래스
// - 일반적으로 JSP 또는 Servlet에서 위의 작업들을 같이 사용할 수 있지만,
//   코드의 모듈화 등을 위해서 일반적으로 DAO 클래스를 따로 만들어서 사용한다.
public class StudentDAO {

	// DB와 연동하는 객체
	Connection con = null;

	// DB에 SQL문을 전송하는 객체
	PreparedStatement ps = null;

	// SQL문을 실행한 후에 결과값을 가지고 있는 객체
	ResultSet rs = null;

	// 쿼리문을 저장할 객체
	String sql = null;

	public StudentDAO() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/hms";
		String user = "root";
		String password = "1234";

		try {
			// 1단계: mysql 드라이버를 메모리로 로딩 작업
			Class.forName(driver);

			// 2단계: mysql 데이터베이스와 연결 작업
			con = DriverManager.getConnection(url, user, password);

		} catch (Exception e) {
			e.printStackTrace();
		}
	} // 기본생성자 end

	// 여기부터 MVC 코딩 구역

	// student 테이블에서 학생 전체 목록을 조회하는 메서드
	// selectStudentList()를 통하여 DB에서 조회된 자료를 List에 담아 리턴한다.
	// 단, List에는 StudentDTO 객체가 들어가 있다. -> 제네릭
	public List<StudentDTO> selectStudentList() {

		// ArrayList를 생성한다. -> 조회된 자료를 저장할 곳을 만드는 작업
		List<StudentDTO> list = new ArrayList<>();

		try {
			//3단계: 데이터베이스에 전송할 SQL문 작성
			//student 테이블에서 화면을 내림차순하여 모든 데이터를 조회해와라
			sql = "select * from student order by id desc";

			//4단계: SQL문을 데이터베이스 전송 객체에 저장
			ps = con.prepareStatement(sql);

			//5단계: SQL문을 데이터베이스에 전송 및 실행
			rs = ps.executeQuery();
			
			while(rs.next()) {
				StudentDTO dto = new StudentDTO();
				
				//실행하여 조회된 데이터를 DTO객체에 넣기 위한 코드
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setMajor(rs.getString("major"));
				dto.setPhone(rs.getString("phone"));
				dto.setAddress(rs.getString("address"));
				dto.setRegdate(rs.getString("regdate"));
				
				list.add(dto);
			}
			
			//6단계: DB와 연결되어 있던 자원 종료 -> 역순으로 종료
			rs.close();
			ps.close();
			con.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
	
	}

}













