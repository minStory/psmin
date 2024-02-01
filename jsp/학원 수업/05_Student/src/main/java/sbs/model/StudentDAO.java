package sbs.model;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
import java.sql.*;

//DAO(Data Access Object)
// - 데이터 접근 객체 -> DB에 접속(연동)하는 객체
// - DAO란 데이터베이스에 접속해서 데이터를 추가, 수정, 삭제, 조회 등의 작업을 하는 클래스
// - 일반적으로 JSP 또는 Servlet에서 위의 작업들을 같이 사용할 수 있지만,
//   코드의 모듈화 등을 위해서 일반적으로 DAO 클래스를 따로 만들어서 사용한다.
public class StudentDAO {
	
	//DB와 연동하는 객체
	Connection con = null;
	
	//DB에 SQL문을 전송하는 객체
	PreparedStatement ps = null;
	
	//SQL문을 실행한 후에 결과값을 가지고 있는 객체
	ResultSet rs = null;
	
	//쿼리문을 저장할 객체
	String sql = null;

	public StudentDAO() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String url = "jdbc:mysql://localhost:3306/your_database_name";
        String user = "your_user";
        String password = "your_password";

        try {
            //1단계: mysql 드라이버를 메모리로 로딩 작업
            Class.forName(driver);

            //2단계: mysql 데이터베이스와 연결 작업
            con = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
    } //기본생성자 end
	
	//여기부터 MVC 코딩 구역
	
	
}
	
	
	

