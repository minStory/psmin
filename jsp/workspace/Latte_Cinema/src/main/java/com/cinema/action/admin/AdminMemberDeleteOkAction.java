package com.cinema.action.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;

public class AdminMemberDeleteOkAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String memberId = request.getParameter("memberid");

		LatteDAO dao = LatteDAO.getInstance();
		
		int deleteMember = dao.adminDeleteMember(memberId);
		
		PrintWriter out = response.getWriter();

		if (deleteMember > 0) {
			out.println("<script>");
			out.println("alert('멤버 제거 성공')");
			out.println("location.href = 'admin_main'");
			out.println("</script>");
			out.close();
		} else {
			out.println("<script>");
			out.println("alert('멤버 제거 실패')");
			out.println("history.back()");
			out.println("</script>");
			out.close();
		}
		
		
		return null;
	}

}
