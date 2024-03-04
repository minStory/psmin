<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 상세정보</title>
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
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
</head>
<body>
	<div align="center">
		<hr>
			<h3>MEMBER 회원 상세정보 조회 페이지</h3>
		<hr>
		<br>
		
		<table class="table table-striped">
			<c:set var="member" value="${Content }" />
			
			<c:if test="${!empty member }">
				<tr>
					<th>회원번호</th>
					<td>
						<c:out value="${member.getNum() }" />
					</td>
				</tr>
				
				<tr>
					<th>아이디</th>
					<td>
						<c:out value="${member.getMemid() }" />
					</td>
				</tr>
				
				<tr>
					<th>이름</th>
					<td>
						<c:out value="${member.getMemname() }" />
					</td>
				</tr>
				
				<tr>
					<th>나이</th>
					<td>
						<c:out value="${member.getAge() }" />
					</td>
				</tr>
				
				<tr>
					<th>마일리지</th>
					<td>
						<c:out value="${member.getMileage() }" />
					</td>
				</tr>
				
				<tr>
					<th>직업</th>
					<td>
						<c:out value="${member.getJob() }" />
					</td>
				</tr>
				
				<tr>
					<th>주소</th>
					<td>
						<c:out value="${member.getAddr() }" />
					</td>
				</tr>
				
				<tr>
					<th>등록일</th>
					<td>
						<c:out value="${member.getRegdate() }" />
					</td>
				</tr>
			</c:if>
			
			<c:if test="${empty member }">
				<tr>
					<td colspan="2">
						<h2>회원 정보가 없습니다.</h2>
					</td>
				</tr>

			</c:if>
		</table>
		<br>
		
		<input class="btn btn-primary" type="button" value="회원수정"
			onclick="location.href='modify?num=${member.getNum() }'">&nbsp;&nbsp;&nbsp;
		<input class="btn btn-primary" type="button" value="뒤로가기"
			onclick="history.back()">&nbsp;&nbsp;&nbsp;
		<input class="btn btn-primary" type="button" value="회원삭제"
			onclick="if(confirm('정말로 게시글을 삭제하시겠습니까?')){
				location.href='delete?num=${member.getNum() }'
				}">
	</div>
</body>
</html>