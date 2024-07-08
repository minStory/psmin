package com.cinema.action.mypage;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.InquiryHistoryDTO;
import com.cinema.model.LatteDAO;
import com.cinema.model.MemberDTO;
import com.cinema.model.TicketingHistoryDTO;

public class MyPageAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ActionForward forward = new ActionForward();
		HttpSession session = request.getSession();

		MemberDTO dto = (MemberDTO) session.getAttribute("dto");

		String no = dto.getMember_no();
		String member_name = dto.getMember_name();
		int member_mileage = dto.getMember_mileage();

		LatteDAO dao = LatteDAO.getInstance();

		List<Integer> mstlist = dao.getMovieScreenTime(no);
		List<TicketingHistoryDTO> tdto = dao.getTicketingHistory(no);
		List<InquiryHistoryDTO> inquiryList = dao.getInquiryList();
		List<String> endTimeList = new ArrayList<>();
		List<Date> startDateList = new ArrayList<>();

		for (int i = 0; i < tdto.size(); i++) {

			int end_time_in_minutes = mstlist.get(i);
			String start_time = tdto.get(i).getTicketing_history_movie_start_time();

			SimpleDateFormat sdfTime = new SimpleDateFormat("HH:mm:ss");
			Calendar cal = Calendar.getInstance();
			SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd");

			// 시작 시간 파싱
			try {
				cal.setTime(sdfTime.parse(start_time));
				// 분 단위로 시간 추가
				cal.add(Calendar.MINUTE, end_time_in_minutes);
				// 결과 출력을 위한 포맷팅
				String endTime = sdfTime.format(cal.getTime());
				endTimeList.add(endTime);

				Date date = sdfDate.parse(tdto.get(i).getTicketing_history_movie_start_date());
				startDateList.add(date);

			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		request.setAttribute("member_name", member_name);
		request.setAttribute("member_mileage", member_mileage);
		request.setAttribute("startDateList", startDateList);
		request.setAttribute("endTimeList", endTimeList);
		request.setAttribute("tdto", tdto);
		request.setAttribute("inquiryList", inquiryList);

		forward.setRedirect(false);
		forward.setPath("/WEB-INF/views/public/mypage/mypage.jsp");

		return forward;

	}

}
