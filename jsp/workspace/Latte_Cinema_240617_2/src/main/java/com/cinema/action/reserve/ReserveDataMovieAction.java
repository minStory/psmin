package com.cinema.action.reserve;

import java.io.IOException;
import java.io.PrintWriter;
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

public class ReserveDataMovieAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		LatteDAO dao = LatteDAO.getInstance();
		List<MovieDTO> movieList = dao.getNowMovieList();

		JSONArray jsonList = new JSONArray();

		if (movieList != null) {
			for (MovieDTO dto : movieList) {
				JSONObject jsonDto = new JSONObject();
				jsonDto.put("actor", dto.getMovie_actor());
				jsonDto.put("content", dto.getMovie_content());
				jsonDto.put("director", dto.getMovie_director());
				jsonDto.put("genre", dto.getMovie_genre());
				jsonDto.put("poster", dto.getMovie_poster());
				jsonDto.put("release_date", dto.getMovie_release_date());
				jsonDto.put("title", dto.getMovie_title());
				jsonDto.put("limit_age", dto.getMovie_limit_age());
				jsonDto.put("no", dto.getMovie_no());
				jsonDto.put("screen_time", dto.getMovie_screen_time());
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
