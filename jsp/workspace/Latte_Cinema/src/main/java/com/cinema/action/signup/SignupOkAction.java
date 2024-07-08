package com.cinema.action.signup;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.MemberDTO;

public class SignupOkAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id").trim();
		String name = request.getParameter("name").trim();
		String email = request.getParameter("email").trim();
		String pwd = request.getParameter("pwd").trim();
		String phone = "(" + request.getParameter("mobile_carrier").trim() + ")" + request.getParameter("phone1").trim()
				+ "-" + request.getParameter("phone2").trim() + "-" + request.getParameter("phone3").trim();

		// 회원번호에 가입일를 넣기 위해 현재 날짜를 구하는 메서드
		// ex) M20240527001
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyMMdd");
		String formattedNow = now.format(formatter);

		MemberDTO dto = new MemberDTO();
		// 회원번호 맨 앞자리에 Member의 M 표기
		// 관리자는 Admin의 A 표기
		//  -> 세션에서 관리자와 구분해야 한다.
		dto.setMember_no("M" + formattedNow);
		dto.setMember_id(id);
		dto.setMember_name(name);
		dto.setMember_email(email);
		dto.setMember_pwd(pwd);
		dto.setMember_phone(phone);

		LatteDAO dao = LatteDAO.getInstance();
		int check = dao.insertMember(dto);

		PrintWriter w = response.getWriter();
		// 회원가입 실패 시 if문 진입
		if (check < 1) {
			w.println("<script>"
					+ "alert('회원가입 실패..');"
					+ "history.back();"
					+ "</script>");
			w.close();
		}

		// 회원가입 성공 시 메인페이지로 이동
		w.println("<script>"
				+ "alert('회원가입 성공!');"
				+ "location.href='main';"
				+ "</script>");
		w.close();

//		ActionForward forward = new ActionForward();
//
//		forward.setPath("/WEB-INF/views/public/signup/signup_ok.jsp");

		return null;
	}

}
