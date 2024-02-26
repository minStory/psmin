<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		int res = 45 + 171;
	
		pageContext.setAttribute("Res", res);
		
		request.setAttribute("R", 100);
		
		session.setAttribute("S", 1000);
		
		application.setAttribute("A", 10000);
		
		request.getRequestDispatcher("ex06.jsp").forward(request, response);
	%>
	
	<h3>
		결과 >>> <%=res %> <br/>
		
		결과(EL) >>> ${Res }
	</h3>
</body>
</html>