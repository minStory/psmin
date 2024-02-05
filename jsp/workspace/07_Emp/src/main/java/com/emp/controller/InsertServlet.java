package com.emp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.model.EmpDAO;
import com.emp.model.EmpDTO;

@WebServlet("/insert")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		EmpDTO dto = new EmpDTO();
		
		dto.setEmpno(Integer.parseInt(request.getParameter("empno").trim()));
		dto.setEname(request.getParameter("ename").trim());
		dto.setJob(request.getParameter("job").trim());
		dto.setMgr(Integer.parseInt(request.getParameter("mgr").trim()));
		dto.setHiredate(request.getParameter("hiredate").trim());
		dto.setSal(Integer.parseInt(request.getParameter("sal").trim()));
		dto.setComm(Integer.parseInt(request.getParameter("comm").trim()));
		dto.setDeptno(Integer.parseInt(request.getParameter("deptno").trim()));

		EmpDAO dao = EmpDAO.getInstance();
		
		int check = dao.insertList(dto);
		
		PrintWriter out = response.getWriter();
		out.println("<script>");
		if(check > 0) {
			out.println("alert('사원 추가 완료!')");
			out.println("location.href='select.do'");
		}else {
			out.println("alert('사원 추가 실패..')");
			out.println("history.back()");
		}
		out.println("</script>");
			
	}

}
