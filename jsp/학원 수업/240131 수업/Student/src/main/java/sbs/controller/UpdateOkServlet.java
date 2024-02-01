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

@WebServlet("/studentUpdateOk")
public class UpdateOkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateOkServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//수정 폼 페이지에서 넘어온 데이터들을 DB에 저장하는 비즈니스 로직
		//수정 폼 페이지에는 한글로 입력된 내용이 있으므로 한글 깨짐 방지 코드를 넣는다.
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//1단계: 수정 폼 페이지에서 넘어온 데이터들을 받아주어야 한다.
		String id = request.getParameter("id").trim();
		String name = request.getParameter("name").trim();
		String major = request.getParameter("major").trim();
		String phone = request.getParameter("phone").trim();
		String addr = request.getParameter("addr").trim();
		
		//2단계: 데이터베이스에 전송할 DTO객체의 setter메서드에 수정 폼에서 넘어온 정보들을 인자로 넘겨준다.
		StudentDTO dto = new StudentDTO();
		dto.setId(id);
		dto.setName(name);
		dto.setMajor(major);
		dto.setPhone(phone);
		dto.setAddr(addr);
		
		//3단계: DTO객체를 만들었으니 DAO객체를 통해 DB에 접근하여 처리한다.
		StudentDAO dao = new StudentDAO();
		
		int check = dao.UpdateStudent(dto);
		
		PrintWriter out = response.getWriter();
		
		if(check > 0) {
			out.println("<script>");
			out.println("alert('학생 수정 성공!')");
			out.println("location.href='select'");
			out.println("</script>");
		}else {
			out.println("<script>");
			out.println("alert('학생 수정 실패..')");
			out.println("history.back");
			out.println("</script>");
		}
	}

}
