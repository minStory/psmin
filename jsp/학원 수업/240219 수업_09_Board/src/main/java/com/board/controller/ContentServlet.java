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
		
		//get방식으로 넘어온 글번호에 해당하는 게시글을
		//Board 테이블에서 조회하여 게시글 상세정보를
		//view page로 이동시키는 비즈니스 로직
		
		int boardNo = Integer.parseInt(request.getParameter("no").trim());
		
		BoardDAO dao = BoardDAO.getInstance();
		
		//조회수를 증가시키는 메서드 호출
		dao.boardHit(boardNo);
		
		BoardDTO cont = dao.boardContent(boardNo);
		
		request.setAttribute("Content", cont);
		
		request.getRequestDispatcher("board/board_content.jsp").forward(request, response);
		
	}

}
