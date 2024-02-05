<%@ page import="com.emp.model.EmpDTO"%>
<%@ page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	List<EmpDTO> dtoList = (List<EmpDTO>)request.getAttribute("List"); 
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 조회 페이지</title>
</head>
<body>
	<div align="center">
		<hr width="50%" color="blue">
		<h2>EMP 테이블 조회 페이지</h2>
		<hr width="50%" color="blue">
		
		<table border="1">
			<tr>
				<th>사원번호</th>
				<th>사원이름</th>
				<th>직책</th>
				<th>사수번호</th>
				<th>입사일</th>
				<th>급여</th>
				<th>보너스</th>
				<th>부서번호</th>
				<th>사원수정</th>
				<th>사원삭제</th>
			</tr>
					<% if(dtoList.size() != 0){
						for(int i = 0; i < dtoList.size(); i++){
							EmpDTO dto = dtoList.get(i);
					%>
			<tr align="center">
				<td><%=dto.getEmpno() %></td>
				<td><%=dto.getEname() %></td>
				<td><%=dto.getJob() %></td>
				<td><%=dto.getMgr() %></td>
				<td><%=dto.getHiredate() %></td>
				<td><%=dto.getSal() %></td>
				<td><%=dto.getComm() %></td>
				<td><%=dto.getDeptno() %></td>
				<td>
					<input type="button" value="수정"
					onclick="location.href='update?empno=<%=dto.getEmpno() %>'">
				</td>
				<td>
					<input type="button" value="삭제"
					onclick="location.href='delete?empno=<%=dto.getEmpno() %>'">
				</td>
			</tr>
				<%}
					}else{
					%>			
				<tr>
					<td colspan="10" align="center">
						<h3>부서 데이터가 없습니다!</h3>
					</td>
				</tr>
				<%} %>
		</table><br />
		<input type="button" value="사원등록"
		onclick="location.href='views/emp_insert.jsp'">
	</div>
</body>
</html>