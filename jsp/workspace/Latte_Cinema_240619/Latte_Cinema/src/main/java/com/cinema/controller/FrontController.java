package com.cinema.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;
import java.util.StringTokenizer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cinema.action.Action;
import com.cinema.action.ActionForward;

public class FrontController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");

		String uri = request.getRequestURI();
		// System.out.println("uri = " + uri);
		String path = request.getContextPath();
		// System.out.println("path = " + path);
		String command = uri.substring(path.length() + 1);
		// System.out.println("command = " + command);

		Action action = null;
		ActionForward forward = null;
		Properties prop = new Properties();

		FileInputStream fis = new FileInputStream(
				"D:\\workspace\\Latte_Cinema\\src\\main\\java\\com\\cinema\\controller\\mapping.properties");

		prop.load(fis);

		String value = prop.getProperty(command);
		// System.out.println("value = " + value);

		// jsp 파일에서 c:import 태그를 통해 서블릿을 직접 불러온 경우
		if (command.endsWith(".jsp")) {

			try {
				Class<?> url = Class.forName("com.cinema.action.MainPageAction");
				// System.out.println("MainPageAction 실행");

				Constructor<?> constructor = url.getConstructor();

				action = (Action) constructor.newInstance();

				forward = action.execute(request, response);

			} catch (Exception e) {
				e.printStackTrace();
			}

			// mapping.properties를 통해 Action을 지정한 경우
		} else if (value.substring(0, 7).equals("execute")) {

			StringTokenizer st = new StringTokenizer(value, "|");

			String url_1 = st.nextToken();
			String url_2 = st.nextToken();

			try {
				Class<?> url = Class.forName(url_2);

				Constructor<?> constructor = url.getConstructor();

				action = (Action) constructor.newInstance();

				forward = action.execute(request, response);

			} catch (Exception e) {
				e.printStackTrace();
			}

			// mapping.properties를 통해 직접 url을 지정한 경우
		} else {
			forward = new ActionForward();
			forward.setRedirect(false);
			forward.setPath(value);
		}

		// forward가 비어있지 않다면 페이지 이동
		if (forward != null) {
			if (forward.isRedirect()) {
				response.sendRedirect(forward.getPath());
			} else {
				RequestDispatcher rd = request.getRequestDispatcher(forward.getPath());
				rd.forward(request, response);
			}
		}
	}
}
