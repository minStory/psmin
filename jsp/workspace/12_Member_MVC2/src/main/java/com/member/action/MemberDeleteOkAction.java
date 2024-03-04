package com.member.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.member.model.MemberDAO;

public class MemberDeleteOkAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int num = Integer.parseInt(request.getParameter("num"));
		String pwd = request.getParameter("pwd");
		
		System.out.println("입력한 비번 >>> " + pwd);
		
		MemberDAO dao = MemberDAO.getInstance();
		
		int check = dao.memberDelete(num, pwd);
		
		dao.updateSequence(num);
		
		PrintWriter out = response.getWriter();
		out.println("<script>");
		if(check > 0) {
			out.println("alert('회원 삭제 성공!')");
			out.println("location.href='select'");
		}else if(check < 0) {
			out.println("alert('비밀번호가 틀렸습니다!!')");
			out.println("history.back()");
		}else {
			out.println("alert('회원 삭제 실패..')");
			out.println("history.back()");
		}
		out.println("</script>");
		
		return null;
	}

}
