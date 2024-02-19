package com.emp.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.model.EmpDAO;
import com.emp.model.EmpDTO;

@WebServlet("/content.do")
public class ContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ContentServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int empno = Integer.parseInt(request.getParameter("no").trim());
		
		EmpDAO dao = EmpDAO.getInstance();
		
		EmpDTO dto = new EmpDTO();
		
		dto = dao.showContent(empno);
		
		request.setAttribute("DTO", dto);
		
		System.out.println(dto.getEmpno());
		
		RequestDispatcher rd = request.getRequestDispatcher("views/emp_content.jsp");
		
		rd.forward(request, response);
	}

}
