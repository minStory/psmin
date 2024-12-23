package com.cinema.action.mypage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;


public class TicketDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		LatteDAO dao = LatteDAO.getInstance();
		
		String no = request.getParameter("no");
		
		int check = dao.ticketdelete(no);
		
		PrintWriter out = response.getWriter();

		if (check > 0) {
			dao.deleteMovieNoSequence(check);
			out.println("<script>");
			out.println("alert('예매 취소 성공')");
			out.println("location.href='mypage'");
			out.println("</script>");
			out.close();
		} else {
			out.println("<script>");
			out.println("alert('예매 취소 실패')");
			out.println("history.back()");
			out.println("</script>");
			out.close();
		}
		
		return null;
	}

}
