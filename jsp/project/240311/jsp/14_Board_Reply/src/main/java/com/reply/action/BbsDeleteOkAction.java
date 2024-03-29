package com.reply.action;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reply.model.BbsDAO;

public class BbsDeleteOkAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int no = Integer.parseInt(request.getParameter("no").trim());
		String pwd = request.getParameter("pwd").trim();
		
		BbsDAO dao = BbsDAO.getInstance();
		
		String db_pwd = dao.getBbsContent(no).getBoard_pwd();
		
		System.out.println("no = " + no);
		System.out.println("pwd = " + pwd);
		System.out.println("db_pwd = " + db_pwd);
		
		PrintWriter w = response.getWriter();
		
		w.println("<script>");
		
		if(pwd.equals(db_pwd)) {
			
			int check = dao.bbsDelete(no);
			
			if(check > 0) {
				dao.updateSequence(no);
				w.println("alert('게시글 삭제 성공!')");
				w.println("location.href='list.go'");
			}else {
				w.println("alert('게시글 삭제 실패..')");
				w.println("location.href='delete.go?no=" + no + "'");
			}
		}else {
			w.println("alert('비밀번호가 틀렸습니다!!')");
			w.println("location.href='delete.go?no=" + no + "'");
		}
		w.println("</script>");
		
		ActionForward forward = new ActionForward();
		
		return forward;
	}

}
