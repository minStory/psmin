package com.cinema.action.admin;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.MemberDTO;

public class AdminMemberModifyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String memberId = request.getParameter("memberid");
		
		LatteDAO dao = LatteDAO.getInstance();
		
		MemberDTO dto = dao.getMemberInfo(memberId);
		
		request.setAttribute("mdmember", dto);
		
		ActionForward forward = new ActionForward();

		forward.setRedirect(false);

		forward.setPath("/WEB-INF/views/admin/member/admin_modify_ok_member.jsp");

		return forward;
	}

}
