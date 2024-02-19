<%@ page import="com.example.demo.model.DeptDTO"%> <%-- DeptDTO import --%>
<%@ page import="java.util.List"%> <%-- List import --%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>부서 조회 페이지</title>
</head>
<body>
	<div align="center">
		<hr width="50%" color="blue">
		<h2>DEPT 테이블 부서 전체 리스트</h2>
		<hr width="50%" color="blue">

		<table border="1">
			<tr>
				<th>부서번호</th>
				<th>부서명</th>
				<th>부서위치</th>
				<th>부서수정</th>
				<th>부서삭제</th>
			</tr>


				<tr>
					<%-- 스크립틀릿으로 값을 직접 작성 --%>
					<td></td>
					<td></td>
					<td></td>
					<td align="center">
						<input type="button" value="수정"
						<%-- no라는 변수를 가지고 update로 이동한다. --%>
						onclick="location.href='update?deptno='">
					</td>
					<td align="center">
						<input type="button" value="삭제"
						<%-- no라는 변수를 가지고 delete로 이동한다. --%>
						onclick="location.href='delete?deptno='">
					</td>
				</tr>



				<tr>
					<td colspan="5" align="center">
						<h3>부서 데이터가 없습니다!</h3>
					</td>
				</tr>

		</table><br />
			<input type="button" value="부서추가"
			<%-- views/DeptInsert.jsp로 페이지 이동 --%>
			onclick="location.href='views/dept_insert.jsp'">
	</div>
</body>
</html>