package com.cinema.action.admin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.LatteDAO;
import com.cinema.model.MemberDTO;

public class AdminMemberOkModifyAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String no = request.getParameter("no");
		String id = request.getParameter("id");
		String pwd = request.getParameter("pwd");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");
		String email = request.getParameter("email");
		int mileage = Integer.parseInt(request.getParameter("mileage"));
		String grade = request.getParameter("grade");
		String date = request.getParameter("date");

		MemberDTO dto = new MemberDTO();

		dto.setMember_no(no);
		dto.setMember_id(id);
		dto.setMember_pwd(pwd);
		dto.setMember_name(name);
		dto.setMember_phone(phone);
		dto.setMember_email(email);
		dto.setMember_mileage(mileage);
		dto.setMember_grade(grade);
		dto.setMember_signup_date(date);

		LatteDAO dao = LatteDAO.getInstance();

		int check = dao.updateMemberByAdmin(dto);

		PrintWriter out = response.getWriter();

		if (check > 0) {
			out.println("<script>");
			out.println("alert('멤버 수정 성공!!!')");
			out.println("location.href='admin_main'");
			out.println("</script>");
		} else {
			out.println("<script>");
			out.println("alert('멤버 수정 실패')");
			out.println("history.back()");
			out.println("</script>");
		}

		return null;
	}

}
