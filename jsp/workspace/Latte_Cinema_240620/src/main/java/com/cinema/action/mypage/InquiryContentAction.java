package com.cinema.action.mypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.InquiryHistoryDTO;
import com.cinema.model.LatteDAO;
import com.cinema.model.MemberDTO;

public class InquiryContentAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		int inquiry_history_no = Integer.parseInt(request.getParameter("no").trim());

		HttpSession session = request.getSession(false);

		MemberDTO dto = (MemberDTO) session.getAttribute("dto");

		LatteDAO dao = LatteDAO.getInstance();

		InquiryHistoryDTO cont = dao.getInquiryContent(inquiry_history_no);

		request.setAttribute("InquiryContent", cont);

		ActionForward forward = new ActionForward();

		forward.setPath("/WEB-INF/views/public/mypage/mypagecontent.jsp");

		return forward;
	}

}
