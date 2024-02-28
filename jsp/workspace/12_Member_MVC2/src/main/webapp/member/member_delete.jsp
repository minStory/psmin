<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table, th, td{
	text-align: center;
	border: 1px solid black;
	width: 400px;
}
</style>
</head>
<body>
	<div align="center">
		<hr width="50%" color="marmonn">
			<h3>MEMBER 테이블 회원 삭제 페이지</h3>
		<hr width="50%" color="marmonn">
		<br>
		
		<form method="post" action="${pageContext.request.contextPath }/delete_ok.do">
			<input type="hidden" name="num" value="${Num }">
			<table>
				<tr>
					<th>삭제할 게시글<br>비밀번호</th>
					<td>
						<input type="password" name="pwd">
					</td>
				</tr>
				
				<tr>
					<td colspan="2">
						<input type="submit" value="글삭제">&nbsp;&nbsp;&nbsp;
						<input type="reset" value="다시작성">&nbsp;&nbsp;&nbsp;
						<input type="button" value="뒤로가기"
							onclick="history.back()">
					</td>
				</tr>
			
			</table>
		
		
		</form>
		
	</div>
</body>
</html>