package com.cinema.action.mypage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;

public class InquiryDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int history_no = Integer.parseInt(request.getParameter("no").trim());

		LatteDAO dao = LatteDAO.getInstance();

		int check = dao.deleteInquiry(history_no);

		PrintWriter out = response.getWriter();

		if (check > 0) {
			dao.updateSequence(history_no);

			out.println("<script>");
			out.println("alert('문의사항 삭제 성공!!!')");
			out.println("location.href='mypage'");
			out.println("</script>");

		} else {
			out.println("<script>");
			out.println("alert('문의사항 삭제 실패~~~')");
			out.println("history.back()");
			out.println("</script>");
		}

		return null;
	}

}
