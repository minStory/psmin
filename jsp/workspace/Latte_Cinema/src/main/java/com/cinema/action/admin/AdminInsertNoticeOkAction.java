package com.cinema.action.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.NoticeBoardDTO;

public class AdminInsertNoticeOkAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String board_writer_no = request.getParameter("board_writer_no").trim();
		String board_writer_id = request.getParameter("board_writer_id").trim();
		String board_title = request.getParameter("board_title").trim();
		String board_content = request.getParameter("board_content").trim();
		NoticeBoardDTO dto = new NoticeBoardDTO();
		
		dto.setNotice_board_writer_no(board_writer_no);
		dto.setNotice_board_writer_id(board_writer_id);
		dto.setNotice_board_title(board_title);
		dto.setNotice_board_content(board_content);
		
		LatteDAO dao = LatteDAO.getInstance();
		
		int check = dao.adminInsertNoticeBoard(dto);
		
		PrintWriter out = response.getWriter();
		
		if(check>0) {
			out.println("<script>");
			out.println("alert('게시글 추가 성공!!!')");
			out.println("location.href = 'admin_main'");
			out.println("</script>");
		}else {
			out.println("<script>");
			out.println("alert('게시글 추가 실패!!!')");
			out.println("history.back()");
			out.println("</script>");

		}
		return null;
	}

}
