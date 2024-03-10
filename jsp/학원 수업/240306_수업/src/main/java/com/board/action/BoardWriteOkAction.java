package com.board.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.model.BoardDAO;
import com.board.model.BoardDTO;

public class BoardWriteOkAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// 글쓰기 폼에서 넘어온 데이터들을 받아서
		// board 테이블에 저장하는 비지니스 로직
		
		// 작성자, 제목, 내용, 비밀번호
		String writer = request.getParameter("writer").trim();
		String title = request.getParameter("title").trim();
		String cont = request.getParameter("cont").trim();
		String pwd = request.getParameter("pwd").trim();
		
		// DTO에 넣어서 DB에 insert를 해야한다.
		BoardDTO dto = new BoardDTO();
		dto.setBoard_writer(writer);
		dto.setBoard_title(title);
		dto.setBoard_cont(cont);
		dto.setBoard_pwd(pwd);
		
		BoardDAO dao = BoardDAO.getInstance();
		int check = dao.InsertBoard(dto);
		
		PrintWriter w = response.getWriter();
		w.println("<script>");
		if(check > 0) {
			w.println("alert('게시글 추가 성공!')");
			w.println("location.href='board_list.do'");
		}else {
			w.println("alert('게시글 추가 실패..')");
			w.println("history.back()");
		}
		w.println("</script>");
		
	}

}
