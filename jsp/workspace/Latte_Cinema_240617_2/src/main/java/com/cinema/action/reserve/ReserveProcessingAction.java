package com.cinema.action.reserve;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.action.StaticArea;
import com.cinema.model.LatteDAO;

public class ReserveProcessingAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String loc = request.getParameter("loc").trim();
		String loc_detail = request.getParameter("loc_detail").trim();
		int movie_no = Integer.parseInt(request.getParameter("movie_no").trim());
		int count = Integer.parseInt(request.getParameter("count").trim());
		String seat = request.getParameter("seat").trim();
		String seats[] = seat.split(",");
		int price = Integer.parseInt(request.getParameter("price").trim().replace(",", ""));
		String method = request.getParameter("method").trim();

		System.out.println("지역: " + loc);
		System.out.println("세부지역: " + loc_detail);
		System.out.println("영화번호: " + movie_no);
		System.out.println("좌석 수: " + count);

		System.out.println("---좌석---");
		for (String i : seats) {
			System.out.println(i);
		}

		System.out.println("총 합계: " + price);
		System.out.println("결제 방식: " + method);

		LatteDAO dao = LatteDAO.getInstance();
		
		//dao.insertTicketing();

		JSONObject jsonObject = new JSONObject();

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		PrintWriter w = response.getWriter();
		w.write(jsonObject.toJSONString());
		w.close();

		return null;
	}

}
