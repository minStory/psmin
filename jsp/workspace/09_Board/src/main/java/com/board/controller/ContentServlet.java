package com.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.model.BoardDAO;
import com.board.model.BoardDTO;

@WebServlet("/content.go")
public class ContentServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ContentServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int board_no = Integer.parseInt(request.getParameter("board_no").trim());
		
		BoardDAO dao = BoardDAO.getInstance();
		
		dao.boardHit(board_no);
				
		BoardDTO content = dao.getBoardContent(board_no);
		
		request.setAttribute("Content", content);
		
		request.getRequestDispatcher("board/board_cont.jsp").forward(request, response);		
		
	}

}
