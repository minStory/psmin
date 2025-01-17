package com.reply.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reply.model.BbsDAO;

public class BbsDeleteAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int no = Integer.parseInt(request.getParameter("no").trim());
		
		request.setAttribute("no", no);
		
		ActionForward forward = new ActionForward();
		
		forward.setPath("bbs/bbs_delete.jsp");
		
		return forward;
	}

}
