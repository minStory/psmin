package goott;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/member")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MemberServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Ex03.jsp 페이지에서 넘어온 정보들을 받아 주자.
		String member_id = request.getParameter("id");
		String member_pwd = request.getParameter("pwd");
		String member_name = request.getParameter("name");
		String member_phone = request.getParameter("phone");
		String member_addr = request.getParameter("addr");
		
		//응답을 할 때 한글 깨짐 방지 설정
		response.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head></head><body>");
		
		out.println("<div align='center'>");
		out.println("<h2>회원 정보</h2>");
		out.println("<table border='1'>");
		
		
		out.println("<tr>");
		out.println("<th>회원 아이디</th>");
		out.println("<td>"+member_id+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th>회원 비밀번호</th>");
		out.println("<td>"+member_pwd+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th>회원 이름</th>");
		out.println("<td>"+member_name+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th>회원 연락처</th>");
		out.println("<td>"+member_phone+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th>회원 주소</th>");
		out.println("<td>"+member_addr+"</td>");
		out.println("</tr>");
		
		out.println("</body></html>");
		
		
		System.out.println();
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
