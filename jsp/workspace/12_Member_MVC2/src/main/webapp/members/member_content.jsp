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
	width: 400px;
}
</style>
</head>
<body>
	<div align="center">
		<hr width="50%" color="navy">
			<h3>MEMBER 회원 상세정보 조회 페이지</h3>
		<hr width="50%" color="navy">
		<br>
		
		<table>
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
		
		<input type="button" value="회원수정"
			onclick="location.href='modify.do?num=${member.getNum() }'">&nbsp;&nbsp;&nbsp;
		<input type="button" value="뒤로가기"
			onclick="history.back()">&nbsp;&nbsp;&nbsp;
		<input type="button" value="회원삭제"
			onclick="if(confirm('정말로 게시글을 삭제하시겠습니까?')){
				location.href='delete.do?num=${member.getNum() }'
				}">
	</div>
</body>
</html>