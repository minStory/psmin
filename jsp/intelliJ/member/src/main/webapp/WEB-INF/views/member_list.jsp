<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html> 
<head> 
    <meta charset="UTF-8">
    <title>Title</title>
    <style>
        table{
            width: 700px;
        }
        table, th, td{
            border: 1px solid black;
            text-align: center;
        }
    </style>
</head>
<body>
    <div align="center">
        <hr width="50%" color="blue">
            <h2>Member List 페이지</h2>
        <hr width="50%" color="blue">
        <br>

        <table>
            <tr>
                <th>회원번호</th>
                <th>회원명</th>
                <th>아이디</th>
                <th>직업</th>
                <th>주소</th>
                <th>등록일</th>
                <th>상세정보</th>
            </tr>

            <c:if test="${!empty list}">
                <c:forEach items="${list }" var="dto">
                    <tr>
                        <td>${dto.getNum() }</td>
                        <td>${dto.getName() }</td>
                        <td>${dto.getId() }</td>
                        <td>${dto.getJob() }</td>
                        <td>${dto.getAddr() }</td>
                        <td>${dto.getRegdate() }</td>
                        <td>
                            <a href="content?no=${dto.getNum() }">상세정보</a>
                        </td>
                    </tr>
                </c:forEach>
            </c:if>
        </table>
        <br>

        <input type="button" value="회원등록"
            onclick="location.href='insert'">
    </div>
</body>
</html>