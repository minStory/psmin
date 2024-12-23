package com.cinema.action.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.MovieDTO;

public class AdminModifyMovieOkAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		System.out.println("dddd");
		String movie_title = request.getParameter("title").trim();
		String movie_content = request.getParameter("content").trim();
		String movie_date = request.getParameter("date").trim();
		int movie_screenTime = Integer.parseInt(request.getParameter("screentime").trim());
		int movie_age = Integer.parseInt(request.getParameter("age").trim());
		String movie_genre = request.getParameter("genre").trim();
		String movie_director = request.getParameter("director").trim();
		String movie_actor = request.getParameter("actor").trim();
		
		// 히든으로받아온것
		int movie_no = Integer.parseInt(request.getParameter("movie_no").trim());
		
		
		MovieDTO dto = new MovieDTO();
		
		dto.setMovie_title(movie_title);
		dto.setMovie_content(movie_content);
		dto.setMovie_release_date(movie_date);
		dto.setMovie_screen_time(movie_screenTime);
		dto.setMovie_limit_age(movie_age);
		dto.setMovie_genre(movie_genre);
		dto.setMovie_director(movie_director);
		dto.setMovie_actor(movie_actor);
		dto.setMovie_no(movie_no);
		
		LatteDAO dao = LatteDAO.getInstance();
		
		int check = dao.adminUpdateMovie(dto);
		
		PrintWriter out = response.getWriter();
		
		if(check > 0) {
			out.println("<script>");
			out.println("alert('게시물 수정 성공!!!')");
			out.println("location.href='admin_modify_movie_specific?MovieNo=" + movie_no +"'");
			out.println("</script>");
		}else {
			out.println("<script>");
			out.println("alert('게시글 수정 실패~~')");
			out.println("history.back()");
			out.println("</script>");
		}
		
		return null;
	}

}
