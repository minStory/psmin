package goott;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Adder1Servlet")
public class Adder1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Adder1Servlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int su1 = Integer.parseInt(request.getParameter("num1"));
		int su2 = Integer.parseInt(request.getParameter("num2"));
		
		// 응답시 한글 깨짐 방지 설정
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		out.println("<html><head></head><body>");
		out.println("<h2>두 수의 합 >>> " + (su1+su2) + "<h2>");
		out.println("</body></html>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	}

}
