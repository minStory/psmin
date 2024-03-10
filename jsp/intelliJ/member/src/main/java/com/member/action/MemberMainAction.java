package com.member.action;

import com.member.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MemberMainAction implements Action{
    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MemberMainAction 통과");
        return new MyView("/WEB-INF/main.jsp");
    }
}
