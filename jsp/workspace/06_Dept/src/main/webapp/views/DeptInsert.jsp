<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 추가 페이지</title>
</head>
<body>
	<div align="center">
		<hr width="50%" color="blue">
		<h2>DEPT 테이블 부서 추가 폼 페이지</h2>
		<hr width="50%" color="blue">
		
		<%-- request.getContextPath() -> 프로젝트 Path --%>
		<form method="post" action="<%=request.getContextPath() %>/insert">
			<table border="1">
				<tr>
					<th>부서번호</th>
					<td>
						<input type="text" name="deptno">
					</td>
				</tr>
				
				<tr>
					<th>부서명</th>
					<td>
						<input type="text" name="dname">
					</td>
				</tr>
				
				<tr>
					<th>부서위치</th>
					<td>
						<input type="text" name="loc">
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="부서추가">
						<input type="reset" value="다시작성">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>