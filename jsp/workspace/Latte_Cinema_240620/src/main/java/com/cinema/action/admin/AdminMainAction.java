package com.cinema.action.admin;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.MemberDTO;
import com.cinema.model.MovieDTO;
import com.cinema.model.NoticeBoardDTO;
import com.cinema.model.TicketingHistoryDTO;

public class AdminMainAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		LatteDAO dao = LatteDAO.getInstance();
		/* 관리자 공지사항 페이징 */
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

		totalRecord = dao.getNoticeCount();

		allPage = (int) Math.ceil(totalRecord / (double) rowsize);

		if (endBlock > allPage) {
			endBlock = allPage;
		}

		List<NoticeBoardDTO> noticeList = dao.getNoticeBoardList(page, rowsize);

		request.setAttribute("page", page);
		request.setAttribute("rowsize", rowsize);
		request.setAttribute("block", block);
		request.setAttribute("totalRecord", totalRecord);
		request.setAttribute("allPage", allPage);
		request.setAttribute("startNo", startNo);
		request.setAttribute("endNo", endNo);
		request.setAttribute("startBlock", startBlock);
		request.setAttribute("endBlock", endBlock);
		request.setAttribute("noticeList", noticeList);

		// 어드민 공지사항리스트 끝----------------------------------------------------

		List<MovieDTO> movieNowList = dao.getNowMovieList();

		request.setAttribute("movieNowList", movieNowList);

		List<MovieDTO> moviePlanList = dao.getPlanMovieList();

		request.setAttribute("moviePlanList", moviePlanList);

		// ----------------------------매출 관련
		List<Integer> monthlyTotalSales = new ArrayList<>();

		// 1월부터 12월까지의 월별 총 매출 금액을 계산하여 리스트에 저장합니다.
		for (int month = 1; month <= 12; month++) {
			List<TicketingHistoryDTO> ticketList = dao.getTicketSalesListByMonth(month);
			int totalSalesAmount = 0;

			// 해당 월의 매출 금액을 누적하여 계산합니다.
			for (TicketingHistoryDTO dto : ticketList) {
				totalSalesAmount += dto.getTicketing_history_payment_amount();
			}

			// 월별 총 매출 금액을 리스트에 추가합니다.
			monthlyTotalSales.add(totalSalesAmount);
		}

		request.setAttribute("monthlyTotalSales", monthlyTotalSales);
		// ----------------------------매출 관련 끝

		// 관리자 멤버정보 페이징
		int rowsizeMd = 8;

		// 아래에 보여질 페이지 최대 블럭 수
		int blockMd = 3;
		// 예) [1][2][3] / [4][5][6] / [7][8][9]

		// DB 상의 게시물의 전체 수
		int totalRecordMd = 0;

		// 전체 페이지 수
		int allPageMd = 0;

		// 현재 페이지 변수
		int pageMd = 0;

		if (request.getParameter("pageMd") != null) {
			pageMd = Integer.parseInt(request.getParameter("pageMd").trim());
		} else {
			// 처음으로 "게시물 전체 목록" a 태그를 클릭한 경우
			pageMd = 1;
		}

		// 해당 페이지에서 시작 번호
		int startNoMd = (pageMd * rowsizeMd) - (rowsizeMd - 1);

		// 해당 페이지에서 끝 번호
		int endNoMd = (pageMd * rowsizeMd);

		// 해당 페이지에서 시작 블럭
		int startBlockMd = (((pageMd - 1) / blockMd) * blockMd) + 1;

		// 해당 페이지에서 끝 블럭
		int endBlockMd = (((pageMd - 1) / blockMd) * blockMd) + blockMd;

		totalRecordMd = dao.getMemberDateCount();

		allPageMd = (int) Math.ceil(totalRecordMd / (double) rowsizeMd);

		if (endBlockMd > allPageMd) {
			endBlockMd = allPageMd;
		}

		List<MemberDTO> memberViewList = dao.getMemberDateList(pageMd, rowsizeMd);
		request.setAttribute("pageMd", pageMd);
		request.setAttribute("rowsizeMd", rowsizeMd);
		request.setAttribute("blockMd", blockMd);
		request.setAttribute("totalRecordMd", totalRecordMd);
		request.setAttribute("allPageMd", allPageMd);
		request.setAttribute("startNoMd", startNoMd);
		request.setAttribute("endNoMd", endNoMd);
		request.setAttribute("startBlockMd", startBlockMd);
		request.setAttribute("endBlockMd", endBlockMd);
		request.setAttribute("AdminViewMemberList", memberViewList);

		ActionForward forward = new ActionForward();

		forward.setPath("/WEB-INF/views/admin/admin_main.jsp");

		return forward;
	}

}
