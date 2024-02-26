<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>JSTL의 기본적인 태그들</h2>
	
	<!-- 1. 변수 선언 태그(set) -->
	--- 변수 str 선언 ---
	<c:set var="str" value="Hello JSTL!!" />
	
	<hr>
	
	<!-- 2. 출력 태그(out) -->
	값 출력 >>> <c:out value="${str }" /> <br>
	
	<hr>
	
	<!-- 3. 삭제 태그(remove) -->
	--- 변수 str 삭제 ---
	<c:remove var="str" /> <br>
	
	삭제 후 값 출력 >>> <c:out value="${str }" /> <br>
	
	<hr>
	
	<!-- 4. 조건 태그(if) -->
	<c:set var="str" value="JSTL If Test!!" />
	
	--- 10 < 5(false) 조건 출력 --- <br>
	<c:if test="${10 < 5 }">
		<c:out value="${str }" />
	</c:if> <br>
	
	--- 10 > 5(true) 조건 출력 --- <br>
	<c:if test="${10 > 5 }">
		<c:out value="${str }" />
	</c:if> <br>
	
	
	<hr>
	
	<!-- 5. 다중 처리 태그(choose) -->
	<c:set var="grade" value="88" />
	
	<c:choose>
		<c:when test="${grade >= 90 }">
			결과: A학점입니다.
		</c:when>
		<c:when test="${grade >= 80 }">
			결과: B학점입니다.
		</c:when>
		<c:when test="${grade >= 70 }">
			결과: C학점입니다.
		</c:when>
		<c:when test="${grade >= 60 }">
			결과: D학점입니다.
		</c:when>
		<c:otherwise>
			결과: F학점입니다.
		</c:otherwise>
	</c:choose>
	
	<hr>
	
	<!-- 6. 반복 태그(forEach) -->
	<c:forEach var="i" begin="1" end="10" step="1">
		<c:out value="${i }" /> &nbsp;&nbsp;&nbsp;
	</c:forEach>
	
	<hr>
	
	<!-- 향상된 for문 -->
	<%
		String[] str = {"홍길동", "이순신", "유관순", "세종대왕", "김연아"};
		pageContext.setAttribute("List", str);
	%>
	
	<c:forEach items="${List }" var="i">
		<c:out value="${i }" /> &nbsp;&nbsp;&nbsp;
	</c:forEach>
	
	
</body>
</html>