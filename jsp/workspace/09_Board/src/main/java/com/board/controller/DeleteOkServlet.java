package com.board.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.board.model.BoardDAO;

@WebServlet("/delete_ok.go")
public class DeleteOkServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DeleteOkServlet() {
        super();
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		int board_no = Integer.parseInt(request.getParameter("no").trim());
		String board_pwd = request.getParameter("pwd").trim();
		
		BoardDAO dao = BoardDAO.getInstance();
		
		int check = dao.deleteBoard(board_no, board_pwd);
		
		PrintWriter out = response.getWriter();
		out.println("<script>");
		if(check > 0) {
			dao.updateSequence(board_no);
			out.println("alert('게시글 삭제 성공!')");
			out.println("location.href='list.go'");
		}else {
			out.println("alert('게시글 삭제 실패..')");
			out.println("history.back()");
		}
		out.println("</script>");
		
	}

}
