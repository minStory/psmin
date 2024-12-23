package com.cinema.action.customer;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.NoticeBoardDTO;

public class NoticeContentAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		int notice_no = Integer.parseInt(request.getParameter("no").trim());
		
		LatteDAO dao = LatteDAO.getInstance();
		
		dao.noticeCount(notice_no);
		
		NoticeBoardDTO notice = dao.getNoticeContent(notice_no); 
		
		request.setAttribute("notice", notice);
		
		ActionForward forward = new ActionForward();
		 
		 forward.setRedirect(false);
		 forward.setPath("/WEB-INF/views/public/customer/customer_notice_specific.jsp");
		 
		 return forward;
		}

}
