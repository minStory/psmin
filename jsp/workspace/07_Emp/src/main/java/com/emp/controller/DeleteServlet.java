package com.emp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.model.EmpDAO;

@WebServlet("/delete.do")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int empno = Integer.parseInt(request.getParameter("num").trim());
		
		EmpDAO dao = EmpDAO.getInstance();
		
		int check = dao.deleteEmp(empno);
		
		PrintWriter out = response.getWriter();
		out.println("<script>");
		if(check > 0) {
			out.println("alert('사원 삭제 성공!')");
			out.println("location.href='select.do'");
		}else {
			out.println("alert('사원 삭제 실패..')");
			out.println("history.back");
		}
		out.println("</script>");
		
	}

}
