package com.reply.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reply.model.BbsDAO;
import com.reply.model.BbsReplyDTO;

public class BbsReplyOkAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int no = Integer.parseInt(request.getParameter("no").trim());
		String writer = request.getParameter("writer").trim();
		String pwd = request.getParameter("pwd").trim();
		String reply = request.getParameter("reply").trim();
		
		BbsReplyDTO rDto = new BbsReplyDTO();
		rDto.setBoard_group(no);
		rDto.setBoard_writer(writer);
		rDto.setBoard_pwd(pwd);
		rDto.setBoard_reply(reply);
				
		BbsDAO dao = BbsDAO.getInstance();
		
		int check = dao.bbsReply(rDto);
		
		ActionForward forward = new ActionForward();
		
		PrintWriter w = response.getWriter();
		
		w.println("<script>");
		if(check > 0) {
			w.println("alert('댓글 등록 성공!')");
			w.println("location.href='content.go?no=" + no + "'");
		}else {
			w.println("alert('댓글 등록 실패')");
			w.println("history.back()");
		}
		w.println("</script>");
		
		return forward;
	}
	
}
