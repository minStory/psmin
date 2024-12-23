package com.car.action.mypage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.car.action.Action;
import com.car.action.ActionForward;
import com.car.action.StaticArea;
import com.car.model.ReqSellBoardDTO;
import com.car.model.TotalDAO;

public class MycarInfoContentAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		StaticArea.checkUserDTO(request, response);

		int board_no = Integer.parseInt(request.getParameter("no").trim());

		TotalDAO dao = TotalDAO.getInstance();

		ReqSellBoardDTO dto = dao.getReqSellBoardContent(board_no);

		request.setAttribute("cont", dto);

		ActionForward forward = new ActionForward();

		forward.setPath("/WEB-INF/views/public/mypage/mycar_info_content.jsp");

		return forward;
	}

}