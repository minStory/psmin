<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 검색</title>
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
		width:700px;
		text-align:center;
	}
</style>
</head>
<body>
	<div align="center">
		<hr>
			<h3>MEMBER 테이블 회원 검색 목록 페이지</h3>
		<hr>
		<br>
		
		<form method="post" action="${pageContext.request.contextPath }/search">
			<select name="field">
				<option value="id">아이디</option>
				<option value="name">이름</option>
				<option value="job">직업</option>
				<option value="addr">주소</option>
			</select>
			<input type="text" name="keyword">&nbsp;&nbsp;&nbsp;
			<input type="submit" value="검색">
		</form>
		<br>
		
		<!-- 검색한 내용 미리보기 추가!! -->
		
		<!-- 검색 후 정렬 및 페이징 적용 -->
		
		
		<table class="table table-striped">
			<tr>
				<th colspan="5">
					<h5>검색된 회원 수: ${count }명</h5>
				</th>
			</tr>
		
			<tr>
				<th>회원번호</th>
				<th>회원명</th>
				<th>회원직업</th>
				<th>회원가입일</th>
				<th>상세정보</th>
			</tr>
			
			<c:set var="list" value="${List }" />
			
			<c:if test="${!empty list }">
				<c:forEach items="${list }" var="dto">
					<tr>
						<th>
							<c:out value="${dto.getNum() }" />
						</th>
						<td>
							<c:out value="${dto.getMemname() }" />
						</td>
						<td>
							<c:out value="${dto.getJob() }" />
						</td>
						<td>
							<c:out value="${dto.getRegdate().substring(0, 10) }" />
						</td>
						<td>
							<input class="btn btn-primary" type="button" value="상세정보"
								onclick="location.href='content?num=${dto.getNum()}'">
						</td>
					</tr>
				</c:forEach>
			</c:if>
			
			<c:if test="${empty list }">
				<tr>
					<td colspan="5">
						<h3>전체 회원 리스트가 없습니다..</h3>
					</td>
				</tr>
			</c:if>
		</table>
		<br>
		
		<input class="btn btn-primary" type="button" value="회원등록"
			onclick="location.href='insert'">&nbsp;&nbsp;&nbsp;
		<input class="btn btn-primary" type="button" value="전체목록 이동"
			onclick="location.href='select'">
	</div>

</body>
</html>