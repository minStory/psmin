package com.member.action;

import com.member.MyView;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface Action {
    MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException;

}
