package com.cinema.action.logout;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;

public class LogoutAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession();
		
		// 세션 해제 메서드
		if(session != null) {
			session.invalidate();
		}
		
		PrintWriter w = response.getWriter();
		w.println("<script>"
				+ "alert('로그아웃 되었습니다.');"
				//+ "location.href = document.referrer;" // 로그아웃 후 이전페이지로 돌아가기
				+ "location.href = 'main'"
				+ "</script>'");
		w.close();

		return null;
	}

}
