<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%-- 구구단을 웹 브라우저에 출력을 해 보자. --%>
	<%
		for(int i=2; i<10; i++) {
			
			for(int j=1; j<=9; j++) {
	%>		
		        <%=i %> * <%=j %> = <%=i * j %> <br>	
	<% 		} %>
			
			<br>
	<% 	} %>
	
	
	
	
</body>
</html>