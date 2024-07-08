package com.cinema.action.login;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.AdminDTO;
import com.cinema.model.LatteDAO;
import com.cinema.model.MemberDTO;

public class LoginOkAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String id = request.getParameter("id").trim();
		String pwd = request.getParameter("pwd").trim();

		LatteDAO dao = LatteDAO.getInstance();

		// 로그인할 계정이 관리자 계정에 속하는지 확인하는 메서드
		boolean admin_check = dao.checkBelongToAdmin(id);
		
		PrintWriter w = response.getWriter();
		HttpSession session = request.getSession();
		session.invalidate(); // 비로그인일 때 생성된 세션을 해제
		
		// 관리자 계정에 속한다면
		if (admin_check) {
			AdminDTO input_dto = new AdminDTO();
			input_dto.setAdmin_id(id);
			input_dto.setAdmin_pwd(pwd);

			int check = dao.checkAdminLogin(input_dto);
			if (check == 1) {
				session = request.getSession(); // 새로운 세션 생성
				AdminDTO dto = dao.getAdminInfo(id);
				session.setMaxInactiveInterval(3600); // 세션 유지시간
				session.setAttribute("dto", dto);
				session.setAttribute("no", dto.getAdmin_no().substring(0, 1));

				w.println("<script>"
						+ "alert('관리자 로그인 성공!');"
						+ "location.href='main';" 
						+ "</script>");
			} else if (check == 0) {
				w.println("<script>" 
						+ "alert('일치하는 아이디를 찾을 수 없습니다.');" 
						+ "history.back();"
						+ "</script>");
			} else {
				w.println("<script>" 
						+ "alert('비밀번호가 일치하지 않습니다.');" 
						+ "history.back();" 
						+ "</script>");
			}
		// 회원 계정에 속한다면
		} else {
			MemberDTO input_dto = new MemberDTO();
			input_dto.setMember_id(id);
			input_dto.setMember_pwd(pwd);

			int check = dao.checkMemberLogin(input_dto);

			if (check == 1) {
				session = request.getSession(); // 새로운 세션 생성
				MemberDTO dto = dao.getMemberInfo(id);
				session.setMaxInactiveInterval(1200); // 세션 유지시간
				session.setAttribute("dto", dto);
				session.setAttribute("no", dto.getMember_no().substring(0, 1));

				w.println("<script>"
						+ "alert('로그인 성공!');"
						+ "location.href='main';"
						+ "</script>");
			} else if (check == 0) {
				w.println("<script>"
						+ "alert('일치하는 아이디를 찾을 수 없습니다.');"
						+ "history.back();"
						+ "</script>");
			} else {
				w.println("<script>"
						+ "alert('비밀번호가 일치하지 않습니다.');"
						+ "history.back();"
						+ "</script>");
			}
		}
		w.close();

		return null;
	}

}
