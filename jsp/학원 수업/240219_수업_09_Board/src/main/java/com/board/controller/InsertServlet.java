package com.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.model.BoardDAO;
import com.board.model.BoardDTO;

@WebServlet("/insert_ok.go")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//게시판 글 작성 폼 페이지에서 넘어온 데이터들을
		//DB의 board 테이블에 저장하는 비즈니스 로직
		
		//한글 깨짐 방지 작업 설정
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		//1단계: 게시글 입력 폼 페이지에서 넘어온 데이터들을 받아주자
		String boardWriter = request.getParameter("writer").trim();
		String boardTitle = request.getParameter("title").trim();
		String boardContent = request.getParameter("content").trim();
		String boardPwd = request.getParameter("pwd").trim();
		
		//2단계: 1단계에서 넘어온 데이터들을 DTO 객체에 저장해주자
		BoardDTO dto = new BoardDTO();
		
		dto.setBoard_writer(boardWriter);
		dto.setBoard_title(boardTitle);
		dto.setBoard_cont(boardContent);
		dto.setBoard_pwd(boardPwd);
		
		BoardDAO dao = BoardDAO.getInstance();
		
		//3단계: DTO 객체를 DB에 전송해 주어야 함
		int check = dao.boardInsert(dto);
		
		PrintWriter out = response.getWriter();
		out.println("<script>");
		if(check > 0) {
			out.println("alert('게시글 추가 성공!')");
			out.println("location.href='list.go'");
		}else {
			out.println("alert('게시글 추가 실패..')");
			out.println("history.back()");
		}
		out.println("</script>");
	}

}
