<%@page import="com.board.model.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int listCount = (int) request.getAttribute("Count");
	List<BoardDTO> boards = (List<BoardDTO>) request.getAttribute("Boards");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<hr width="50%" color="red">
			<h3>BOARD 테이블 전체 게시물 목록 페이지</h3>
		<hr width="50%" color="red">
		<br>
		
		<!-- 검색 관련 요청 태그 -->
		<form method="post" action="<%=request.getContextPath()%>/search.go">
			<select name="field">
				<option value="title">제목</option>
				<option value="cont">내용</option>
				<option value="title_cont">제목+내용</option>
				<option value="writer">작성자</option>
			</select>
			
			<input type="text" name="keyword">&nbsp;&nbsp;&nbsp;
			<input type="submit" value="검색">
		</form>
		<br>
		
		<table border="1" width="500">
			<tr>
				<td colspan="5" align="right">
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
				<td>
					<a href="<%=request.getContextPath() %>/content.go?board_no=<%=dto.getBoard_no() %>">
						<%=dto.getBoard_title() %>
					</a>
				</td>
				<td><%=dto.getBoard_writer() %></td>
				<td><%=dto.getBoard_hit() %></td>
				<td><%=dto.getBoard_date() %></td>
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
			
			<%
				}
			%>
		</table>
		<br>
		
		<input type="button" value="글쓰기"
			onclick="location.href='board/board_write.jsp'">
		
	</div>
</body>
</html>