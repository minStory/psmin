<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
table, th, td{
	text-align: center;
	border: 1px solid darkgray;
	width: 400px;
}
</style>
<script>

	function check(){
		if(frm.id.value == ""){
			alert("아이디를 입력하세요!");
			frm.id.focus();
			return false;
		}
		
		if(frm.name.value == ""){
			alert("이름을 입력하세요!");
			frm.name.focus();
			return false;
		}
		
		if(frm.pwd.value == ""){
			alert("비밀번호를 입력하세요!");
			frm.pwd.focus();
			return false;
		}
		
		if(frm.pwd_check.value == ""){
			alert("비밀번호를 입력하세요!");
			frm.pwd_check.focus();
			return false;
		}
		
		if(frm.pwd.value != frm.pwd_check.value){
			alert("비밀번호가 서로 다릅니다!");
			frm.pwd_check.focus();
			return false;
		}
		
		if(frm.age.value == ""){
			frm.age.value = 0;
		}
	}
</script>
<body>
	<div align="center">
		<hr width="50%" color="navy">
			<h3>MEMBER 테이블 회원 추가 페이지</h3>
		<hr width="50%" color="navy">
		<br>
		
		<form method="post" action="${pageContext.request.contextPath }/insert_ok"
			name="frm" onsubmit="return check()">
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
						<input type="password" name="pwd">
					</td>
				</tr>
				
				<tr>
					<th>비밀번호 확인</th>
					<td>
						<input type="password" name="pwd_check">
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
						<input type="text" name="mileage" value="1000" readonly>
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
			</table>
			<br>
			
			<input type="submit" value="회원추가">&nbsp;&nbsp;&nbsp;
			<input type="reset" value="다시작성">&nbsp;&nbsp;&nbsp;
			<input type="button" value="뒤로가기"
				onclick="history.back()">
		</form>
	</div>
</body>
</html>