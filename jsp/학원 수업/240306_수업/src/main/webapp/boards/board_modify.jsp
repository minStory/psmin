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
	<div align="center">
		<c:set var="dto" value="${Content }" />
		<hr width="50%" color="tomato">
			<h3>${dto.getBoard_writer() }님 게시글 수정 폼 페이지</h3>
		<hr width="50%" color="tomato">
		
		
		<form method="post" action="${pageContext.request.contextPath }/board_modify_ok.do">
		
		<!-- 글번호, DB pwd, page는 히든으로 넘긴다. -->
		<input type="hidden" name="no" value="${dto.getBoard_no() }">
		<input type="hidden" name="db_pwd" value="${dto.getBoard_pwd() }">
		<input type="hidden" name="page" value="${Page }">
		
			<table border="1">
				<tr>
					<th>작성자</th>
					<td>
						<input type="text" name="writer" value="${dto.getBoard_writer() }" readonly>
					</td>
				</tr>
				
				<tr>
					<th>글 제목</th>
					<td>
						<input type="text" name="title" value="${dto.getBoard_title() }">
					</td>
				</tr>
				
				<tr>
					<th>글 내용</th>
					<td>
						<textarea type="text" cols="25" name="content" value="${dto.getBoard_cont() }"></textarea>
					</td>
				</tr>
				
				<tr>
					<th>비밀번호</th>
					<td>
						<input type="password" name="pwd">
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="글수정">
						<input type="reset" value="다시작성">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>