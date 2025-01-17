package com.reply.action;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.reply.model.BbsDAO;
import com.reply.model.BbsDTO;
import com.reply.model.BbsReplyDTO;

public class BbsContentAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int no = Integer.parseInt(request.getParameter("no").trim());
		
		BbsDAO dao = BbsDAO.getInstance();
		
		BbsDTO dto = dao.getBbsContent(no);
		List<BbsReplyDTO> rList = dao.getBbsContentReply(no);
		
		dao.updateHit(no);
		
		request.setAttribute("dto", dto);
		request.setAttribute("rList", rList);
		// textarea 줄바꿈 처리
		request.setAttribute("newLine", "\n");
		request.setAttribute("br", "<br>");
		
		ActionForward forward = new ActionForward();
		
		forward.setPath("bbs/bbs_content.jsp");
		
		return forward;
	}

}
