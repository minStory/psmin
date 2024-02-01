package com.dept.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dept.model.DeptDAO;
import com.dept.model.DeptDTO;

@WebServlet("/select")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SelectServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DeptDAO dao = new DeptDAO();
		
		List<DeptDTO> list = dao.selectList();
		
		request.setAttribute("List", list);
		
		RequestDispatcher rd = request.getRequestDispatcher("views/DeptList.jsp");
		
		rd.forward(request, response);
		
	}
}
