<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>formatDate 예제</h2>
	
	<c:set var="now" value="<%=new Date() %>"/>
	
	<fmt:formatDate value="${now }" type="date" dateStyle="full"/><br>
	<fmt:formatDate value="${now }" type="date" dateStyle="long"/><br>
	<fmt:formatDate value="${now }" type="date" dateStyle="medium"/><br>
	<fmt:formatDate value="${now }" type="date" dateStyle="short"/><br>
	<fmt:formatDate value="${now }" type="time" timeStyle="full"/><br>
	<fmt:formatDate value="${now }" type="time" timeStyle="long"/><br>
	<fmt:formatDate value="${now }" type="time" timeStyle="medium"/><br>
	<fmt:formatDate value="${now }" type="time" timeStyle="short"/><br>
	<fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"/><br>
	<fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="medium"/><br>	
	<fmt:formatDate value="${now }" pattern="MM-dd-yyyy hh:mm:ss"/><br>
	
	한국 현재 시간:
	<fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full"/><br>
	
	<fmt:timeZone value="America/LA">
		미국 LA 현재 시간: <fmt:formatDate value="${now }" type="both" dateStyle="full" timeStyle="full" />
	</fmt:timeZone>
	
</body>
</html>