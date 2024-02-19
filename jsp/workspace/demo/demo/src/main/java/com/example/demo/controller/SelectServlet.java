package com.example.demo.controller;

import com.example.demo.model.DeptDAO;
import com.example.demo.model.DeptDTO;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.ServletException;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.io.IOException;
import java.util.List;

@WebServlet("select")
public class SelectServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public SelectServlet() {
        super();
    }

    protected void service(@NotNull HttpServletRequest request, @NotNull HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");

        System.out.println("확인1");

        DeptDAO dao = DeptDAO.getInstance();

        List<DeptDTO> list = dao.selectList();

        request.setAttribute("List", list);

        RequestDispatcher rd = request.getRequestDispatcher("views/dept_list.jsp");

        rd.forward(request, response);
    }
}