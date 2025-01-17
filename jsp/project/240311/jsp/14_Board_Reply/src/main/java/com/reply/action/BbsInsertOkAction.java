package com.reply.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reply.model.BbsDAO;
import com.reply.model.BbsDTO;

public class BbsInsertOkAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String writer = request.getParameter("writer").trim();
		String title = request.getParameter("title").trim();
		String cont = request.getParameter("cont").trim();
		String pwd = request.getParameter("pwd").trim();
		
		BbsDTO dto = new BbsDTO();
		dto.setBoard_writer(writer);
		dto.setBoard_title(title);
		dto.setBoard_cont(cont);
		dto.setBoard_pwd(pwd);
		
		BbsDAO dao = BbsDAO.getInstance();
		
		int check = dao.bbsInsert(dto);
		
		PrintWriter w = response.getWriter();
		
		ActionForward forward = new ActionForward();
		
		w.println("<script>");
		if(check > 0) {
			w.println("alert('게시글 등록 성공')");
			w.println("location.href='list.go'");
		}else {
			w.println("alert('게시글 등록 실패')");
			w.println("history.back()");
		}
		w.println("</script>");
		
		return forward;
	}
	

}
