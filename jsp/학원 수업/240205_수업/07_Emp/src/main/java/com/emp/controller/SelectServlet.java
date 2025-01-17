package com.emp.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.emp.model.EmpDAO;
import com.emp.model.EmpDTO;

@WebServlet("/select.do")
public class SelectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public SelectServlet() {
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//DB에 접속해서 EMP 테이블의 전체 사원 목록을
		//조회 후 가져와서 views page로 이동시키는 비즈니스 로직
		
		//DB와 드라이버 로딩 및 데이터베이스 접속 진행
		//싱글톤 방식으로 EMPDAO 객체 생성
		EmpDAO dao = EmpDAO.getInstance();
		
		//확인
		System.out.println("list dao >>> " + dao);
		
		//emp 테이블에서 전체 사원 리스트를 조회하는 메서드 호출
		List<EmpDTO> list = dao.allList();
		
		RequestDispatcher rd = request.setAttribute("List", list);
		
		rd.forward(request, response);
		
	}

}
