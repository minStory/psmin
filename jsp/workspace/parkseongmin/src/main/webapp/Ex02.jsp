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
		<hr width="50%" color="blue">
			<h2>로그인 페이지</h2>
		<hr width="50%" color="blue">
		<br><br>
		
		<form action="LoginServlet" method="get">
			<table border="1">
				<tr>
					<th>아이디</th>
					<td>
					<input type="text" name="id">
					<%-- 텍스트박스에 입력된 아이디를 id 라는 변수에
						 저장하여 LoginServlet이라는 서블릿으로 
						 전송을 하라는 의미 
						 만약에 텍스트박스 아이디 입력창에 "hong"이라고
						 입력을 하면 
						 String id = "hong" 이라고 저장이 되어
						 LoginServlet이라는 서블릿으로 정보가 전송이 
						 된다는 의미.--%>
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
					<input type="submit" value="로그인">&nbsp;
					<input type="reset" value="취소">
					</td>
				</tr>
			</table>
		</form>
			
	</div>
</body>
</html>