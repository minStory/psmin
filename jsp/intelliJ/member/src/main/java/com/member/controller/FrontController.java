package com.member.controller;

import com.member.*;
import com.member.action.*;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

@WebServlet(name = "frontController", urlPatterns = "/test/*")
public class FrontController extends HttpServlet {

    private Map<String, Action> controllerMap = new HashMap<>();

    public FrontController(){
        controllerMap.put("/test/main", new MemberMainAction());
        controllerMap.put("/test/select", new MemberListAction());
        controllerMap.put("/test/insert", new MemberInsertAction());
        controllerMap.put("/test/content", new MemberContentAction());
    }

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        String uri = request.getRequestURI();
        System.out.println("uri = " + uri);

        Action controller = controllerMap.get(uri);
        if (controller == null) {
            response.setStatus(HttpServletResponse.SC_NOT_FOUND);
            return;
        }

        MyView view = controller.process(request, response);
        view.render(request, response);
    }
}