package com.member.action;

import com.member.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class MemberInsertAction implements Action{

    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MemberInsertAction 통과");
        return new MyView("/WEB-INF/views/member_insert.jsp");
    }
}
