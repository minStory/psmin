package com.cinema.action.reserve;

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

public class ReserveDataSeatAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		LatteDAO dao = LatteDAO.getInstance();
		
		List<TicketingHistoryDTO> tList = dao.getTicketingHistory();
		List<String> seatList = new ArrayList<>();
		for(TicketingHistoryDTO i : tList) {
			String[] temp = i.getTicketing_history_seat().split(",");
			for(String j : temp) {
				seatList.add(j);
			}
		}
		
//		for(String i : seatList) {
//			System.out.println(i);
//		}

		JSONArray jsonList = new JSONArray();

		if (seatList != null) {
			for (String i : seatList) {
				JSONObject jsonDto = new JSONObject();
				jsonDto.put("seat", i);
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
