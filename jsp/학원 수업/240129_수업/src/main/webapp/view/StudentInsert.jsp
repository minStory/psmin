<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생 등록 페이지</title>
</head>
<body>
	<div align="center">
		<hr width="50%" color="gray">
			<h3>STUDENT 테이블 학생 등록 폼 페이지</h3>
		<hr width="50%" color="gray">
		
		<form method="post" action="<%=request.getContextPath()%>/insert">
			<table border="1">
				<tr>
					<th>학생 학번</th>
					<td>
						<input type="text" name="id">
					</td>
				</tr><tr>
					<th>학생 이름</th>
					<td>
						<input type="text" name="name">
					</td>
				</tr><tr>
					<th>학생 학과</th>
					<td>
						<input type="text" name="major">
					</td>
				</tr><tr>
					<th>학생 연락처</th>
					<td>
						<input type="text" name="phone">
					</td>
				</tr><tr>
					<th>학생 주소</th>
					<td>
						<input type="text" name="addr">
					</td>					
				</tr>
				
				<input type="submit" value="등록">
				<input type="reset" value="취소">
			</table>
		</form>
	</div>
</body>
</html>