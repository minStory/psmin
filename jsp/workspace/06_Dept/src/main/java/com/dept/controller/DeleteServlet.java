package com.dept.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dept.model.DeptDAO;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		DeptDAO dao = new DeptDAO();
		
		//jsp파일에서 넘어온 no 변수를 대입
		int deptno = Integer.parseInt(request.getParameter("deptno").trim());
		
		//삭제 여부를 리턴하여 check에 대입
		int check = dao.deleteList(deptno);
		
		PrintWriter out = response.getWriter();
		out.println("<script>");
		if(check > 0) {
			out.println("alert('부서 삭제 완료!')");
			out.println("location.href='select'");
		}else {
			out.println("alert('부서 삭제 실패..')");
			out.println("history.back");
		}
		out.println("</script>");
		
	}

}