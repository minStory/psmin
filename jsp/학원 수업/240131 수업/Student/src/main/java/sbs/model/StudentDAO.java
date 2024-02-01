package sbs.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentDAO {
	Connection con = null;
	
	PreparedStatement ps = null;
	
	ResultSet rs = null;
	
	String sql = null;
	
	public StudentDAO() {
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
		
	}
	
	public List<StudentDTO> selectStudentList(){
		
		List<StudentDTO> list = new ArrayList<>();
		
		try {
			sql = "select * from student order by id asc";
			
			ps = con.prepareStatement(sql);
			
			rs = ps.executeQuery();
			
			while(rs.next()) {
				
				StudentDTO dto = new StudentDTO();
				
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setMajor(rs.getString("major"));
				dto.setPhone(rs.getString("phone"));
				dto.setAddr(rs.getString("addr"));
				dto.setRegdate(rs.getString("regdate"));
				
				list.add(dto);
			}
			
			rs.close();
			ps.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	} //selectStudentList end

	public int insertStudent(StudentDTO dto) {
		
		//insert 여부를 리턴하기 위한 변수
		int result = 0;
		
		try {
			//3단계: 데이터베이스에 전송할 SQL문 작성
			sql = "insert into student values(?,?,?,?,?,curdate())";
			
			//4단계: SQL문을 데이터베이스 전송 객체에 저장
			ps = con.prepareStatement(sql);
			
			//4-1단계: ?(플레이스홀더)에 데이터를 배정
			ps.setString(1, dto.getId());
			ps.setString(2, dto.getName());
			ps.setString(3, dto.getMajor());
			ps.setString(4, dto.getPhone());
			ps.setString(5, dto.getAddr());
			
			//5단계: SQL문을 데이터베이스에 전송 및 실행
			//select : executeQuery() 사용
			//insert, delete, update: executeUpdate() 사용
			result = ps.executeUpdate();
			
			ps.close();
			con.close();
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	} //insertStudent end		

	//학번에 해당하는 학생의 데이터 삭제 메서드
	public int deleteStudent(String studentId) {
		
		//삭제유무를 판단하기 위한 변수, 리턴값을 활용할 목적
		int result = 0;
		
		try {
			//3단계: DB에 전송할 SQL문 작성
			sql = "delete from student where id = ?";
			
			//4단계: SQL문을 데이터베이스 전송 객체 준비
			ps = con.prepareStatement(sql);
			
			//4-1단계: ?(플레이스홀더)에 데이터를 배정
			ps.setString(1, studentId);
		
			//5단계: SQL문을 DB에 전송 및 실행
			result = ps.executeUpdate();
			
			//6단계: DB에 연결되어 있던 자원 종료
			ps.close();
			con.close();
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	} //deleteStudent end

	//학번에 해당하는 학생의 정보를 가져오는 메서드
	public StudentDTO getStudent(String id) {
		
		StudentDTO dto = null;
		
		try {
			//3단계: 데이터베이스에 전송할 SQL문 작성
			sql = "select * from student where id = ?";
			
			//4단계: SQL문을 데이터베이스에 전송할 준비
			ps = con.prepareStatement(sql);
			
			//4-1단계: 플레이스홀더에 값을 매핑
			ps.setString(1, id);
			
			//5단계: SQL문을 데이터베이스에 전송 및 실행
			//일단 불러와야 하기 때문에 select -> executeQuery
			//그 외에는 executeUpdate
			rs = ps.executeQuery();
			
			//1명의 데이터만 조회해서 가져오는 것이므로 while 대신 if 를 사용한다.
			if(rs.next()) { //제목 줄을 제외한 다른 실질 데이터가 있다면
				
				 //학생의 정보를 DTO에 담는다.
				dto = new StudentDTO();
				
				//DB에서 가져와서 DTO에 넣어야 하므로 set메서드를 이용한다.
				dto.setId(rs.getString("id"));
				dto.setName(rs.getString("name"));
				dto.setMajor(rs.getString("major"));
				dto.setPhone(rs.getString("phone"));
				dto.setAddr(rs.getString("addr"));
				dto.setRegdate(rs.getString("regdate"));
				
				rs.close();
				ps.close();
				con.close();
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return dto;
	} //getString(String id) end

	public int UpdateStudent(StudentDTO dto) {
		
		int result = 0;
		
		try {
			//3단계: 데이터베이스에 전송할 SQL문 작성
			sql = "update student set major = ?, phone = ?, addr = ? where id = ?";
			
			//4단계: SQL문을 데이터베이스 전송 객체에 담아서 준비
			ps = con.prepareStatement(sql);
			
			//4-1단계: ?(플레이스홀더)에 데이터를 배정한다.
			ps.setString(1, dto.getMajor());
			ps.setString(2, dto.getPhone());
			ps.setString(3, dto.getAddr());
			ps.setString(4, dto.getId());
			
			//5단계: SQL문을 데이터베이스에 전송 및 실행
			//rs는 select를 통해 하나 이상의 데이터를 조회하여 가져올 때 사용하는 변수
			result = ps.executeUpdate();
			
			//6단계: DB와 연결되어 있던 자원을 종료한다.
			//select, insert, update, delete는 상황에 따라 close()하는 변수의 개수가 다르다.
			ps.close();
			con.close();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
}






