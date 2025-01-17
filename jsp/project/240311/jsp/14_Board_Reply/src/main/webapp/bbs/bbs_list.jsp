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
	table{
		width: 800px;
	}
	table, th, td{
		text-align: center;
	}
</style>
<body>
	<div align="center">
		<hr width="50%" color="red">
			<h3>JSP_BBS 답변형 게시판 테이블 전체 게시물 리스트 페이지</h3>
		<hr width="50%" color="red">
		<br><br>
		
		<table border="1">
			<c:if test="${!empty list }">
			<tr>
				<th>글No.</th><th>글제목</th><th>작성자</th><th>조회수</th>
				<th>작성일시</th><th>Group</th><th>Step</th><th>Indent</th>
			</tr>
			
				<c:forEach items="${list }" var="dto"> 
					<tr>
						<td>${dto.getBoard_no() }</td>
						<td>
							<!-- 댓글인 경우 -->
							<c:if test="${dto.getBoard_indent() != 0 }">
								<c:forEach begin="1" end="${dto.getBoard_indent() }">
										&nbsp;&nbsp;
								</c:forEach>
							</c:if>
							<a href="<%=request.getContextPath() %>/content.go?no=${dto.getBoard_no() }">
									${dto.getBoard_title() }</a>
							<c:set var="rCountList" value="${rCountList }" />
							(${rCountList.get(dto.getBoard_no() - 1) })
						</td>
						<td>${dto.getBoard_writer() }</td>
						<td>${dto.getBoard_hit() }</td>
						<td>${dto.getBoard_date() }</td>
						<td>${dto.getBoard_group() }</td>
						<td>${dto.getBoard_step() }</td>
						<td>${dto.getBoard_indent() }</td>
					</tr>
				</c:forEach>
			</c:if>
			<c:if test="${empty list }">
				<tr>
					<td>
						<h3>데이터가 없습니다...</h3>
					</td>
				</tr>
			</c:if>
		</table>
		<br>
		
		<input type="button" value="게시글등록"
			onclick="location.href='insert.go'">
	</div>
</body>
</html>