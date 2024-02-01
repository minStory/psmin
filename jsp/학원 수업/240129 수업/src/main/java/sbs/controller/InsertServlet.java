package sbs.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sbs.model.StudentDAO;
import sbs.model.StudentDTO;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//student insert.jsp 페이지에서 넘어온 학생등록 관련 정보들
		//student 테이블에 저장하는 비지니스 로직
		
		//요청과 응답에 대한 한글 깨짐 방지 처리 작업
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		//1단계: 학생 등록 폼 페이지에서 넘어온 데이터들을 받아주어야 한다.
		String studentId = request.getParameter("id").trim(); //.trim() 앞뒤 공백 제거
		String studentName = request.getParameter("name").trim();
		String studentMajor = request.getParameter("major").trim();
		String studentPhone = request.getParameter("phone").trim();
		String studentAddr = request.getParameter("addr").trim();
		
		//2단계: DTO 객체에 폼 페이지에서 넘어온 데이터들을 저장해 주어야 한다.
		//즉, 변수들을 DTO에 넣는다.
		StudentDTO dto = new StudentDTO();
		dto.setId(studentId);
		dto.setName(studentName);
		dto.setMajor(studentMajor);
		dto.setPhone(studentPhone);
		dto.setAddr(studentAddr);
		
		//3단계: DTO 객체를 DB에 전송해 주면 된다.
		//전송하려면 DAO 객체가 있어야 한다.
		StudentDAO dao = new StudentDAO();
		
		int check = dao.insertStudent(dto); //dto객체를 DB에 넣기 위해 insertStudent의 매개변수로 활용한다.
		
		//테스트 코드
		System.out.print(check);
		
		PrintWriter out = response.getWriter();
		if(check > 0) {
			out.println("<script>");
			out.println("alert('학생 등록 성공!')");
			out.println("location.href='select'");
			out.println("</script>");
		}else {
			out.println("<script>");
			out.println("alert('학생 등록 실패..')");
			out.println("history.back");
			out.println("</script>");
		}
		
		
	}

}









