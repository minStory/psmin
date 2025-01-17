<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	// 한글 깨짐 방지 설정
	request.setCharacterEncoding("UTF-8");
	response.setContentType("text/html; charset=UTF-8");
	
	// Ex04.jsp 페이지에서 넘어온 데이터들을 받아 주어야 한다.
	// trim() : 맨 앞과 맨 뒤에 공백을 제거해 주는 메서드.
	String join_id = request.getParameter("id").trim();
	String join_pwd = request.getParameter("pwd").trim();
	String join_name = request.getParameter("name").trim();
	String join_phone = request.getParameter("phone").trim();
	String join_addr = request.getParameter("addr").trim();
	String join_sido = request.getParameter("sido").trim();
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
		<h2> <%=join_name %> 회원 가입 정보 페이지</h2>
		
		<table border="1">
			<tr>
			   <th>회원 아이디</th>
			   <td> <%=join_id %> </td>
			</tr>
			
			<tr>
			   <th>회원 비밀번호</th>
			   <td> <%=join_pwd %> </td>
			</tr>
			
			<tr>
			   <th>회원 이름</th>
			   <td> <%=join_name %> </td>
			</tr>
			
			<tr>
			   <th>회원 연락처</th>
			   <td> <%=join_phone %> </td>
			</tr>
			
			<tr>
			   <th>회원 주소</th>
			   <td> <%=join_addr %> </td>
			</tr>
			
			<tr>
			   <th>회원 거주지</th>
			   <td> <%=join_sido %> </td>
			</tr>
		</table>
	</div>
	
</body>
</html>