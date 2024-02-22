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

@WebServlet("/modify_ok.go")
public class ModifyOkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public ModifyOkServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int board_no = Integer.parseInt(request.getParameter("num").trim());
		String board_writer = request.getParameter("writer").trim();
		String board_title = request.getParameter("title").trim();
		String board_content = request.getParameter("content").trim();
		String board_pwd = request.getParameter("pwd").trim();
		
		BoardDTO dto = new BoardDTO();
		dto.setBoard_no(board_no);
		dto.setBoard_writer(board_writer);
		dto.setBoard_title(board_title);
		dto.setBoard_cont(board_content);
		dto.setBoard_pwd(board_pwd);
		
		BoardDAO dao = BoardDAO.getInstance();
		int check = dao.modifyBoard(dto);
		
		PrintWriter out = response.getWriter();
		out.println("<script>");
		if(check > 0) {
			out.println("alert('게시글 수정 성공!')");
			out.println("location.href='list.go'");
		}else {
			out.println("alert('게시글 수정 실패...')");
			out.println("history.back()");
		}
		out.println("</script>");
		
		
	}

}
