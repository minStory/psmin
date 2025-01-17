package com.reply.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;
	// Action 구현 => 리턴 값 : ActionForward
}
