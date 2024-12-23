package com.cinema.action.movie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;

public class MovieReviewRecommendAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int review_no = Integer.parseInt(request.getParameter("no").trim());
		
		LatteDAO dao = LatteDAO.getInstance();
		
		dao.recommendUpCount(review_no);
		
		ActionForward forward = new ActionForward();
		
		forward.setPath("");
		return null;
	}

}
