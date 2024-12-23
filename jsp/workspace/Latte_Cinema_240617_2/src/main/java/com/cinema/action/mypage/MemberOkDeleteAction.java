package com.cinema.action.mypage;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.model.MemberDTO;
import com.cinema.model.LatteDAO;

public class MemberOkDeleteAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		HttpSession session = request.getSession(false);
		MemberDTO dto = (MemberDTO) session.getAttribute("dto");
		PrintWriter w = response.getWriter();
		
		int check = 0;
		
		String no = dto.getMember_no();
		String password = dto.getMember_pwd();
		String pwd = request.getParameter("pwd");
		
		if(password.equals(pwd)) {
			
	
			LatteDAO dao = LatteDAO.getInstance();
			
			check = dao.deleteMember(no);
			
			
		}else{
			w.println("<script>"
					+ "alert('비밀번호가 틀립니다!');"
					+ "location.href='mypage';"
					+ "</script>");
			w.close();
		}
		
		
		if(check < 1) {
			w.println("<script>"
					+ "alert('회원탈퇴 실패..');"
					+ "history.back();"
					+ "</script>");
			w.close();
			
		}else {
			w.println("<script>"
					+ "alert('회원탈퇴 성공!');"
					+ "location.href='logout';"
					+ "</script>");
			w.close();
		}
			
		
		
		
		
		return null;
	}

}
