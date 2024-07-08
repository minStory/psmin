package com.cinema.action.signup;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;

public class SignupIdDuplicateCheckAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id");

		LatteDAO dao = LatteDAO.getInstance();
		int check = dao.signupIdDuplicateCheck(id);

		JSONObject jsonObject = new JSONObject();
		PrintWriter w = response.getWriter();
		if (check == 0) {
			jsonObject.put("result", true);
		} else {
			jsonObject.put("result", false);
		}
		w.write(jsonObject.toJSONString());
		w.close();

		return null;
	}
}
