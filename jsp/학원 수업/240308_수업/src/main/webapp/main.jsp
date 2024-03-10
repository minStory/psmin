<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
table, th, td{
border: 1px solid black;
width: 500px;
text-align: center;
}
</style>
<body>
	<div align="center">
	   <hr width="50%" color="blue">
	      <h3>JSP_BBS 답변형 게시판 테이블 메인 페이지</h3>
	   <hr width="50%" color="blue">
	   <br>
	   
	   <a href="${pageContext.request.contextPath }/bbs_list.go">[전체 게시물 목록]</a>
	   
	</div>

</body>
</html>