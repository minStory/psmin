<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	table{
		width: 700px
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
			<h3>JSP_BBS 답변형 게시판 테이블 게시글 추가 페이지</h3>
		<hr width="50%" color="red">
		<br><br>
		
		<table>
			<tr>
				<th>글번호</th>
				<td>${dto.getBoard_no() }</td>
				<th>작성자</th>
				<td>${dto.getBoard_writer() }</td>
			</tr>
			
			<tr>
				<c:if test="${empty dto.getBoard_update() }">
					<th>작성일자</th>
					<td>${dto.getBoard_date() }</td>
				</c:if>
				
				<c:if test="${!empty dto.getBoard_update() }">
					<th>수정일자</th>
					<td>${dto.getBoard_update() }</td>
				</c:if>
				<th>조회수</th>
				<td>${dto.getBoard_hit() }</td>
			</tr>
			
			<tr>
				<th>글제목</th>
				<td colspan="3">${dto.getBoard_title() }</td>
				
			</tr>
			
			<tr>
				<th>글내용</th>
				<td colspan="3">${fn:replace(dto.getBoard_cont(), newLine, br)}</td>
			</tr>
		
		</table>
		<br>
		
		<c:if test="${!empty rList}">
			<table>
				<tr>
					<th colspan="3">댓글</th>
				</tr>
				<tr>
					<th>작성자</th>
					<th>내용</th>
					<th>작성일시</th>
				</tr>
				<c:forEach items="${rList }" var="rDto">
					<tr>
						<td>${rDto.getBoard_writer() }</td>
						<td>${rDto.getBoard_reply() }</td>
						<td>${rDto.getBoard_date() }</td>
					</tr>
				</c:forEach>
			</table>
		</c:if>
		
		<c:if test="${empty rList }">
			<table>
				<tr>
					<td>
						<h3>댓글이 없습니다...</h3>
					</td>
				<tr>
			</table>
		</c:if>
		<br>
		
		<input type="button" value="댓글작성"
			onclick="location.href='reply.go?no=${dto.getBoard_no() }'">&nbsp;&nbsp;&nbsp;
		<input type="button" value="글수정"
			onclick="location.href='modify.go?no=${dto.getBoard_no() }'">&nbsp;&nbsp;&nbsp;
		<input type="button" value="글삭제"
			onclick="location.href='delete.go?no=${dto.getBoard_no() }'">&nbsp;&nbsp;&nbsp;
		<input type="button" value="목록이동"
			onclick="location.href='list.go'">
	</div>
</body>
</html>