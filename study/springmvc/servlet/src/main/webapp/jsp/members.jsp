<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="hello.servlet.domain.member.Member" %>
<%@ page import="hello.servlet.domain.member.MemberRepository" %>
<%@ page import="java.util.List" %>
<%
    MemberRepository memberRepository = MemberRepository.getInstance();
    List<Member> members = memberRepository.findAll();
%>
<html>
<head>
<title>Title</title>
</head>
<body>
    <a href="/index.html">메인</a>
    <table>
        <tr>
            <th>id</th>
            <th>username</th>
            <th>age</th>
        </tr>
        <%
            for (Member member : members) {
                out.write(" <tr>");
                out.write(" <td>" + member.getId() + "</td>");
                out.write(" <td>" + member.getUsername() + "</td>");
                out.write(" <td>" + member.getAge() + "</td>");
                out.write(" </tr>");
            }
        %>
    </table>
</body>
</html>