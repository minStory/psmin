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

public class ChangeOkPasswordAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		HttpSession session = request.getSession(false);
		PrintWriter w = response.getWriter();
		MemberDTO dto = (MemberDTO)session.getAttribute("dto");
		
		String dbpwd = dto.getMember_pwd();
		String no = dto.getMember_no();
		
		String pwd_now = request.getParameter("pwd_now");
		String pwd = request.getParameter("pwd");
		
		
		if(dbpwd.equals(pwd_now)) {
			
			MemberDTO mdto = new MemberDTO();
			mdto.setMember_no(no);
			mdto.setMember_pwd(pwd);
			
			LatteDAO dao = LatteDAO.getInstance();
			
			int check = dao.updatePwd(mdto);
			
			if (check < 1) {
				w.println("<script>"
						+ "alert('비밀번호 변경실패!');"
						+ "location.href='main'"
						+ "</script>");
				w.close();
				}else {
				w.println("<script>"
						+ "alert('비밀번호 변경성공!');"
						+ "location.href='mypage';"
						+ "</script>");
				w.close();
				}
		}else {
			w.println("<script>"
					+ "alert('비밀번호 변경실패');"
					+ "location.href='mypage'"
					+ "</script>");
			w.close();
		}
		
		
		
		return null;
	}

}
