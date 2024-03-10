package com.dept.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dept.model.DeptDAO;
import com.dept.model.DeptDTO;

@WebServlet("/list")
public class ListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ListServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Main.jsp 페이지에서 요청
		//전체 부서 목록 이라는 글자를 클릭하면
		//DEPT테이블에 있는 전체 부서 목록을
		//화면에 보여 줘야 한다. -> 요청에 대해 응답
		
		//1단계: DB와 연결 작업을 진행한다.
		DeptDAO dao = new DeptDAO();
		
		//2단계: DB에서 DEPT 테이블의 전체 부서 목록을 조회
		List<DeptDTO> list = dao.list();
		
		
	}

}
