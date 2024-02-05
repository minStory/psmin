package com.dept.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dept.model.DeptDAO;
import com.dept.model.DeptDTO;

@WebServlet("/update")
public class UpdateScreenServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public UpdateScreenServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		DeptDAO dao = new DeptDAO();
		
		//jsp파일에서 넘어온 no 변수를 대입
		int deptno = Integer.parseInt(request.getParameter("no").trim());
		
		//변수를 이용하여 조회한 데이터를 dto에 저장
		DeptDTO dto = dao.updateList(deptno);
		
		//request 객체에 dto 저장(Key -> DTO)
		request.setAttribute("DTO", dto);
		
		//전송 경로 설정
		RequestDispatcher rd = request.getRequestDispatcher("views/dept_update.jsp");
		
		//실제 전송
		rd.forward(request, response);		
	}

}
