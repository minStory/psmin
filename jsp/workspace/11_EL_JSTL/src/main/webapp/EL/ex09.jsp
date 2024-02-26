<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");

	String id = request.getParameter("id").trim();
	String name = request.getParameter("name").trim();
	String age = request.getParameter("age").trim();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h3>표현언어(EL)를 이용하여 파라미터 값을 출력하는 방법</h3>
		
		<table border="1" width="300">
			<tr>
				<th>구분</th>
				<th>EL언어</th>
				<th>JSP언어</th>
			</tr>
			
			<tr>
				<th>아이디</th>
				<td>${param.id }</td>
				<td><%=id %></td>
			</tr>
			
			<tr>
				<th>이름</th>
				<td>${param.name }</td>
				<td><%=name %></td>
			</tr>
			
			<tr>
				<th>나이</th>
				<td>${param.age }</td>
				<td><%=age %></td>
			</tr>
		</table>
	</div>
</body>
</html>