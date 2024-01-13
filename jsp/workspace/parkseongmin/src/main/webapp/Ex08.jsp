<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- [문제] 서블릿을 이용하여 성적을 처리해 보세요. --%>
	<div align="center">
		<hr width="30%" color="red">
		<h2 align="center">학생 성적입력</h2>
		<hr width="30%" color="red">
		<form action="result" method="post">
			학생 이름 &nbsp; <input type="text" name="name"><br/>
			국어 점수 &nbsp; <input type="text" name="kor"><br/>
			영어 점수 &nbsp; <input type="text" name="eng"><br/>
			수학 점수 &nbsp; <input type="text" name="math"><br/><br/>
	
			<input type="submit" name="calc" value="계산"> &nbsp;&nbsp;
			<input type="reset" name="clear" value="초기화"> &nbsp;&nbsp;
		</form>
	</div>
</body>
</html>