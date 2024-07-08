package com.cinema.action.customer;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.action.StaticArea;
import com.cinema.model.LatteDAO;
import com.cinema.model.MemberDTO;
import com.cinema.model.NoticeBoardDTO;

public class CustomerAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

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

		LatteDAO dao = LatteDAO.getInstance();
		totalRecord = dao.getNoticeCount();
		allPage = (int) Math.ceil(totalRecord / (double) rowsize);

		if (endBlock > allPage) {
			endBlock = allPage;
		}

		List<NoticeBoardDTO> notice = dao.getNoticeBoardList(page, rowsize);

		request.setAttribute("page", page);
		request.setAttribute("rowsize", rowsize);
		request.setAttribute("block", block);
		request.setAttribute("totalRecord", totalRecord);
		request.setAttribute("allPage", allPage);
		request.setAttribute("startNo", startNo);
		request.setAttribute("endNo", endNo);
		request.setAttribute("startBlock", startBlock);
		request.setAttribute("endBlock", endBlock);
		request.setAttribute("notice", notice);

		HttpSession session = request.getSession(false);

		if (session.getAttribute("dto") != null) {
			MemberDTO mDto = (MemberDTO) session.getAttribute("dto");
			String phoneNumber = mDto.getMember_phone();

			String[] arr = phoneNumber.split("\\)");

			String company = arr[0];
			company = company.replace("(", "");
			company = company.replace(")", "");

			String[] arr2 = arr[1].split("-");

			request.setAttribute("company", company);
			request.setAttribute("snum", arr2[0]);
			request.setAttribute("mnum", arr2[1]);
			request.setAttribute("fnum", arr2[2]);
		}

		request.setAttribute("mobileCarrierList", StaticArea.getMobileCarrierList());

		ActionForward forward = new ActionForward();

		forward.setPath("/WEB-INF/views/public/customer/customer.jsp");

		return forward;
	}

}