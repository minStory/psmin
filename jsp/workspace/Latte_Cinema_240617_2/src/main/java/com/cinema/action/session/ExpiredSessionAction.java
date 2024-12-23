package com.cinema.action.session;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.TimeUnit;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.json.simple.JSONObject;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;

public class ExpiredSessionAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = null;

		if (request.getSession(false) != null) {
			session = request.getSession(false);

			long maxInactiveInterval = session.getMaxInactiveInterval(); // 세션 유효시간(초)
			long currentTime = System.currentTimeMillis(); // 현재시간(밀리초)
			long creationTime = session.getCreationTime(); // 세션 생성시간(밀리초)
			long elapsedTime = TimeUnit.MILLISECONDS.toSeconds(currentTime - creationTime); // 세션 경과시간(초로 변환)
			long remainingTime = maxInactiveInterval - elapsedTime; // 남은시간(초)
			long remainingHour = remainingTime / 60;
			long remainingMinute = remainingTime % 60;
			
			String page = "logout";

			if (remainingHour == 0 && remainingMinute == 0) {
				JSONObject jsonObject = new JSONObject();
				jsonObject.put("expiredSession", page);

				PrintWriter w = response.getWriter();
				w.write(jsonObject.toJSONString());
				w.close();
			}
		}

		return null;
	}
}