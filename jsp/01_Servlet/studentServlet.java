package goott;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/student")
public class studentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public studentServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		//method="get" 또는 method="post" 모두 다 가능한것이 service() 메서드이다.
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		
		PrintWriter out = response.getWriter();
		
		String student_num = request.getParameter("num");
		String student_name = request.getParameter("name");
		String student_major = request.getParameter("major");
		int student_age = Integer.parseInt(request.getParameter("age"));
		String student_phone = request.getParameter("phone");
		String[] student_subjects = request.getParameterValues("subject");
		
		
		out.println("<html><head></head><body>");
		
		out.println("<div align='center'>");
		out.println("<h2>회원 정보</h2>");
		out.println("<table border='1'>");
		
		
		out.println("<tr>");
		out.println("<th>학생 학번</th>");
		out.println("<td>"+student_num+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th>회원 이름</th>");
		out.println("<td>"+student_name+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th>학생 나이</th>");
		out.println("<td>"+student_age+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th>학생 연락처</th>");
		out.println("<td>"+student_phone+"</td>");
		out.println("</tr>");
		
		out.println("<tr>");
		out.println("<th>전공 과목</th>");
		out.println("<td>" + Arrays.toString(student_subjects));
		out.println("</tr>");
		out.println("</table></div>");
		out.println("</body></html>");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		out.println("학번 : " + student_num + "<br/>");
//		out.println("이름 : " + student_name + "<br/>");
//		out.println("학과 : " + student_major+ "<br/>");
//		out.println("나이 : " + student_age+ "<br/>");
//		out.println("학번 : " + student_phone+ "<br/>");
//		out.println("전공 : " + Arrays.toString(student_subjects));
//		for(int i=0; i<student_subjects.length; i++) {
//		out.println("전공 : " + student_subjects[i]+"&nbsp;");
//		}
		
		
	
	}

}
