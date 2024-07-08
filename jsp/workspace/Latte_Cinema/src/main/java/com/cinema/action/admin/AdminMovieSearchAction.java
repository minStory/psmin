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

public class AdminMovieSearchAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		LatteDAO dao = LatteDAO.getInstance();
		
		String field = request.getParameter("movie_field").trim();
		
		String keyword = request.getParameter("movie_keyword").trim();
		
		List<MovieDTO> movieList = dao.getMovieList(field,keyword);
		
		request.setAttribute("movieResultField", field);
		request.setAttribute("movieResultKeyword", keyword);
		request.setAttribute("searchMovieList", movieList);
		
		ActionForward forward = new ActionForward();
		
		forward.setPath("/WEB-INF/views/admin/movie/admin_search_movie_list.jsp");
		
		return forward;
	}

}
