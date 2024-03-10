package com.member.action;

import com.member.MyView;
import com.member.model.MemberDAO;
import com.member.model.MemberDTO;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class MemberListAction implements Action{
    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("MemberListAction 통과");

        MemberDAO dao = MemberDAO.getInstance();

        List<MemberDTO> list = dao.getMemberList();

        request.setAttribute("list", list);

        return new MyView("/WEB-INF/views/member_list.jsp");
    }
}
