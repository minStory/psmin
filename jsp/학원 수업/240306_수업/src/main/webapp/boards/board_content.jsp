<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!-- 메서드(함수)를 모아 놓은 디렉티브 -->
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%
	request.setAttribute("newLine", "\n");
	request.setAttribute("br", "<br>");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<c:set var="dto" value="${Content }" />
		<hr width="50%" color="tomato">
			<h3>${dto.getBoard_writer() }님 게시글 상세 내역 페이지</h3>
		<hr width="50%" color="tomato">
		
		<table border="1" width="500px">
			<tr>
				<th>글번호</th>
				<td>${dto.getBoard_no() }</td>			
			</tr>
			<tr>
				<th>글 작성자</th>				
				<td>${dto.getBoard_writer() }</td>			
			</tr>
			<tr>
				<th>글 제목</th>				
				<td>${dto.getBoard_title() }</td>			
			</tr>
			<tr>
				<th>글 내용</th>
				<td>
					${fn:replace(dto.getBoard_cont(), newLine, br) }<!-- "" 사용 불가 -->
				</td>
			</tr>
			<tr>
				<th>글 조회수</th>
				<td>${dto.getBoard_hit() }</td>	
			</tr>
			<c:if test="${empty dto.getBoard_update() }">
				<tr>
					<th>글 작성일자</th>
					<td>${dto.getBoard_date() }</td>
				</tr>
			</c:if>
			<c:if test="${!empty dto.getBoard_update() }">
				<tr>
					<th>글 수정일자</th>
					<td>${dto.getBoard_update() }</td>
				</tr>
			</c:if>

			<tr>
				<th>글 비밀번호</th>
				<td>
					<c:forEach begin="1" end="${dto.getBoard_pwd().length()}" var="i" >
						*
					</c:forEach>
				</td>
			</tr>
			
			<c:if test="${empty dto }">
				<tr>
					<td colspan="2" align="center">
						<h5>게시물 번호에 해당하는 게시물이 없습니다..</h5>
					</td>
				</tr>
			</c:if>
		</table>
		</br>
		
		<input type="button" value="글수정" 
			onclick="location.href='board_modify.do?no=${dto.getBoard_no() }&page=${Page }'">&nbsp;&nbsp;&nbsp;
		<input type="button" value="글삭제"
			onclick="if(confirm('게시글을 정말 삭제하시겠습니까?')){location.href='board_delete.do?no=${dto.getBoard_no() }&page=${Page }'}
			else{ return; }">&nbsp;&nbsp;&nbsp;
		<input type="button" value="전체목록"
			onclick="location.href='board_list.do?page=${Page}'">
	</div>
</body>
</html>





