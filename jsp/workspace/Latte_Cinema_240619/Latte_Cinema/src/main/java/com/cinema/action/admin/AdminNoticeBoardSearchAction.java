package com.cinema.action.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.NoticeBoardDTO;

public class AdminNoticeBoardSearchAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		LatteDAO dao = LatteDAO.getInstance();
		
		String field = request.getParameter("notice_field").trim();
		
		String keyword = request.getParameter("notice_keyword").trim();
		
		// 어드민 공지사항 처리
		// 페이징 처리 작업 진행
		// 한 페이지당 보여질 게시물의 수
		int rowsize = 10;

		// 아래에 보여질 페이지 최대 블럭 수
		int block = 3;
		// 예) [1][2][3] / [4][5][6] / [7][8][9]

		// DB 상의 게시물의 전체 수
		int totalRecord = 0;

		// 전체 페이지 수
		int allPage = 0;

		// 현재 페이지 변수
		int page = 0;

		if (request.getParameter("page") != null) {
			page = Integer.parseInt(request.getParameter("page").trim());
		} else {
			// 처음으로 "게시물 전체 목록" a 태그를 클릭한 경우
			page = 1;
		}

		// 해당 페이지에서 시작 번호
		int startNo = (page * rowsize) - (rowsize - 1);

		// 해당 페이지에서 끝 번호
		int endNo = (page * rowsize);

		// 해당 페이지에서 시작 블럭
		int startBlock = (((page - 1) / block) * block) + 1;

		// 해당 페이지에서 끝 블럭
		int endBlock = (((page - 1) / block) * block) + block;

		totalRecord = dao.getNoticeCount(field,keyword);

		allPage = (int) Math.ceil(totalRecord / (double) rowsize);

		if (endBlock > allPage) {
			endBlock = allPage;
		}
		
		List<NoticeBoardDTO> searchList = dao.getNoticeBoardList(field,keyword,page,rowsize);
		
		// 페이징 작업 후에는 지금까지 페이징 처리 시 작업했던 모든 데이터들을
				// view page로 바인딩하여 이동을 시켜준다.
				request.setAttribute("page", page);
				request.setAttribute("rowsize", rowsize);
				request.setAttribute("block", block);
				request.setAttribute("totalRecord", totalRecord);
				request.setAttribute("allPage", allPage);
				request.setAttribute("startNo", startNo);
				request.setAttribute("endNo", endNo);
				request.setAttribute("startBlock", startBlock);
				request.setAttribute("endBlock", endBlock);
				request.setAttribute("field", field);
				request.setAttribute("keyword", keyword);
				request.setAttribute("searchNoticeList", searchList);
				
				ActionForward forward = new ActionForward();

				forward.setPath("/WEB-INF/views/admin/notice/admin_search_noticelist.jsp");

				return forward;
	}

}
