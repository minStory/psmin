package com.upload.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class UploadDAO {

	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String sql = "";

	// UploadDAO 객체를 싱글톤 방식으로 만든다.

	// 1. UploadDAO 객체를 정적(static) 멤버로 선언 해 준다.
	private static UploadDAO instance = null;

	// 2. 기본 생성자를 private 로 선언한다.
	private UploadDAO() {}

	// 3. 기본 생성자 대신 instance 를 return 해 주는 getInstance() 매서드 선언.
	public static UploadDAO getInstance() {

		if (instance == null) {
			instance = new UploadDAO();
		}

		return instance;
	} // getInstance() end.

	
	// JDBC 방식이 아닌 DBCP 방식으로 DB와 연동 작업 진행.
	public void openConn() {

		try {
			
			// 1. JNDI 서버 객체 생성.
			// 자바의 네이밍 서비스(JNDI)에서 이름과 실제 객체를 연결 해 주는 개념이 Context 객체이며
			// , InitialContext 객체는 네이밍 서비스를 이용하기 위한 시작점이 된다.
			Context initCtx = new InitialContext();
			
			// 2. Context 객체를 얻어와야 함.
			// "java:comp/env" 라는 이름의 인수로 Context 객체를 얻어옴.
			// "java:comp/env" 는 현재 웹 애플리케이션에서 네이밍 서비스를 이용시 루트 디렉토리라고 생각하면 됨.
			// 즉, 현재 웹 애플리케이션이 사용 할 수 있는 모든 자원은 "java:comp/env" 아래에 위치를 하게 됨.
			Context ctx = (Context)initCtx.lookup("java:comp/env");
			
			// 3. lookup() 매서드를 이용하여 매칭되는 커넥션을 찾아옴.
			// "java:comp/env" 아래에 위치한 "jdbc/mysql" 자원을 얻어옴
			// 이 자원이 바로 데이터 소스(커넥션 풀)임.
			// 여기서 "jdbc/mysql" 은 context.xml 파일에 추가했던
			// <Resource> 태그 안에 있던 name 속성의 값임.
			DataSource ds = (DataSource)ctx.lookup("jdbc/mysql");
			
			// 4. DataSource 객체를 이용하여 커넥션을 하나 가져오면 됨.
			con = ds.getConnection();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	} // openConn() end.

	
	// DB에 연결된 자원을 종료하는 매서드.
	public void closeConn(ResultSet rs, PreparedStatement pstmt, Connection con) {

		try {

			if (rs != null) rs.close();
			if (pstmt != null) pstmt.close();
			if (con != null) con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // closeConn() end.

	public void closeConn(PreparedStatement pstmt, Connection con) {

		try {

			if (pstmt != null) pstmt.close();
			if (con != null) con.close();

		} catch (SQLException e) {
			e.printStackTrace();
		}
	} // closeConn() end.
	
	
	// upload 테이블에서 전체 데이터를 조회하는 매서드.
	public List<UploadDTO> getUploadList() {
		
		List<UploadDTO> list = new ArrayList<UploadDTO>();
		
		
		try {
			openConn();
			
			sql = "select * from upload "
					+ " order by upload_no desc";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				
				UploadDTO dto = new UploadDTO();
				
				dto.setUpload_no(rs.getInt("upload_no"));
				dto.setUpload_writer(rs.getString("upload_writer"));
				dto.setUpload_title(rs.getString("upload_title"));
				dto.setUpload_cont(rs.getString("upload_cont"));
				dto.setUpload_pwd(rs.getString("upload_pwd"));
				dto.setUpload_file(rs.getString("upload_file"));
				dto.setUpload_hit(rs.getInt("upload_hit"));
				dto.setUpload_date(rs.getString("upload_date"));
				dto.setUpload_update(rs.getString("upload_update"));
				
				list.add(dto);
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		
		return list;
	}  // getUploadList() 메서드 end
	
	
	// upload 테이블에 게시글을 추가해 주는 메서드.
	public int insertUpload(UploadDTO dto) {
		
		int result = 0, count = 0;
		
		
		try {
			openConn();
			
			sql = "select max(upload_no) from upload";
			
			pstmt = con.prepareStatement(sql);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				
				count = rs.getInt(1) + 1;
			}
			
			sql = "insert into upload values(?, ?, ?, ?, ?, ?, default, now(), null)";
			
			pstmt = con.prepareStatement(sql);
			
			
			pstmt.setInt(1, count);
			pstmt.setString(2, dto.getUpload_writer());
			pstmt.setString(3, dto.getUpload_title());
			pstmt.setString(4, dto.getUpload_cont());
			pstmt.setString(5, dto.getUpload_pwd());
			pstmt.setString(6, dto.getUpload_file());
			
			result = pstmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			closeConn(rs, pstmt, con);
		}
		
		return result;
	}  // insertUpload() 메서드 end

	// upload 테이블의 게시글의 조회수를 증가시켜 주는 메서드.
    public void uploadHit(int no) {
        
        
        try {
            openConn();
            
            sql = "update upload set "
                    + " upload_hit = upload_hit + 1 "
                    + " where upload_no = ?";
            
            pstmt = con.prepareStatement(sql);
            
            pstmt.setInt(1, no);
            
            pstmt.executeUpdate();
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConn(pstmt, con);
        }
        
    }  // uploadHit() 메서드 end

    // upload 테이블의 글번호에 해당하는 게시글의
    // 상세내역을 조회하는 메서드
	public UploadDTO uploadContent(int upload_no) {
		
		UploadDTO dto = null;
		
		try {
			openConn();
			
		
			sql = "select * from upload where upload_no = ?";
			
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, upload_no);
			
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
                
                dto = new UploadDTO();
                
                dto.setUpload_no(rs.getInt("upload_no"));
                dto.setUpload_writer(rs.getString("upload_writer"));
                dto.setUpload_title(rs.getString("upload_title"));
                dto.setUpload_cont(rs.getString("upload_cont"));
                dto.setUpload_pwd(rs.getString("upload_pwd"));
                dto.setUpload_file(rs.getString("upload_file"));
                dto.setUpload_hit(rs.getInt("upload_hit"));
                dto.setUpload_date(rs.getString("upload_date"));
                dto.setUpload_update(rs.getString("upload_update"));
                
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConn(rs, pstmt, con);
        }
        
        return dto;
			
		
		
	}
	
	
	
}
