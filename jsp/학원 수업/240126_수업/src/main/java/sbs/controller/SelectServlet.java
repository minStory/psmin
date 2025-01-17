package sbs.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
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
		
		//2단계: DB에서 student 테이블의 전체 학생 목록 조회
		List<StudentDTO> studentList = dao.selectStudentList();
		
		//3단계: 페이지 이동 시 정보(데이터)를 넘겨 주어야 한다.
		//studentList에 있는 값들을 List라는 이름으로 묶어서 요청 객체에 담는다.
		request.setAttribute("List", studentList);
		
		//4단계: 이동할 페이지 경로를 설정해 주어야 한다.
		RequestDispatcher rd = request.getRequestDispatcher("view/StudentList.jsp");
		
		//5단계: 실제 페이지로 이동 진행
		rd.forward(request, response);
		
	}

}




