package com.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.model.BoardDAO;
import com.board.model.BoardDTO;

@WebServlet("/modify.go")
public class ModifyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ModifyServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int board_no = Integer.parseInt(request.getParameter("board_no").trim());
		
		BoardDAO dao = BoardDAO.getInstance();
		
		BoardDTO modify = dao.getBoardContent(board_no);
		
		request.setAttribute("Modify", modify);
		
		request.getRequestDispatcher("board/board_modify.jsp").forward(request, response);
				
	}

}
