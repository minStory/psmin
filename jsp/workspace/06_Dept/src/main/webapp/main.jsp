<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 메인 페이지</title>
</head>
<body>
	<div align="center">
		<hr width="50%" color="blue">
		<h3>DEPT 테이블 메인 페이지</h3>
		<hr width="50%" color="blue">
		<%-- 부서 목록으로 경로 이동  --%>
		<a href="<%=request.getContextPath() %>/select">[전체 부서 목록]</a>
	</div>
</body>
</html>