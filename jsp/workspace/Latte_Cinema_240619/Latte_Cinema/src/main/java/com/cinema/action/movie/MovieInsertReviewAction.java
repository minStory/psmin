package com.cinema.action.movie;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.MovieReviewDTO;

public class MovieInsertReviewAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		// hidden으로 받아온 맴버의 정보
		String review_member_no = request.getParameter("moviermno").trim();
		String review_memver_id = request.getParameter("moviermid").trim();
		int review_movie_no = Integer.parseInt(request.getParameter("movierno").trim());
		String review_movie_title = request.getParameter("moviername").trim();

		// 맴버가 작성한 글의 정보
		String review_movie_content = request.getParameter("moviercontent").trim();
		LatteDAO dao = LatteDAO.getInstance();
		MovieReviewDTO dto = new MovieReviewDTO();

		dto.setMovie_review_writer_no(review_member_no);
		dto.setMovie_review_writer_id(review_memver_id);
		dto.setMovie_review_movie_no(review_movie_no);
		dto.setMovie_review_movie_title(review_movie_title);
		dto.setMovie_review_content(review_movie_content);

		int check = dao.memberInsertReview(dto);

		PrintWriter out = response.getWriter();

		if (check > 0) {
			out.println("<script>");
			out.println("alert('게시글 추가 성공!!!')");
			out.println("location.href ='movie_specific?no=" + review_movie_no + "'");
			out.println("</script>");
		} else {
			out.println("<script>");
			out.println("alert('게시글 추가 실패!!!')");
			out.println("history.back()");
			out.println("</script>");

		}

		return null;
	}

}
