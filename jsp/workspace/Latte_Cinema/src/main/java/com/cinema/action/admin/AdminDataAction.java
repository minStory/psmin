package com.cinema.action.admin;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.MovieDTO;
import com.cinema.model.TicketingHistoryDTO;

public class AdminDataAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		LatteDAO dao = LatteDAO.getInstance();

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

		JSONArray jsonList = new JSONArray();

		if (monthlyTotalSales != null) {
			for (Integer i : monthlyTotalSales) {
				JSONObject jsonDto = new JSONObject();
				jsonDto.put("monthly", i);
				jsonList.add(jsonDto);
			}
		}

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		PrintWriter w = response.getWriter();
		w.write(jsonList.toJSONString());
		w.close();

		return null;
	}

}
