<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<h2>학생 정보 입력 폼 페이지</h2>
		
		<form action="student" method="post">
			<table border="1">
				<tr>
					<th>학생 학번</th>
					<td>
						<input type="text" name="num">
					</td>
				</tr>
				
				<tr>
					<th>학생 이름</th>
					<td>
						<input type="text" name="name">
					</td>
				</tr>
				
				<tr>
					<th>학생 학과</th>
					<td>
						<input type="text" name="major">
					</td>
				</tr>		
				
				<tr>
					<th>학생 나이</th>
					<td>
						<input type="text" name="age">
					</td>
				</tr>
				
				<tr>
					<th>학생 연락처</th>
					<td>
						<input type="text" name="phone">
					</td>
				</tr>
			
				<tr>
					<th>전공 과목</th>
					<td>
						<input type="checkbox" name="subject" value="C언어">C언어&nbsp;
						<input type="checkbox" name="subject" value="Java">Java&nbsp;
						<input type="checkbox" name="subject" value="JSP">JSP<br/>
						<input type="checkbox" name="subject" value="Spring">Spring&nbsp;
						<input type="checkbox" name="subject" value="PHP">PHP&nbsp;
						
					</td>
				</tr>
			
			
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="전송">&nbsp;&nbsp;
						<input type="reset" value="취소">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>