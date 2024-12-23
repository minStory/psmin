package com.cinema.action.cinema;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;

public class CinemaAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String loc = request.getParameter("loc");
		
		request.setAttribute("loc", loc);
		
		ActionForward forward = new ActionForward();

		forward.setPath("/WEB-INF/views/public/cinema/cinema.jsp");

		return forward;
	}

}
