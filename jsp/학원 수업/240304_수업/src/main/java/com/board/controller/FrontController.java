package com.board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.action.Action;
import com.board.action.BoardListAction;

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
		}
		
		RequestDispatcher rd = request.getRequestDispatcher(viewPage);
		
		rd.forward(request, response);
	
	
		
	}

};