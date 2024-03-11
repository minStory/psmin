package com.reply.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BbsReplyAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setAttribute("no", request.getParameter("no").trim());
		
		ActionForward forward = new ActionForward();
		
		forward.setPath("bbs/bbs_reply.jsp");
		
		return forward;
	}

}
