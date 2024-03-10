<%@page import="com.emp.model.EmpDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	EmpDTO dto = (EmpDTO) request.getAttribute("DTO");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 정보 조회 페이지</title>
</head>
<body>
	<div align="center">
		<hr width="50%" color="blue">
			<h2>EMP 테이블 사원 정보 조회 페이지</h2>
		<hr width="50%" color="blue">
		
		<table border="1">
			<tr>
				<th>사원번호</th>
				<td><%=dto.getEmpno() %></td>
			</tr>
			<tr>
				<th>사원이름</th>
				<td><%=dto.getEname() %></td>
			</tr>
		</table>
	</div>
</body>
</html>