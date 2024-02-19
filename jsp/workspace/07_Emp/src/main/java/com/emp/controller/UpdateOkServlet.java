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

@WebServlet("/update_ok.do")
public class UpdateOkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateOkServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int empno =Integer.parseInt( 
				request.getParameter("num").trim());
		String ename = request.getParameter("name");
		String job = request.getParameter("job");
		int mgr = Integer.parseInt(
				request.getParameter("mgr").trim());
		int sal = Integer.parseInt(
				request.getParameter("sal").trim());
		int comm = Integer.parseInt(
				request.getParameter("comm").trim());
		int deptno = Integer.parseInt(
				request.getParameter("dept").trim());
		
		EmpDTO dto = new EmpDTO();
		
		dto.setEmpno(empno);
		dto.setEname(ename);
		dto.setJob(job);
		dto.setMgr(mgr);
		dto.setSal(sal);
		dto.setComm(comm);
		dto.setDeptno(deptno);
		
		EmpDAO dao = EmpDAO.getInstance();
		
		int check = dao.updateOkEmp(dto);
		
		PrintWriter out = response.getWriter();
		out.println("<script>");
		if(check > 0) {
			out.println("alert('사원 수정 성공!')");
			out.println("location.href='select.do'");
		}else {
			out.println("alert('사원 수정 실패')");
			out.println("history.back()");
		}
		out.println("</script>");
	
	}

}
