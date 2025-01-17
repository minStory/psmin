package sbs.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sbs.model.StudentDAO;
import sbs.model.StudentDTO;

@WebServlet("/select")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SelectServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//main.jsp 페이지에서 요청 대응
		// -> 학생 테이블에 있는 학생 전체 리스트를 보여달라고 요청
		
		//1단계: DB와 연결 작업 진행
		//1단계 시 준비 작업
		// - DAO(Data Access Object) 객체 준비
		// - DTO(Data Transfer Object) 객체 준비
		StudentDAO dao = new StudentDAO();
		StudentDTO dto = new StudentDTO();
		
		
	}

}
