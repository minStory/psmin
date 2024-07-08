<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table, th, td{
		border: 1px solid black;
		text-align: center;
	}
</style>
</head>
<body>
	<div align="center">
		<hr width="50%" color="red">
			<h3>JSP_BBS 답변형 게시판 테이블 게시글 추가 페이지</h3>
		<hr width="50%" color="red">
		<br><br>
		
		<form method="post" action="${pageContext.request.contextPath }/insert_ok.go">
			<table>
				<tr>
					<th>작성자</th>
					<td>
						<input type="text" name="writer">
					</td>
				</tr>
				
				<tr>
					<th>글제목</th>
					<td>
						<input type="text" name="title">
					</td>
				</tr>
				
				<tr>
					<th>글내용</th>
					<td>
						<textarea cols="50" name="cont"></textarea>
					</td>
				</tr>
				
				<tr>
					<th>비밀번호</th>
					<td>
						<input type="password" name="pwd">
					</td>
				</tr>
			</table>
			<br>
			
			<input type="submit" value="게시글등록">  
			<input type="reset" value="다시작성">
		
		</form>
	</div>
</body>
</html>