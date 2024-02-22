<%@ page import="com.board.model.BoardDTO" %>
<%@ page import="java.util.List" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int listCount = (int)request.getAttribute("Count");
	List<BoardDTO> boards = (List<BoardDTO>)request.getAttribute("List");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board 목록 페이지</title>
</head>
<body>
	<div align="center">
		<hr width="50%" color="tomato">
			<h3>BOARD 전체 목록 페이지</h3>
		<hr width="50%" color="tomato">
		
		<table border="1" width="450px">
			<tr>
				<td colspan="5" align="center">
					전체 게시물 수: <%=listCount %>개
				</td>
			</tr>
			
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>작성일자</th>
			</tr>
			
			<%
				if(boards.size() != 0){
					for(BoardDTO dto : boards){
			%>
				<tr>
					<td><%=dto.getBoard_no() %></td>
					<td><a href="<%=request.getContextPath()%>/content.go?no=<%=dto.getBoard_no()%>">
							<%=dto.getBoard_title() %></a></td>
					<td><%=dto.getBoard_writer() %></td>
					<td><%=dto.getBoard_hit() %></td>
					<td><%=dto.getBoard_date().substring(0,10) %></td>
				</tr>
			<%
					}
				} else {
			%>
				<tr>
					<td colspan="5" align="center">
						<h3>전체 게시물 목록이 없습니다...</h3>
					</td>
				</tr>
			<% } %>
			
		</table>
		<br/><br/>
		
		<input type="button" value="글쓰기"
			onclick="location.href='board/board_write.jsp'">
	
	</div>
</body>
</html>