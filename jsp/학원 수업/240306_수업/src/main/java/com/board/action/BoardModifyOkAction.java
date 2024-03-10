package com.board.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.model.BoardDAO;
import com.board.model.BoardDTO;

public class BoardModifyOkAction implements Action {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 수정 폼 페이지에서 넘어온 데이터들을
		// DB에 전송하여 게시글을 수정하는 비즈니스 로직
		
		// 히든으로 넘어온 데이터를 받아준다.
		int no = Integer.parseInt(request.getParameter("no").trim());
		String db_pwd = request.getParameter("db_pwd").trim();
		int nowPage = Integer.parseInt(request.getParameter("page").trim());
		
		// 사용자가 입력한 데이터를 받아준다.
		String writer = request.getParameter("writer").trim();
		String title = request.getParameter("title").trim();
		String content = request.getParameter("content").trim();
		String pwd = request.getParameter("pwd").trim();
		
		BoardDTO dto = new BoardDTO();
		
		dto.setBoard_writer(writer);
		dto.setBoard_title(title);
		dto.setBoard_cont(content);
		dto.setBoard_pwd(pwd);
		
		BoardDAO dao = BoardDAO.getInstance();
		
		PrintWriter w = response.getWriter();
		
		if(pwd.equals(db_pwd)) {
			// 비밀번호가 같은 경우
			int check = dao.updateBoard(dto);
			
			w.println("<script>");
			if(check > 0) {
				w.println("alert('게시물 수정 성공!')");
				w.println("location.href='board_content.do?no=" + no + "&page=" + nowPage +"'");
			}else {
				w.println("alert('게시물 수정 실패..')");
				w.println("history.back()");
			}
			w.println("</script>");
		}else {
			// 비밀번호가 틀린 경우
			w.println("<script>");
			w.println("alert('비밀번호가 틀렸습니다!!')");
			w.println("history.back()");
			w.println("</script>");
		}
	}
}
