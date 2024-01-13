package goott;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/result")
public class resultServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public resultServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	request.setCharacterEncoding("utf-8");
	response.setContentType("text/html; charset=utf-8");
	
	
	PrintWriter out = response.getWriter();
	
	String name = request.getParameter("name");
	int kor_score = Integer.parseInt(request.getParameter("kor"));
	int eng_score = Integer.parseInt(request.getParameter("eng"));
	int math_score = Integer.parseInt(request.getParameter("math"));
	
	int total = kor_score + eng_score + math_score;
	double avg = total / 3.0;
	
	String grade;
	
	if(avg>=90) {
		grade = "A학점";
	} else if(avg>=80) {
		grade = "B학점";
	} else if(avg>=70) {
		grade = "C학점";
	} else if(avg>=60) {
		grade = "D학점";
	} else {
		grade = "F학점";
	}
	
	out.println("<html><head></head><body>");
	
	out.println("<div align='center'>");
	out.println("<hr width='30%' color='red'>");
	out.println("<h2>성적표</h2>");
	out.println("<hr width='30%' color='red'>");
	out.println("<table border='1' width=300>");
	
	
	out.println("<tr>");
	out.println("<th width=200>학생 이름</th>");
	out.println("<td width=100 align='center'>"+name+"</td>");
	out.println("</tr>");
	
	out.println("<tr>");
	out.println("<th>국어점수</th>");
	out.println("<td width=100 align='center'>"+kor_score+"</td>");
	out.println("</tr>");
	
	out.println("<tr>");
	out.println("<th>영어점수</th>");
	out.println("<td width=100 align='center'>"+eng_score+"</td>");
	out.println("</tr>");
	
	out.println("<tr>");
	out.println("<th>수학점수</th>");
	out.println("<td width=100 align='center'>"+math_score+"</td>");
	out.println("</tr>");
	
	out.println("<tr>");
	out.println("<th>총점</th>");
	out.println("<td width=100 align='center' bgcolor='#81BEF7'>"+total+"</td>");
	out.println("</tr>");
	
	out.println("<tr>");
	out.println("<th>평균</th>");
	out.println("<td width=100 align='center' bgcolor='#FFFF66'>"+String.format("%.2f", avg)+"</td>");
	out.println("</tr>");
	
	out.println("<tr>");
	out.println("<th>학점</th>");
	out.println("<td width=100 align='center' bgcolor='#AAFF66' style='color:red'><b>"+grade+"</b></td>");
	out.println("</tr>");
	
	
	out.println("</table></div>");
	out.println("</body></html>");
	
	
	
	
	
	
	
	
	
//	out.println("이름 : " + name + "<br/>");
//	out.println("국어 : " + kor_score);
//	out.println("영어 : " + eng_score);
//	out.println("수학 : " + math_score);
//	out.println("총점 : " + total);
//	out.println("평균 : " + avg);
//	
	
	}

}
