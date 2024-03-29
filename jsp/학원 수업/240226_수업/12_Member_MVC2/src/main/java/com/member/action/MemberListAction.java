package com.member.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.member.model.MemberDAO;
import com.member.model.MemberDTO;

public class MemberListAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		// 요청: 전체 회원 목록을 보여달라고 요청
		// 응답: member 테이블에 있는 회원 전체 리스트를
		//		조회하여 view page로 이동시키는 비즈니스 로직
		
		MemberDAO dao = MemberDAO.getInstance();
		
		List<MemberDTO> list = dao.getMemberList();
		
		// DB에서 가져온 전체 회원 리스트를
		// view page로 이동시켜야 한다.
		
		request.setAttribute("List", list);
		
		return "member/member_list.jsp";
	}
}
