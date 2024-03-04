package com.member.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.member.model.MemberDAO;
import com.member.model.MemberDTO;

public class MemberListAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) {
		
		// 요청: 전체 회원 목록을 보여달라고 요청
		// 응답: member 테이블에 있는 회원 전체 리스트를
		//		조회하여 view page로 이돟시키는 비즈니스 로직
		
		// 페이징 처리 미적용
		//MemberDAO dao = MemberDAO.getInstance();
		//List<MemberDTO> list = dao.getMemberList();		
		//request.setAttribute("List", list);
		
		// 페이징 처리 적용
		// 한 페이지당 보여질 게시물의 수
		int rowSize = 3;
		// 아래에 보여질 페이지 최대 블럭 수
		int block = 3;
		// DB상 게시물의 전체 수
		int totalRecord = 0;
		// 전체 페이지 수
		int allPage = 0;
		//현재 페이지 변수
		int page = 0;
		
		if(request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page").trim());
		} else {
			// 처음으로 "게시물 전체 목록" a 태그를 클릭한 경우
			page = 1;
		}
		
		// 해당 페이지에서 시작 번호
		int startNo = (page * rowSize) - (rowSize - 1);
		// 해당 페이지에서 끝 번호
		int endNo = (page * rowSize);
		// 해당 페이지에서 시작 블럭
		int startBlock = (((page - 1) / block) * block) + 1;
		// 해당 페이지에서 끝 블럭
		int endBlock = (((page - 1) / block) * block) + block;
		
		MemberDAO dao = MemberDAO.getInstance();
		
		// 전체 게시물의 수를 확인하는 메서드
		totalRecord = dao.getMemberCount();
		
		// 전체 게시물의 수를 한 페이지당 보여질 게시물의 수로 나누어주면 전체 페이지가 나온다.
		// 이 때, 전체 페이지 수가 나올 때 나머지가 있으면
		// 무조건 전체 페이지 수를 하나 올려 주어야 한다.
		allPage = (int)Math.ceil(totalRecord / (double)rowSize);
		
		if(endBlock > allPage) {
			endBlock = allPage;
		}
		
		// 현재 페이지에 해당하는 게시물을 가져오는 메서드 호출
		List<MemberDTO> list = dao.getMemberList(page, rowSize);
		
		// 페이징 작업 후에는 지금까지 페이징 처리 시 작업했던 모든 데이터들을
		// view page로 바인딩하여 이동을 시켜준다.
		
		request.setAttribute("page", page);
		request.setAttribute("rowSize", rowSize);
		request.setAttribute("block", block);
		request.setAttribute("totalRecord", totalRecord);
		request.setAttribute("allPage", allPage);
		request.setAttribute("startNo", startNo);
		request.setAttribute("endNo", endNo);
		request.setAttribute("startBlock", startBlock);
		request.setAttribute("endBlock", endBlock);
		request.setAttribute("List", list);
		
		return "members/member_list.jsp";
	}

}
