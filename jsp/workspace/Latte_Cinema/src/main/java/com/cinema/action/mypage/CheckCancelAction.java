package com.cinema.action.mypage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.MemberDTO;
import com.cinema.model.MovieDTO;
import com.cinema.model.TicketingHistoryDTO;

public class CheckCancelAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession();

		List<TicketingHistoryDTO> list = null;
		List<Boolean> cancelList = null;
		if (session.getAttribute("dto") != null) {
			if (session.getAttribute("dto").equals("M")) {
				MemberDTO dto = (MemberDTO) session.getAttribute("dto");
				String no = dto.getMember_no();
				LatteDAO dao = LatteDAO.getInstance();
				list = dao.getTicketingHistory(no);
				cancelList = new ArrayList<>();
			}
		}

		if (list != null) {
			for (int i = 0; i < list.size(); i++) {
				String date = list.get(i).getTicketing_history_movie_start_date();
				String time = list.get(i).getTicketing_history_movie_start_time();

				int year = Integer.parseInt(date.substring(0, 4));
				int month = Integer.parseInt(date.substring(5, 7));
				int day = Integer.parseInt(date.substring(8));
				int hour = Integer.parseInt(time.substring(0, 2));
				int minute = Integer.parseInt(time.substring(3, 5));
				int second = Integer.parseInt(time.substring(6));

				Calendar calendar = Calendar.getInstance();
				calendar.set(year, month - 1, day, hour, minute, second);
				calendar.set(Calendar.MILLISECOND, 0); // 초의 소수점 이하 밀리초를 0으로 설정합니다.

				long milliseconds = calendar.getTimeInMillis();

				long now = System.currentTimeMillis(); // 현재시간(밀리초)

//				System.out.println("시작시간 : " + milliseconds);
//				System.out.println("현재시간 : " + now);
//				System.out.println("시작시간 - 현재시간 : " + (milliseconds - now));
//				System.out.println((milliseconds - now) < 120000);

				// 영화 시작시간까지 20분이 넘게 남았는지
				// boolean 형으로 데이터 삽입
				cancelList.add((milliseconds - now) < 1200000);
			}
		}

		JSONArray jsonList = new JSONArray();

		if (cancelList != null) {
			for (Boolean i : cancelList) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("boolean", i);
				jsonList.add(jsonObject);
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