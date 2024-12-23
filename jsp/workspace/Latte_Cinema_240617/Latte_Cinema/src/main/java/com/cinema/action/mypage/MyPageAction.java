package com.cinema.action.mypage;

import java.io.IOException;
import java.util.ArrayList;
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
import com.cinema.model.MovieDTO;
import com.cinema.model.ScreeningDTO;
import com.cinema.model.TicketingHistoryDTO;

public class MyPageAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		ActionForward forward = new ActionForward();
		HttpSession session = request.getSession(false);

		MemberDTO dto = (MemberDTO) session.getAttribute("dto");

		String no = dto.getMember_no();
		
		LatteDAO dao = LatteDAO.getInstance();

		List<MovieDTO> mdto = new ArrayList<MovieDTO>();
		List<ScreeningDTO> sdto = new ArrayList<ScreeningDTO>();
		List<TicketingHistoryDTO> tdto = dao.getTicketingHistory(no);
		List<InquiryHistoryDTO> list = dao.getInquiryList();

		// 리스트 타입
		for (TicketingHistoryDTO tno : tdto) {
			mdto = dao.getMovieInfo(tno.getTicketing_history_movie_no());
			sdto = dao.getScreening(tno.getTicketing_history_movie_no());
		}

		request.setAttribute("sdto", sdto);
		request.setAttribute("mdto", mdto);
		request.setAttribute("tdto", tdto);
		request.setAttribute("InquiryList", list);

		forward.setRedirect(false);
		forward.setPath("/WEB-INF/views/public/mypage/mypage.jsp");

		return forward;

	}

}
