package com.emp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.model.DeptDTO;
import com.emp.model.EmpDAO;
import com.emp.model.EmpDTO;

@WebServlet("/update.do")
public class UpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		EmpDAO dao = EmpDAO.getInstance();
		
		int empno = Integer.parseInt(request.getParameter("num").trim());
		
		EmpDTO dto = dao.updateEmp(empno);
		
		List<String> jobList = dao.getJobList();
		
		List<EmpDTO> mgrList = dao.getMgrList();
		
		List<DeptDTO> deptList = dao.getDeptList();
		
		request.setAttribute("jobList", jobList);
		request.setAttribute("mgrList", mgrList);
		request.setAttribute("deptList", deptList);
		request.setAttribute("Modify", dto);
		
		RequestDispatcher rd = request.getRequestDispatcher("views/emp_modify.jsp");
		
		rd.forward(request, response);
		
	}

}
