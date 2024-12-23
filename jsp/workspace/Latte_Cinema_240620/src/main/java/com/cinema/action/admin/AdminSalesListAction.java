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
import com.cinema.model.TicketingHistoryDTO;

public class AdminSalesListAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		LatteDAO dao = LatteDAO.getInstance();

		List<Integer> monthlyTotalSales = new ArrayList<>();

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

		// 총 매출 금액 계산
		int totalSalesAmount = 0;
		for (Integer monthlySales : monthlyTotalSales) {
			totalSalesAmount += monthlySales;
		}

		request.setAttribute("monthlyTotalSales", monthlyTotalSales);
		request.setAttribute("totalSalesAmount", totalSalesAmount);

		ActionForward forward = new ActionForward();
		forward.setPath("/WEB-INF/views/admin/admin_sales_list.jsp");

		return forward;
	}

}
