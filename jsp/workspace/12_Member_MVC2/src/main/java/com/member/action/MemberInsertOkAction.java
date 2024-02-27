package com.member.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.member.model.MemberDAO;
import com.member.model.MemberDTO;

public class MemberInsertOkAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		String id = request.getParameter("id").trim();
		String name = request.getParameter("name").trim();
		String pwd = request.getParameter("pwd").trim();
		int age = Integer.parseInt(request.getParameter("age").trim());
		int mileage = Integer.parseInt(request.getParameter("mileage").trim());
		String job = request.getParameter("job").trim();
		String addr = request.getParameter("addr").trim();
		
		MemberDTO dto = new MemberDTO();
		dto.setMemid(id);
		dto.setMemname(name);
		dto.setPwd(pwd);
		dto.setAge(age);
		dto.setMileage(mileage);
		dto.setJob(job);
		dto.setAddr(addr);		
		
		MemberDAO dao = MemberDAO.getInstance();
		
		int check = dao.memberInsert(dto);
		
		PrintWriter out = response.getWriter();
		out.println("<script>");
		if(check > 0) {
			out.println("alert('회원 추가 성공!')");
			out.println("location.href='select.do'");
		}else {
			out.println("alert('회원 추가 실패...')");
			out.println("history.back()");
		}
		out.println("</script>");
		
		return null;
	}

}
