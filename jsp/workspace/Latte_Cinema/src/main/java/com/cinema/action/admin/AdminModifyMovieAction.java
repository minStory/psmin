package com.cinema.action.admin;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.MovieDTO;
import com.cinema.model.MovieReviewDTO;

public class AdminModifyMovieAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int movie_no = Integer.parseInt(request.getParameter("MovieNo").trim());

		LatteDAO dao = LatteDAO.getInstance();

		MovieDTO specific = dao.getMovieSpecific(movie_no);

		request.setAttribute("specific", specific);

		List<MovieReviewDTO> recommendReview = dao.getFormatRecommendReview(movie_no);

		request.setAttribute("recommendReview", recommendReview);

		List<MovieReviewDTO> timeReview = dao.getFormatTimeMovieReview(movie_no);

		request.setAttribute("timeReview", timeReview);

		ActionForward forward = new ActionForward();

		forward.setRedirect(false);
		forward.setPath("/WEB-INF/views/admin/movie/admin_movie_modify.jsp");

		return forward;
	}

}
