package com.board.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.model.BoardDAO;
import com.board.model.BoardDTO;

@WebServlet("/search.go")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public SearchServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String keyword = request.getParameter("keyword");
		String field = request.getParameter("field");
		
		BoardDAO dao = BoardDAO.getInstance();
		
		List<BoardDTO> list = dao.searchList(keyword, field);
		
		request.setAttribute("List", list);
		
		request.getRequestDispatcher("board/board_searchList.jsp").forward(request, response);
		
	}

}
