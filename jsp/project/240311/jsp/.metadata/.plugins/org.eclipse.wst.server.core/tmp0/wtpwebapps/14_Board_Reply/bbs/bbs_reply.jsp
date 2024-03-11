<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		width: 700px;
	}
	table, th, td{
		border: 1px solid black;
		text-align: center;
	}
</style>
</head>
<body>
	<div align="center">
		<hr width="50%" color="red">
			<h3>JSP_BBS 답변형 게시판 테이블 댓글 작성 페이지</h3>
		<hr width="50%" color="red">
		<br><br>
		<form method="post" action="${pageContext.request.contextPath }/reply_ok.go">
			<input type="hidden" name="no" value="${no }">
			<table>
				<tr>
					<th>작성자</th>
					<td>
						<input type="text" name="writer">
					</td>
				</tr>
				
				<tr>
					<th>비밀번호</th>
					<td>
						<input type="password" name="pwd">
					</td>
				</tr>
			
				<tr>
					<th colspan="2">댓글 내용</th>
				</tr>
				
				<tr>
					<td colspan="2">
						<textarea cols="50" name="reply" placeholder="댓글을 입력하세요."></textarea>
					</td>
				</tr>
			</table>
			<br>
			
			<input type="submit" value="댓글등록">&nbsp;&nbsp;&nbsp;
			<input type="reset" value="다시작성">
		</form>
	</div>
</body>
</html>