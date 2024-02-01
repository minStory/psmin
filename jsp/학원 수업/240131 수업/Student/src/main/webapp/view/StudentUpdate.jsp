<%@page import="sbs.model.StudentDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//서블릿에서 넘어온 데이터을 받아줘야 한다. 단, 강제 형변환이 반드시 필요하다.(Object -> StudentDTO)
	StudentDTO cont = (StudentDTO)request.getAttribute("Content");
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
		<h3><%=cont.getName() %> 학생 정보 수정 폼 페이지</h3>
		<hr width="50%" color="tomato">
		<br><br>
		
		<form method="post" action="<%=request.getContextPath()%>/studentUpdateOk">
			
			<table border="1">
				<tr>
					<th>학생 학번</th>
					<td>
						<input type="text" name="id" value="<%=cont.getId()%>" readonly>
					</td>
				</tr>
				
				<tr>
					<th>학생 이름</th>
					<td>
						<input type="text" name="name" value="<%=cont.getName() %>" readonly>
					</td>
				</tr>
			
				<tr>
					<th>학생 학과</th>
					<td>
						<input type="text" name="major" value="<%=cont.getMajor() %>">
					</td>
				</tr>
				
				<tr>
					<th>학생 연락처</th>
					<td>
						<input type="text" name="phone" value="<%=cont.getPhone() %>">
					</td>
				</tr>
				
				<tr>
					<th>학생 주소</th>
					<td>
						<input type="text" name="addr" value="<%=cont.getAddr() %>">
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="학생수정"&nbsp;&nbsp;>
						<input type="reset" value="다시작성">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>