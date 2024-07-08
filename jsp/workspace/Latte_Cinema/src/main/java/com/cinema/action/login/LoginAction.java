package com.cinema.action.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;

public class LoginAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);

		if (session.getAttribute("dto") != null) {
			PrintWriter w = response.getWriter();
			w.println("<script>");
			w.println("alert('로그인 상태입니다!')");
			w.println("history.back()");
			w.println("</script>");
			w.close();
		} else {

			ActionForward forward = new ActionForward();

			forward.setPath("/WEB-INF/views/public/login/login.jsp");

			return forward;
		}
		
		return null;
	}
}
