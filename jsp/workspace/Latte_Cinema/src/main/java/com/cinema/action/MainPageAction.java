package com.cinema.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cinema.model.LatteDAO;
import com.cinema.model.MovieDTO;
import com.cinema.model.NoticeBoardDTO;

// 메인페이지가 실행될 때 작동하는 서블릿
public class MainPageAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		LatteDAO dao = LatteDAO.getInstance();
		
		List<MovieDTO> movieList = dao.getNowMovieList();
		List<NoticeBoardDTO> noticeBoardList = dao.getNoticeBoardList();
		
		// 헤더에 필요한 영화관 리스트 데이터를 jsp 페이지로 이동
		request.setAttribute("localList", StaticArea.getLocalList());
		request.setAttribute("specialHallList", StaticArea.getSpecialHallList());
		request.setAttribute("seoulList", StaticArea.getSeoulList());
		request.setAttribute("gyeonggiIncheonList", StaticArea.getGyeongbukDaeguList());
		request.setAttribute("chungCheongDaeJeonList", StaticArea.getChungCheongDaeJeonList());
		request.setAttribute("jeollaGwangjuList", StaticArea.getJeollaGwangjuList());
		request.setAttribute("gyeongbukDaeguList", StaticArea.getGyeongbukDaeguList());
		request.setAttribute("gyeongnamBusanUlsanList", StaticArea.getGyeongnamBusanUlsanList());
		request.setAttribute("gangwonList", StaticArea.getGangwonList());
		request.setAttribute("jejuList", StaticArea.getJejuList());
		request.setAttribute("sizeList", StaticArea.getSizeList());
		
		request.setAttribute("movieList", movieList);
		request.setAttribute("noticeBoardList", noticeBoardList);

		ActionForward forward = new ActionForward();

		forward.setPath("/WEB-INF/include/header.jsp");

		return forward;
	}

}
