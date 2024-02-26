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
	<c:set var="coffee" value="${param.coffee_name }" />
	<c:set var="amount" value="${param.amount }" />
	
	<c:choose>
		<c:when test="${coffee == 1 }">
			<c:set var="name" value="아메리카노" />
			<c:set var="price" value="3000" />
		</c:when>
		<c:when test="${coffee == 2 }">
			<c:set var="name" value="카페라떼" />
			<c:set var="price" value="4000" />
		</c:when>
		<c:when test="${coffee == 3 }">
			<c:set var="name" value="카푸치노" />
			<c:set var="price" value="4500" />
		</c:when>
		<c:when test="${coffee == 4 }">
			<c:set var="name" value="마끼아또" />
			<c:set var="price" value="4500" />
		</c:when>
	</c:choose>
	
	
	<div align="center">
		<table border="1" width="350">
			<tr>
				<th>커피 종류</th>
				<td>
					<c:out value="${name }" />
				</td>
			</tr>
			
			<tr>
				<th>커피 단가</th>
				<td>
					<c:out value="${price }" />
				</td>
			</tr>
			
			<tr>
				<th>공급가액</th>
				<td>
					<c:set var="gong" value="${price * amount }" />
					<fmt:formatNumber value="${gong }" />원
				</td>
			</tr>
			
			<tr>
				<th>부가세액</th>
				<td>
					<c:set var="bu" value="${(price * amount) * 0.1 }" />
					<fmt:formatNumber value="${bu }" />원
				</td>
			</tr>
			
			<tr>
				<th>총 금액</th>
				<td>
					<fmt:formatNumber value="${gong + bu }" />원
				</td>
			</tr>
		</table>
	</div>
</body>
</html>






