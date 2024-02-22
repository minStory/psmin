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
public class InsertOkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public InsertOkServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
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
		
		int check = dao.insertBoard(dto);
		
		PrintWriter out = response.getWriter();
		out.println("<script>");
		if(check > 0) {
			out.println("alert('게시글 추가 성공!')");
			out.println("location.href='list.go'");
		}else {
			out.println("alert('게시글 추가 실패...')");
			out.println("history.back()");		
		}
		out.println("</script>");
	
	}

}
