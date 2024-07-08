package com.cinema.action.reserve;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.action.StaticArea;
import com.cinema.model.LatteDAO;
import com.cinema.model.MovieDTO;
import com.cinema.model.TicketingHistoryDTO;
import com.cinema.model.MemberDTO;

public class ReserveProcessingAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		MemberDTO dto = (MemberDTO) session.getAttribute("dto");

		String loc = request.getParameter("loc").trim();
		String loc_detail = request.getParameter("loc_detail").trim();
		int movie_no = Integer.parseInt(request.getParameter("movie_no").trim());
		int movie_year = Integer.parseInt(request.getParameter("movie_year").trim());
		int movie_month = Integer.parseInt(request.getParameter("movie_month").trim());
		int movie_day = Integer.parseInt(request.getParameter("movie_day").trim());
		String movie_date = movie_year + "-" + StaticArea.getMonth(movie_month) + "-" + StaticArea.getDay(movie_day);
		String movie_time = request.getParameter("movie_time").trim();
		int count = Integer.parseInt(request.getParameter("count").trim());
		String seat = request.getParameter("seat").trim();
		int price = Integer.parseInt(request.getParameter("price").trim().replace(",", ""));
		String method = request.getParameter("method").trim();

		System.out.println("지역: " + loc);
		System.out.println("세부지역: " + loc_detail);
		System.out.println("영화 번호: " + movie_no);
		System.out.println("영화 시작 날짜:" + movie_date);
		System.out.println("영화 시작 시간: " + movie_time);
		System.out.println("좌석 수: " + count);
		System.out.println("좌석 : " + seat);
		System.out.println("총 합계: " + price);
		System.out.println("결제 방식: " + method);

		LatteDAO dao = LatteDAO.getInstance();
		
		MovieDTO mDto = dao.getMovieSpecific(movie_no);
		
		TicketingHistoryDTO tDto = new TicketingHistoryDTO();
		tDto.setTicketing_history_member_no(dto.getMember_no());
		tDto.setTicketing_history_booking_count(count);
		tDto.setTicketing_history_movie_start_date(movie_date);
		tDto.setTicketing_history_movie_start_time(movie_time);
		tDto.setTicketing_history_movie_no(movie_no);
		tDto.setTicketing_history_movie_title(mDto.getMovie_title());
		tDto.setTicketing_history_region(loc);
		tDto.setTicketing_history_location(loc_detail);
		tDto.setTicketing_history_seat(seat);
		tDto.setTicketing_history_payment_amount(price);
		tDto.setTicketing_history_payment_method(method);

		int check = dao.insertTicketingHistory(tDto);
		
		if(check > 0) {
			System.out.println("성공");
		}else {
			System.out.println("실패");
		}

		JSONObject jsonObject = new JSONObject();

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		PrintWriter w = response.getWriter();
		w.write(jsonObject.toJSONString());
		w.close();

		return null;
	}

}
