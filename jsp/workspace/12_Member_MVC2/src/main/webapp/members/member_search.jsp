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
	border: 1px solid darkgray;
	width: 500px;
}
</style>
</head>
<body>
	<div align="center">
		<hr width="50%" color="navy">
			<h3>MEMBER 테이블 회원 검색 목록 페이지</h3>
		<hr width="50%" color="navy">
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
		
		<table>
			<tr>
				<th>회원번호</th>
				<th>회원명</th>
				<th>회원직업</th>
				<th>회원가입일</th>
				<th>상세내역</th>
			</tr>
			
			<c:set var="list" value="${List }" />
			
			<c:if test="${!empty list }">
				<c:forEach items="${list }" var="dto">
					<tr>
						<td>
							<c:out value="${dto.getNum() }" />
						</td>
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
							<input type="button" value="상세정보"
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
		
		<input type="button" value="회원등록"
			onclick="location.href='insert.do'">&nbsp;&nbsp;&nbsp;
		<input type="button" value="전체목록 이동"
			onclick="location.href='select.do'">
	</div>

</body>
</html>