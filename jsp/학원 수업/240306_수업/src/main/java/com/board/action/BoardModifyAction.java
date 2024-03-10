package com.board.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.model.BoardDAO;
import com.board.model.BoardDTO;

public class BoardModifyAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get 방식으로 넘어온 글번호에 해당하는 게시글을
		// board 테이블에서 조회하여 수정 폼페이지로
		// 이동시키는 비즈니스 로직
		
		int no = Integer.parseInt(request.getParameter("no").trim());
		int nowPage = Integer.parseInt(request.getParameter("page").trim());
		
		BoardDAO dao = BoardDAO.getInstance();
		
		BoardDTO dto = dao.getBoardContent(no);
		
		request.setAttribute("Content", dto);
		request.setAttribute("Page", nowPage);
	}
	

}
