package com.cinema.action.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.MemberDTO;

public class AdminMemberSearchAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		LatteDAO dao = LatteDAO.getInstance();
		
		String field = request.getParameter("member_field").trim();
		
		String keyword = request.getParameter("member_keyword").trim();
		
		List<MemberDTO> memberList = dao.getMemberList(field,keyword);
		
		request.setAttribute("memberResultField", field);
		request.setAttribute("memberResultKeyword", keyword);
		request.setAttribute("searchMemberList", memberList);
		
		ActionForward forward = new ActionForward();
		
		forward.setPath("/WEB-INF/views/admin/member/admin_search_member_list.jsp");
		
		return forward;
	}

}
