package com.member.action;

import com.member.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MemberContentAction implements Action{
    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MemberContentAction 통과");
        return new MyView("/WEB-INF/views/member_content.jsp");
    }
}
