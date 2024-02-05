<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 추가 페이지</title>
</head>
<body>
	<div align="center">
		<hr width="50%" color="blue">
		<h2>EMP 테이블 추가 페이지</h2>
		<hr width="50%" color="blue">
		
		<form method="post" action="<%=request.getContextPath() %>/insert">	
			<table border="1">
				<tr>
					<th>사원번호</th>
					<td>
						<input type="text" name="empno">
					</td>
				</tr>
				<tr>
					<th>사원이름</th>
					<td>
						<input type="text" name="ename">
					</td>
				</tr>
				<tr>
					<th>직책</th>
					<td>
						<input type="text" name="job">
					</td>
				</tr>
				<tr>
					<th>사수번호</th>
					<td>
						<input type="text" name="mgr">
					</td>
				</tr>
				<tr>
					<th>입사일</th>
					<td>
						<input type="text" name="hiredate">
					</td>
				</tr>
				<tr>
					<th>급여</th>
					<td>
						<input type="text" name="sal">
					</td>
				</tr>
				<tr>
					<th>보너스</th>
					<td>
						<input type="text" name="comm">
					</td>
				</tr>
				<tr>
					<th>부서번호</th>
					<td>
						<input type="text" name="deptno">
					</td>
				</tr>
				<tr align="center">
					<td colspan="2">
						<input type="submit" value="사원등록">
						<input type="reset" value="다시작성">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>