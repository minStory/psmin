<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 추가</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
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
</head>
<style>
	hr{
		width:50%;
		background-color: navy;
	}
	.table{
		width:500px;
		text-align:center;
	}
</style>
<body>
	<div align="center">
		<hr>
			<h3>MEMBER 테이블 회원 추가 페이지</h3>
		<hr>
		<br>
		
		<form method="post" action="${pageContext.request.contextPath }/insert_ok"
			name="frm" onsubmit="return check()">
			<table class="table table-striped">
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
			
			<input class="btn btn-primary" type="submit" value="회원추가">&nbsp;&nbsp;&nbsp;
			<input class="btn btn-primary" type="reset" value="다시작성">&nbsp;&nbsp;&nbsp;
			<input class="btn btn-primary" type="button" value="뒤로가기"
				onclick="history.back()">
		</form>
	</div>
</body>
</html>