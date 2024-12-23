package com.cinema.action.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.NoticeBoardDTO;

public class AdminModifyNoticeAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int noticeNo = Integer.parseInt(request.getParameter("noticeNo").trim());

		LatteDAO dao = LatteDAO.getInstance();

		NoticeBoardDTO dto = dao.getNoticeContent(noticeNo);

		request.setAttribute("notice", dto);
		
		ActionForward forward = new ActionForward();

		forward.setRedirect(false);

		forward.setPath("/WEB-INF/views/admin/notice/admin_modify_ok_notice.jsp");

		return forward;
	}

}
