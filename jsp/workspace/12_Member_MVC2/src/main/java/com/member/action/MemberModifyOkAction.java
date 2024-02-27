package com.member.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.member.model.MemberDAO;
import com.member.model.MemberDTO;

public class MemberModifyOkAction implements Action {

	@Override
	public String execute(HttpServletRequest request, HttpServletResponse response) throws IOException {
		
		int num = Integer.parseInt(request.getParameter("num").trim());
		String id = request.getParameter("id").trim();
		String name = request.getParameter("name").trim();
		String pwd = request.getParameter("pwd").trim();
		int age = Integer.parseInt(request.getParameter("age").trim());
		int mileage = Integer.parseInt(request.getParameter("mileage").trim());
		String job = request.getParameter("job").trim();
		String addr = request.getParameter("addr").trim();
		String regdate = request.getParameter("regdate").trim();
		
		System.out.println("입력한 비번 >>> " + pwd);
		
		MemberDTO dto = new MemberDTO();
		dto.setNum(num);
		dto.setMemid(id);
		dto.setMemname(name);
		dto.setPwd(pwd);
		dto.setAge(age);
		dto.setMileage(mileage);
		dto.setJob(job);
		dto.setAddr(addr);
		dto.setRegdate(regdate);
		
		MemberDAO dao = MemberDAO.getInstance();
		
		int check = dao.memberModify(dto);
		
		PrintWriter out = response.getWriter();
		out.println("<script>");
		if(check > 0) {
			out.println("alert('회원정보 수정 성공!')");
			out.println("location.href='select.do'");
		}else if(check < 0) {
			out.println("alert('비밀번호가 틀렸습니다!!')");
			out.println("history.back()");
		}else {
			out.println("alert('회원정보 수정 실패..')");
			out.println("history.back()");
		}
		out.println("</script>");
		
		return null;
	}

}









