package com.member.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.member.model.MemberDAO;
import com.member.model.MemberDTO;

public class MemberSearchAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String field = request.getParameter("field").trim();
		String keyword = request.getParameter("keyword").trim();
		
		MemberDAO dao = MemberDAO.getInstance();
		
		List<MemberDTO> list = dao.memberSearch(field, keyword);
		
		request.setAttribute("List", list);
		
		return "member/member_search.jsp";
	}

}
