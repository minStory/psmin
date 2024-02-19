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

@WebServlet("/insert_ok.do")
public class insertOkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public insertOkServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		
		//1~2단계: emp_insert.jsp 페이지에서 넘어온 데이터들을 받아와서
		//			dto 객체의 값을 셋팅한다.
		EmpDTO dto = new EmpDTO();
		
		dto.setEmpno(Integer.parseInt(request.getParameter("num").trim()));
		dto.setEname(request.getParameter("name"));
		dto.setJob(request.getParameter("job"));
		dto.setMgr(Integer.parseInt(request.getParameter("mgr").trim()));
		dto.setSal(Integer.parseInt(request.getParameter("sal").trim()));
		dto.setComm(Integer.parseInt(request.getParameter("comm").trim()));
		dto.setDeptno(Integer.parseInt(request.getParameter("deptno").trim()));
		
		EmpDAO dao = EmpDAO.getInstance();
		
		int check = dao.insertEmp(dto);
		
		PrintWriter out = response.getWriter();
		out.println("<script>");
		if(check > 0) {
			out.println("alert('사원 추가 성공!')");
			out.println("location.href='select.do'");
		}else {
			out.println("alert('사원 추가 실패')");
			out.println("history.back()");
		}
		out.println("</script>");
		
	}

}
