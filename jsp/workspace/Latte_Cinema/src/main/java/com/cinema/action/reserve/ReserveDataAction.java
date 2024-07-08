package com.cinema.action.reserve;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.simple.JSONObject;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;
import com.cinema.action.StaticArea;
import com.cinema.model.LatteDAO;

public class ReserveDataAction implements Action {

	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		LatteDAO dao = LatteDAO.getInstance();
		
		JSONObject jsonObject = new JSONObject();
		jsonObject.put("seoul_list", StaticArea.getSeoulList());
		jsonObject.put("gyeonggiIncheon_list", StaticArea.getGyeonggiIncheonList());
		jsonObject.put("chungCheongDaeJeon_list", StaticArea.getChungCheongDaeJeonList());
		jsonObject.put("jeollaGwangju_list", StaticArea.getJeollaGwangjuList());
		jsonObject.put("gyeongbukDaegu_list", StaticArea.getGyeongbukDaeguList());
		jsonObject.put("gyeongnamBusanUlsan_list", StaticArea.getGyeongnamBusanUlsanList());
		jsonObject.put("gangwon_list", StaticArea.getGangwonList());
		jsonObject.put("jeju_list", StaticArea.getJejuList());
		jsonObject.put("local_list", StaticArea.getLocalList());
		jsonObject.put("size_list", StaticArea.getSizeList());

		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");

		PrintWriter w = response.getWriter();
		w.write(jsonObject.toJSONString());
		w.close();

		return null;
	}

}
