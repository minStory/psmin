<%@page import="com.dept.model.DeptDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<DeptDTO> deptList = (List<DeptDTO>)request.getAttribute("List"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 목록 조회 페이지</title>
</head>
<body>
	<div align="center">
		<hr width="50%" color="tomato">
		<h2>DEPT 테이블 부서 전체 리스트</h2>
		<hr width="50%" color="tomato">
		
		<table border="1">
			<tr>
				<th>부서번호</th>
				<th>부서명</th>
				<th>부서위치</th>
				<th>부서수정</th>
				<th>부서삭제</th>
			</tr>
			
			<%
				if(deptList.size() != 0){
					for(int i = 0; i < deptList.size(); i++){
						DeptDTO dto = deptList.get(i);
			%>
				<tr>
					<td><%=dto.getDeptno() %></td>
					<td><%=dto.getDname() %></td>
					<td><%=dto.getLoc() %></td>
					<td align="center">
						<input type="button" value="수정"
						onclick="location.href='update?no=<%=dto.getDeptno() %>'">
					</td>
					<td align="center">
						<input type="button" value="삭제"
						onclick="location.href='delete?no=<%=dto.getDeptno() %>'">
					</td>
				</tr>
				
			<% 		}
				}else {
			%>
				
				<tr>
					<td colspan="5" align="center">
						<h3>부서 데이터가 없습니다!</h3>
					</td>
				</tr>
			<% } %>
			<tr>
				<td colspan="5" align="center">
					<input type="button" value="부서추가"
					onclick="location.href='view/DeptInsert.jsp'">
				</td>
			</tr>
		</table>
	</div>
</body>
</html>