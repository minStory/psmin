package com.dept.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dept.model.DeptDAO;
import com.dept.model.DeptDTO;

@WebServlet("/updateCheck")
public class UpdateCheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateCheckServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//한글 깨짐 방지 처리
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//jsp파일에서 넘어온 변수를 대입
		int deptno = Integer.parseInt(request.getParameter("deptno").trim());
		String dname = request.getParameter("dname");
		String loc = request.getParameter("loc");
		
		//dto의 setter메서드를 통해 변수 대입
		DeptDTO dto = new DeptDTO();
		dto.setDeptno(deptno);
		dto.setDname(dname);
		dto.setLoc(loc);
		
		DeptDAO dao = new DeptDAO();
		
		//수정 여부 리턴하여 check 변수 대입
		int check = dao.UpdateCheck(dto);
		
		PrintWriter out = response.getWriter();
		out.println("<script>");
		if(check > 0) {
			out.println("alert('부서 수정 완료!')");
			out.println("location.href='select'");
		}else {
			out.println("alert('부서 수정 실패..')");
			out.println("history.go(-1)");
		}
		out.println("</script>");
	}

}