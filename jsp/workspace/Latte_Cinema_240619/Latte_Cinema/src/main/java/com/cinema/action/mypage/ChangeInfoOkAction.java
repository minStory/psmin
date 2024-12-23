package com.cinema.action.mypage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.MemberDTO;

public class ChangeInfoOkAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id").trim();
		String name = request.getParameter("name").trim();
		String email = request.getParameter("email").trim();
		String phone = "(" + request.getParameter("mobile_carrier").trim() + ")" + request.getParameter("phone1").trim()
				+ "-" + request.getParameter("phone2").trim() + "-" + request.getParameter("phone3").trim();

		MemberDTO dto = new MemberDTO();

		dto.setMember_id(id);
		dto.setMember_name(name);
		dto.setMember_email(email);
		dto.setMember_phone(phone);

		LatteDAO dao = LatteDAO.getInstance();

		int check = dao.updateMember(dto);

		PrintWriter w = response.getWriter();

		if (check < 1) {
			w.println("<script>"
					+ "alert('회원정보 변경실패');"
					+ "location.href='changeinfo'"
					+ "</script>");
			w.close();
		}
		
		HttpSession session = request.getSession();
		session.invalidate();
		session = request.getSession();
		dto = dao.getMemberInfo(id);
		session.setMaxInactiveInterval(1200);
		session.setAttribute("dto", dto);
		session.setAttribute("no", dto.getMember_no().substring(0, 1));
		
		w.println("<script>"
				+ "alert('회원정보 변경 성공!');"
				+ "location.href='mypage';"
				+ "</script>");
		w.close();

		return null;
	}

}
