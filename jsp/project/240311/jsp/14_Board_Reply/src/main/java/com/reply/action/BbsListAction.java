package com.reply.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reply.model.BbsDAO;
import com.reply.model.BbsDTO;

public class BbsListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		
		// DB 상의 jsp_bbs 테이블의 전체 게시물을 조회하여
		// view page 로 이동시키는 비지니스 로직.
		
		BbsDAO dao = BbsDAO.getInstance();
		
		List<BbsDTO> list = dao.getBbsList();
		
		List<Integer> rCountList = dao.getreplyCount();
		
		request.setAttribute("list", list);
		request.setAttribute("rCountList", rCountList);
		
//		System.out.println(rCountList);
		
//		System.out.println("Count = " + dao.getBbsCount());
		
		ActionForward forward = new ActionForward();
		
		forward.setRedirect(false);
		
		forward.setPath("bbs/bbs_list.jsp");
		
		return forward;
	}

}
