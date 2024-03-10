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

@WebServlet("/insert.do")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//사원등록 폼 페이지로 넘어가기 전에 담당업무 리스트와
		//관리자 리스트, 부서번호 리스트를 DB에서 조회하여
		//사원 등록 폼 페이지로 해당 데이터를 넘겨주는 비즈니스 로직
		
		//현재 하고있는 프로젝트는 싱글톤 방식이다.
		//따라서 new EmpDAO()를 안쓴다.
		EmpDAO dao = EmpDAO.getInstance(); //이미 EmpDAO 안에 메서드를 만들어 놨다.
		
		System.out.println("insert dao >>> " + dao);
		
		//EMP 테이블에서 담당업무 리스트를 조회해보자
		List<String> jobList = dao.getJobList();
		
		//EMP 테이블에서 관리자 사원 리스트를 조회해보자
		List<EmpDTO> mgrList = dao.getMgrList();
		
		//DEPT 테이블에서 부서 전체 리스트를 조회
		List<DeptDTO> deptList = dao.getDeptList(); 
		
		request.setAttribute("Job", jobList);
		request.setAttribute("Mgr", mgrList);
		request.setAttribute("Dept", deptList);
		
		RequestDispatcher rd = request.getRequestDispatcher("views/emp_insert.jsp");
		
		rd.forward(request, response);
		
		
		
		
		
//		request.setCharacterEncoding("utf-8");
//		response.setContentType("text/html;charset=utf-8");
//		
//		EmpDTO dto = new EmpDTO();
//		
//		dto.setEmpno(Integer.parseInt(request.getParameter("empno").trim()));
//		dto.setEname(request.getParameter("ename").trim());
//		dto.setJob(request.getParameter("job").trim());
//		dto.setMgr(Integer.parseInt(request.getParameter("mgr").trim()));
//		dto.setHiredate(request.getParameter("hiredate").trim());
//		dto.setSal(Integer.parseInt(request.getParameter("sal").trim()));
//		dto.setComm(Integer.parseInt(request.getParameter("comm").trim()));
//		dto.setDeptno(Integer.parseInt(request.getParameter("deptno").trim()));
//
//		EmpDAO dao = EmpDAO.getInstance();
//		
//		int check = dao.insertList(dto);
//		
//		PrintWriter out = response.getWriter();
//		out.println("<script>");
//		if(check > 0) {
//			out.println("alert('사원 추가 완료!')");
//			out.println("location.href='select.do'");
//		}else {
//			out.println("alert('사원 추가 실패..')");
//			out.println("history.back()");
//		}
//		out.println("</script>");
			
	}

}