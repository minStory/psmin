<%@page import="com.board.model.BoardDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	BoardDTO board = (BoardDTO) request.getAttribute("Content");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<hr width="50%" color="tomato">
			<h3>BOARD 게시글 상세 내역 페이지</h3>
		<hr width="50%" color="tomato">
		
		<table border="1" width="500px">
			
			<%
				if(board != null){
			%>
			
			<tr>
				<td colspan="4" align="center">
					<h3><%=board.getBoard_writer() %>님 게시글 상세 내역</h3>
				</td>
			</tr>
			
			<tr>
				<th>글번호</th>
				<td width="100px" align="center"><%=board.getBoard_no() %></td>
				
				<th>작성자</th>
				<td align="center"><%=board.getBoard_writer() %></td>
			</tr>
			
			<tr>
				<%
					if(board.getBoard_update() == null){
				%>
				<th>작성일자</th>
				<td colspan="3" align="center"><%=board.getBoard_date() %></td>
				
				<%		
					} else{
				%>
				<th>수정일자</th>
				<td colspan="3" align="center"><%=board.getBoard_update() %></td>
				
				<%
					}
				%>
				
			</tr>
			
			<tr>
				<th>조회수</th>
				<td colspan="3" align="center"><%=board.getBoard_hit() %></td>
			</tr>
			
			<tr>
				<th>글내용</th>
				<td colspan="3" height="100px">
					<%=board.getBoard_cont().replace("\r\n", "<br>") %>
				</td>
			</tr>
			
			<tr>
				<th>글 비밀번호</th>
				<td colspan="3" align="center">
					<%
						if(board.getBoard_pwd().length() != 0){
							for(int i = 0; i < board.getBoard_pwd().length(); i++){
					%>
								*
					<%
							}
						}
					%>
				
				</td>
			</tr>

			<%		
				} else{
			%>
			<tr>
				<td colspan="4" align="center">
					<h3>조회된 게시글 상세내역이 없습니다...</h3>
				</td>
			</tr>

			<%
				}
			%>		
		</table>
		<br>
		
		<input type="button" value="글수정"
			onclick="location.href='modify.go?board_no=<%=board.getBoard_no()%>'">
		<input type="button" value="글삭제"
			onclick="if(confirm('정말로 게시글을 삭제하시겠습니까?')){
				location.href='board/board_delete.jsp?board_no=<%=board.getBoard_no()%>'
			}">
		<input type="button" value="게시글 목록"
			onclick="location.href='list.go'">
		
	</div>
</body>
</html>