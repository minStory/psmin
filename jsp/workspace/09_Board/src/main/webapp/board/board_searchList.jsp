<%@page import="com.board.model.BoardDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<BoardDTO> list = (List<BoardDTO>) request.getAttribute("List");
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
			<h3>BOARD 테이블 게시물 검색 목록 페이지</h3>
		<hr width="50%" color="red">
		
		<form method="post" action="<%=request.getContextPath() %>/search.go">
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
		
		<table border="1" width="450px">
			<tr>
				<th>글번호</th>
				<th>글제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>작성일자</th>
			</tr>
			
			<%
				if(list.size() != 0){
					for(BoardDTO dto : list){
			%>
			
			<tr>
				<td><%=dto.getBoard_no() %></td>
				<td><%=dto.getBoard_title() %></td>
				<td><%=dto.getBoard_writer() %></td>
				<td><%=dto.getBoard_hit() %></td>
				<td><%=dto.getBoard_date().substring(0, 10) %></td>
			</tr>
			
			
			<%
					} // for문 end
				} else { //조회된 전체 게시물 목록이 없는 경우
			%>
			
			<tr>
				<td colspan="5" align="center">
					<h3>검색된 게시물 목록이 없습니다...</h3>
				</td>
			</tr>
			
			<%
				}
			%>
			</table>
			<br>
			
			<input type="button" value="전체게시물"
				onclick="location.href='list.go'">
	</div>
</body>
</html>









