<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<hr width="50%" color="tomato">
			<h3>JSP_BBS 답변형 게시판 테이블 전체 게시물 리스트 페이지</h3>
		<hr width="50%" color="tomato">
		<br>
		
		<table border="1" width="650">
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>조회수</th>
				<th>작성일자</th>
				<th>Group</th>
				<th>Step</th>
				<th>Indent</th>
			</tr>
			
			<c:set var="list" value="${List }" />
			<c:if test="${!empty list }">
				<c:forEach items="${list }" var="dto">
					<tr>
						<td>${dto.getBoard_no() }</td>
						<td>
							<!-- 댓글인 경우 -->
							<c:if test="${dto.getBoard_indent() != 0 }">
								<c:forEach begin="1" end="${dto.getBoard_indent() }" >
									&nbsp;&nbsp;
								</c:forEach>
							</c:if>
							<a href="${pageContext.request.contextPath }/bbs_content.go?no=${dto.getBoard_no()}">
								${dto.getBoard_title() }
							</a>
						</td>
					</tr>
				</c:forEach>
			</c:if>
		</table>
	</div>
</body>
</html>











