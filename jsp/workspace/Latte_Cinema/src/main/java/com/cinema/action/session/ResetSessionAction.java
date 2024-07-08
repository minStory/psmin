package com.cinema.action.session;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.AdminDTO;
import com.cinema.model.MemberDTO;

public class ResetSessionAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = null;

		if (request.getSession(false) != null) {
			session = request.getSession(false);

			if (session.getAttribute("no").equals("A")) {
				AdminDTO dto = (AdminDTO) session.getAttribute("dto");
				session.invalidate();
				session = request.getSession();
				session.setMaxInactiveInterval(3600);
				session.setAttribute("dto", dto);
				session.setAttribute("no", session.getAttribute("no"));
			} else if (session.getAttribute("no").equals("M")) {
				MemberDTO dto = (MemberDTO) session.getAttribute("dto");
				session.invalidate();
				session = request.getSession();
				session.setMaxInactiveInterval(1200);
				session.setAttribute("dto", dto);
				session.setAttribute("no", session.getAttribute("no"));
			}
		}

		return null;
	}
}
