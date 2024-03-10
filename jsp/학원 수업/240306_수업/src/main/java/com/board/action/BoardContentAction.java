package com.board.action;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.model.BoardDAO;
import com.board.model.BoardDTO;

public class BoardContentAction implements Action{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// get방식으로 넘어온 글 번호에 해당하는 게시글이
		// 상세내역을 board 테이블에서 조회하여 게시글이
		// 상세내역을 view page로 이동시키는 비즈니스 로직
		
		int no = Integer.parseInt(request.getParameter("no").trim());
		int nowPage = Integer.parseInt(request.getParameter("page").trim());
		
		BoardDAO dao = BoardDAO.getInstance();
		
		// 글 제목 클릭 시 조회 수 증가시켜주는 메서드 호출
		// 클릭 수는 리턴받을 필요가 없다. 바로 업데이트 되기 때문에
		dao.boardHit(no);
		
		// 글 번호에 해당하는 게시글의 상세내역을 조회하는 메서드 호출
		// dto에 담아서 가져 와야 한다.
		
		BoardDTO dto = dao.getBoardContent(no);
		
		request.setAttribute("Content", dto);
		request.setAttribute("Page", nowPage);
		
	}
	
	

}
