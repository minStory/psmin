package com.cinema.action.mypage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.action.StaticArea;
import com.cinema.model.MemberDTO;

public class CkPwdAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		HttpSession session = request.getSession(false);
		MemberDTO dto = (MemberDTO) session.getAttribute("dto");

		String inputPwd = request.getParameter("pwd");
		String pwd = dto.getMember_pwd();

		ActionForward forward = new ActionForward();
		PrintWriter w = response.getWriter();

		if (inputPwd.equals(pwd)) {

			String phoneNumber = dto.getMember_phone();

			String[] arr = phoneNumber.split("\\)");
			String com = arr[0].substring(1, 5);
			String[] number = arr[1].split("-");

			request.setAttribute("com", com);
			request.setAttribute("snum", number[0]);
			request.setAttribute("mnum", number[1]);
			request.setAttribute("fnum", number[2]);
			request.setAttribute("mobileCarrierList", StaticArea.getMobileCarrierList());

			forward.setRedirect(false);
			forward.setPath("/WEB-INF/views/public/mypage/changeinfo.jsp");
		} else if (!inputPwd.equals(pwd)) {

			w.println("<script>" + "alert('비밀번호가 틀립니다 다시 입력하세요!');" + "location.href='changeinfockpwd'" + "</script>");
			w.close();
		} else {
			w.println("<script>" + "alert('비밀번호가 틀립니다 다시 입력하세요!');" + "location.href='changeinfockpwd'" + "</script>");
			w.close();
		}

		return forward;

	}

}