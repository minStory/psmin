package goott;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public LoginServlet2() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		String userId = request.getParameter("id"); //text type이므로 문자로 넘어옴.
		String userPwd = request.getParameter("pwd");
		
		System.out.println("입력받은 아이디 >>> " + userId);
		System.out.println("입력받은 비밀번호 >>> " + userPwd);
	
		out.println("<html><head></head><body><div align='center'>");
		out.println("<h2>회원 정보</h2>");
		out.println("<h3>");
		out.println("아이디 : " + userId + "<br>");
		out.println("비밀번호 : " + userPwd + "<br>");
		out.println("</h3>");
		out.println("</div></body></html>");
	
	}

}
