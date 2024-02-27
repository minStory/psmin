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
	text-align: center;
	border: 1px solid black;
	width: 400px;
}
</style>
<body>
	<div align="center">
		<hr width="50%" color="marmonn">
			<h3>MEMBER 테이블 회원 추가 폼 페이지</h3>
		<hr width="50%" color="marmonn">
		<br>
		
		<form method="post" action="${pageContext.request.contextPath }/insert_ok.do">
			<table>
				<tr>
					<th>회원 아이디</th>
					<td>
						<input type="text" name="id">
					</td>
				</tr>
				
				<tr>
					<th>회원 이름</th>
					<td>
						<input type="text" name="name">
					</td>
				</tr>
				
				<tr>
					<th>회원 비밀번호</th>
					<td>
						<input type="text" name="pwd">
					</td>
				</tr>
				
				<tr>
					<th>회원 나이</th>
					<td>
						<input type="text" name="age">
					</td>
				</tr>
				
				<tr>
					<th>회원 마일리지</th>
					<td>
						<input type="text" name="mileage">
					</td>
				</tr>
				
				<tr>
					<th>회원 직업</th>
					<td>
						<input type="text" name="job">
					</td>
				</tr>
				
				<tr>
					<th>회원 주소</th>
					<td>
						<input type="text" name="addr">
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="회원추가">&nbsp;&nbsp;&nbsp;
						<input type="reset" value="다시작성">
					</td>
				</tr>
				
				
			</table>
		
		</form>
		
		
	
	</div>
</body>
</html>