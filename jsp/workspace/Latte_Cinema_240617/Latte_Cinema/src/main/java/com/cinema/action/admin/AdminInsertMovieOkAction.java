package com.cinema.action.admin;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.action.StaticArea;
import com.cinema.model.LatteDAO;
import com.cinema.model.MovieDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class AdminInsertMovieOkAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String saveFolder = "D:\\jsp\\Latte_Cinema\\src\\main\\webapp\\images\\movie_image";

		int fileSize = 10 * 1024 * 1024; // 10MB

		MultipartRequest multi = new MultipartRequest(request, // 일반적인 request 객체
				saveFolder, // 첨부파일이 저장될 경로
				fileSize, // 업로드할 첨부파일의 최대 크기
				"UTF-8", // 문자 인코딩 방식
				new DefaultFileRenamePolicy() // 첨부파일의 이름이 같은 경우 중복이 안되게 설정
		);

		String title = multi.getParameter("title").trim();
		String genre = multi.getParameter("genre").trim();
		int screen_time = Integer.parseInt(multi.getParameter("screen_time").trim());
		String director = multi.getParameter("director").trim();
		String actor = multi.getParameter("actor").trim();
		int limit_age = Integer.parseInt(multi.getParameter("limit_age").trim());
		int release_year = Integer.parseInt(multi.getParameter("release_year").trim());
		int release_month = Integer.parseInt(multi.getParameter("release_month").trim());
		int release_day = Integer.parseInt(multi.getParameter("release_day").trim());
		String release_date = release_year + "-" + StaticArea.getMonth(release_month) + "-"
				+ StaticArea.getDay(release_day);
		File poster = multi.getFile("poster");
		String content = multi.getParameter("content").trim();

		MovieDTO dto = new MovieDTO();
		dto.setMovie_title(title);
		dto.setMovie_genre(genre);
		dto.setMovie_screen_time(screen_time);
		dto.setMovie_director(director);
		dto.setMovie_actor(actor);
		dto.setMovie_limit_age(limit_age);
		dto.setMovie_release_date(release_date);
		dto.setMovie_content(content);

		LatteDAO dao = LatteDAO.getInstance();
		int movie_no = dao.insertMovie(dto);
		System.out.println("movie_no = " + movie_no);

		if (poster != null) { // 첨부파일이 존재하는 경우

			// String fileName = poster.getName();
			String homedir = saveFolder + "/" + movie_no;
			File path = new File(homedir);

			if (!path.exists()) { // 폴더가 존재하지 않는 경우
				path.mkdir(); // 실제 폴더를 만들어 주는 메서드
			}

			String reFileName = "poster.png";
			poster.renameTo(new File(homedir + "/" + reFileName));

			String fileDBName = movie_no + "/" + reFileName;

			int check = dao.insertMoviePoster(movie_no, fileDBName);
			PrintWriter w = response.getWriter();
			if (check > 0) {
				w.println("<script>");
				w.println("alert('영화 업로드 성공!')");
				w.println("location.href='admin_main'");
				w.println("</script>");
			} else {
				w.println("<script>");
				w.println("alert('영화 업로드 실패!')");
				w.println("history.back()");
				w.println("</script>");
			}
		}

		return null;
	}
}
