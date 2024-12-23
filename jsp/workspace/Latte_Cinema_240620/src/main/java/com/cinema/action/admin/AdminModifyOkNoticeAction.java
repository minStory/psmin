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

public class AdminModifyOkNoticeAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String admin_writer_no = request.getParameter("writerno");
		String admin_writer_id = request.getParameter("writerid");
		String notice_title = request.getParameter("title");
		String notice_content = request.getParameter("content");
		
		int notice_no = Integer.parseInt(request.getParameter("no"));
		
		NoticeBoardDTO dto = new NoticeBoardDTO();
		
		dto.setNotice_board_writer_no(admin_writer_no);
		dto.setNotice_board_writer_id(admin_writer_id);
		dto.setNotice_board_title(notice_title);
		dto.setNotice_board_content(notice_content);
		dto.setNotice_board_no(notice_no);
		
		LatteDAO dao = LatteDAO.getInstance();
		
		int check = dao.updateNotice(dto);
		
		PrintWriter out = response.getWriter();
		
		if(check > 0) {
			out.println("<script>");
			out.println("alert('공지사항 수정 성공!!!')");
			out.println("location.href='admin_main'");
			out.println("</script>");
		}else {
			out.println("<script>");
			out.println("alert('공지사항 수정 실패')");
			out.println("history.back()");
			out.println("</script>");
		}
		return null;
	}

}
