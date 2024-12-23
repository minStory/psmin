package com.cinema.action.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;

public class AdminDeleteNoticeOkAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int notice_no = Integer.parseInt(request.getParameter("noticeNo").trim());
		
		LatteDAO dao = LatteDAO.getInstance();
		
		int deleteNotice = dao.adminDeleteNotice(notice_no);
		
		PrintWriter out = response.getWriter();

		if (deleteNotice > 0) {
			dao.deleteNoticeNoSequence(notice_no);
			out.println("<script>");
			out.println("alert('공지사항 삭제 성공')");
			out.println("location.href = 'admin_main'");
			out.println("</script>");
			out.close();
		} else {
			out.println("<script>");
			out.println("alert('공지사항 삭제 실패')");
			out.println("history.back()");
			out.println("</script>");
			out.close();
		}

		
		return null;
	}

}
