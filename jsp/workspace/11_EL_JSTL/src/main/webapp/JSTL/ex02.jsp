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
		<hr width="50%" color="gray">
			<h3>커피 주문 폼 페이지</h3>
		<hr width="50%" color="gray">
		
		<form method="post" action="ex03.jsp">
			<table border="1" width="300">
				<tr>
					<th>커피 종류</th>
					<td>
						<select name="coffee_name">
							<option value="1">아메리카노 - 3,000원</option>
							<option value="2">카페라떼 - 4,000원</option>
							<option value="3">카푸치노 - 4,500원</option>
							<option value="4">마끼아또 - 4,500원</option>
						</select>
					</td>
				</tr>
				
				<tr>
					<th>수량</th>
					<td>
						<input type="number" min="1" max="20" name="amount">
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="계산">&nbsp;&nbsp;&nbsp;
						<input type="reset" value="취소">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>