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
		//DB와 연동하기 위한 DAO 객체 생성
		DeptDAO dao = new DeptDAO();
		
		//여러개의 DeptDTO 타입 객체를 담기 위해 list 객체 생성
		//list 객체에 DAO의 코딩구역의 조회 메서드 대입
		List<DeptDTO> list = dao.selectList();
		
		//jsp파일로 보내기 위해 request에 list 객체리스트 할당(Key -> List)
		request.setAttribute("List", list);
		
		//jsp파일의 경로 설정
		RequestDispatcher rd = request.getRequestDispatcher("views/DeptList.jsp");
		
		//설정한 경로로 이동시킨다.
		rd.forward(request, response);
	}
}
