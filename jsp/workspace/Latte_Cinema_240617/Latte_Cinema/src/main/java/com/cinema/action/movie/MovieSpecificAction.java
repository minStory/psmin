package com.cinema.action.movie;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.MovieDTO;
import com.cinema.model.MovieReviewDTO;

public class MovieSpecificAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		String no = (String) session.getAttribute("no");
		request.setAttribute("no", no);

		int movie_no = Integer.parseInt(request.getParameter("no").trim());

		LatteDAO dao = LatteDAO.getInstance();

		MovieDTO specific = dao.getMovieSpecific(movie_no);

		request.setAttribute("Specific", specific);

		List<MovieReviewDTO> recommendReview = dao.getFormatRecommendReview(movie_no);
		request.setAttribute("recommendReview", recommendReview);

		List<MovieReviewDTO> timeReview = dao.getFormatTimeMovieReview(movie_no);
		request.setAttribute("timeReview", timeReview);

		ActionForward forward = new ActionForward();

		forward.setRedirect(false);
		forward.setPath("/WEB-INF/views/public/movie_list/movie_specific.jsp");

		return forward;
	}

}
