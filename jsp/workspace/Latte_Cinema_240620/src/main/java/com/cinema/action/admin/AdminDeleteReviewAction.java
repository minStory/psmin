package com.cinema.action.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;

public class AdminDeleteReviewAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int reviewNo = Integer.parseInt(request.getParameter("no").trim());
		int MovieNo = Integer.parseInt(request.getParameter("MovieNo").trim());
		LatteDAO dao = LatteDAO.getInstance();
		
		int DeleteCheck = dao.adminDeleteReview(reviewNo);
		
		PrintWriter out = response.getWriter();

		if (DeleteCheck > 0) {
			dao.deleteReviewNoSequence(reviewNo);
			out.println("<script>");
			out.println("alert('리뷰 삭제 성공')");
			out.println("location.href='admin_modify_movie?MovieNo=" + MovieNo +"'");
			out.println("</script>");
			out.close();
		} else {
			out.println("<script>");
			out.println("alert('영화 삭제 실패')");
			out.println("history.back()");
			out.println("</script>");
			out.close();
		}
		
		return null;
	}

}
