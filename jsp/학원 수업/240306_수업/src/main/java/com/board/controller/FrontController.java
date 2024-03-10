package com.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.action.Action;
import com.board.action.BoardContentAction;
import com.board.action.BoardListAction;
import com.board.action.BoardModifyAction;
import com.board.action.BoardModifyOkAction;
import com.board.action.BoardWriteOkAction;

@WebServlet("/FrontController")
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public FrontController() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String uri = request.getRequestURI();
		
		String path = request.getContextPath();
		
		String command = uri.substring(path.length() + 1);
		
		System.out.println("Path >>> " + command);
		
		Action action = null;
		
		String viewPage = null;
		
		if(command.equals("board_list.do")){
			action = new BoardListAction();
			action.execute(request, response);
			viewPage = "boards/board_list.jsp";
		} else if(command.equals("board_write_ok.do")) {
			action = new BoardWriteOkAction();
			action.execute(request, response);
		} else if(command.equals("board_content.do")) {
			action = new BoardContentAction();
			action.execute(request, response);
			viewPage = "boards/board_content.jsp";
		} else if(command.equals("board_modify.do")) {
			action = new BoardModifyAction();
			action.execute(request, response);
			viewPage = "boards/board_modify.jsp";
		} else if(command.equals("board_modify_ok.do")) {
			action = new BoardModifyOkAction();
			action.execute(request, response);
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(viewPage);
		
		if(rd != null) {
			request.getRequestDispatcher(viewPage).forward(request, response);
		}
	
		
	}

};