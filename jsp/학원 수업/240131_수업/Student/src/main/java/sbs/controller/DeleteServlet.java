package sbs.controller;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import sbs.model.StudentDAO;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//get방식으로 넘어온 학번에 해당하는 학생을 DB에서 삭제하는 비즈니스 로직
		
		//한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		//해당 학생의 학번을 받아주어야 한다.
		String studentId = request.getParameter("no").trim();
		
		//학번을 가지고 DB에서 데이터를 삭제하려면 DAO가 필요하다
		StudentDAO dao = new StudentDAO();
		
		//해당 학생의 데이터가 삭제된 유무를 체크할 수 있는 변수를 사용
		//dao를 통해 DB에서 학번에 해당하는 데이터를 삭제 및 확인하는 메서드
		int check = dao.deleteStudent(studentId);
		
		PrintWriter out = response.getWriter();
		if(check > 0) {
			out.println("<script>");
			out.println("alert('학생 삭제 성공!')");
			out.println("location.href='select'");
			out.println("</script>");
		}else {
			out.println("<script>");
			out.println("alert('학생 삭제 실패..')");
			out.println("history.go(-1)");
			out.println("</script>");
		}
		
	}

}
