package com.cinema.action.movie;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.MovieDTO;

public class MovieScheduleAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		LatteDAO dao = LatteDAO.getInstance();

		List<MovieDTO> nowList = dao.getNowMovieList();

		request.setAttribute("NowList", nowList);

		List<MovieDTO> planList = dao.getPlanMovieList();

		request.setAttribute("PlanList", planList);

		ActionForward forward = new ActionForward();

		forward.setPath("/WEB-INF/views/public/movie_list/schedule_movie_list.jsp");

		return forward;
	}

}
