package com.member.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.member.action.Action;
import com.member.action.MemberContentAction;
import com.member.action.MemberDeleteAction;
import com.member.action.MemberDeleteOkAction;
import com.member.action.MemberInsertAction;
import com.member.action.MemberInsertOkAction;
import com.member.action.MemberListAction;
import com.member.action.MemberModifyAction;
import com.member.action.MemberModifyOkAction;
import com.member.action.MemberSearchAction;

public class FrontController extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public FrontController() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 한글 처리 작업 진행
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		// getRequestURI(): "/프로젝트명/파일명(*.do)" 라는 문자열을 반환해주는 메서드
		String uri = request.getRequestURI();
		System.out.println("URI >>> " + uri) ;
		
		// getContextPath(): 현재 프로젝트명을 문자열로 반환해주는 메서드
		String path = request.getContextPath();
		System.out.println("PATH >>> " + path);
		
		String command = uri.substring(path.length() + 1);
		System.out.println("COMMAND >>> " + command);
		
		//Action 인터페이스를 구현한 객체를 만들기 위해 일단 선언
		Action action = null;
		
		if(command.equals("select")) {
			action = new MemberListAction();	
		} else if(command.equals("insert")) {
			action = new MemberInsertAction();
		} else if(command.equals("insert_ok")) {
			action = new MemberInsertOkAction();
		} else if(command.equals("content")) {
			action = new MemberContentAction();
		} else if(command.equals("modify")) {
			action = new MemberModifyAction();
		} else if(command.equals("modify_ok")) {
			action = new MemberModifyOkAction();
		} else if(command.equals("delete")) {
			action = new MemberDeleteAction();
		} else if(command.equals("delete_ok")) {
			action = new MemberDeleteOkAction();
		} else if(command.equals("search")){
			action = new MemberSearchAction();
		}
					
		if(action.execute(request, response) != null) {
			
			String viewPage = action.execute(request, response);
			
			RequestDispatcher rd = request.getRequestDispatcher(viewPage);
		
			rd.forward(request, response);
		}
		
	}

}





