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

input{
	text-align: center;
}
</style>
</head>
<body>
	<div align="center">
		<hr width="50%" color="red">
			<h3>MEMBER 테이블 회원정보 수정 페이지</h3>
		<hr width="50%" color="red">
		<br>
		
		<form method="post" action="${pageContext.request.contextPath }/modify_ok.do">
			<table>
				<c:set var="member" value="${Content }" />
				<tr>
					<th>회원번호</th>
					<td>
						<input type="text" value="${member.getNum() }" name="num" readonly>
					</td>
				</tr>
				
				<tr>
					<th>아이디</th>
					<td>
						<input type="text" value="${member.getMemid() }" name="id" readonly>
					</td>
				</tr>
				
				<tr>
					<th>이름</th>
					<td>
						<input type="text" value="${member.getMemname() }" name="name">
					</td>
				</tr>
				
				<tr>
					<th>나이</th>
					<td>
						<input type="text" value="${member.getAge() }" name="age">
					</td>
				</tr>
				
				<tr>
					<th>마일리지</th>
					<td>
						<input type="text" value="${member.getMileage() }" name="mileage" readonly>
					</td>
				</tr>
				
				<tr>
					<th>직업</th>
					<td>
						<input type="text" value="${member.getJob() }" name="job">
					</td>
				</tr>
				
				<tr>
					<th>주소</th>
					<td>
						<input type="text" value="${member.getAddr() }" name="addr">
					</td>
				</tr>
				
				<tr>
					<th>등록일</th>
					<td>
						<input type="text" value="${member.getRegdate() }" name="regdate" readonly>
					</td>
				</tr>
			</table>
			<br>
			
			<table>
				
				<tr>
					<th>비밀번호 입력</th>
					<td>
						<input type="password" name="pwd">
					</td>
				</tr>
				
				<tr>
					<td colspan="2">
						<input type="submit" value="회원수정">&nbsp;&nbsp;&nbsp;
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