package com.cinema.action.reserve;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.action.StaticArea;
import com.cinema.model.LatteDAO;

public class ReserveProcessingAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		String loc = request.getParameter("loc").trim();
		String loc_detail = request.getParameter("loc_detail").trim();
		int movie_no = Integer.parseInt(request.getParameter("movie_no").trim());
		int count = Integer.parseInt(request.getParameter("count").trim());
		
		System.out.println(loc);
		System.out.println(loc_detail);
		System.out.println(movie_no);
		System.out.println(count);
		
		LatteDAO dao = LatteDAO.getInstance();

		JSONObject jsonObject = new JSONObject();
		jsonObject.put("loc", loc);
		jsonObject.put("loc_detail", loc_detail);
		jsonObject.put("movie_no", movie_no);
		jsonObject.put("count", count);

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		PrintWriter w = response.getWriter();
		w.write(jsonObject.toJSONString());
		w.close();

		return null;
	}

}
