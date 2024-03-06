<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
        <c:forEach items="${members}" var="member">
            <tr>
                <td>
                    <c:out value="${member.id}" />
                </td>
                <td>
                    <c:out value="${member.username}" />
                </td>
                <td>
                    <c:out value="${member.age}" />
                </td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>