<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
	   <hr width="30%" color="marmoon">
		  <h2>메인 페이지</h2>
	   <hr width="30%" color="marmoon">
	   <br> <br>
	   
	   <h3> <%=request.getAttribute("name") %>님 환영합니다.<br>
	   	    연락처 : <%=request.getAttribute("phone") %>
	   </h3>
	   
	   <h4>
	      입력받은 아이디 : <%=request.getParameter("id").trim() %> <br>
	      입력받은 비밀번호 : <%=request.getParameter("pwd").trim() %>
	   </h4>
	   
	</div>
	
</body>
</html>