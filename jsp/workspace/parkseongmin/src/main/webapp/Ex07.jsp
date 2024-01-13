<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript">

	// 유효성 검사
	function validate() {
		if(frm.id.value == ""){
			alert("아이디를 입력해 주세요.")
			frm.id.focus()
			return false //페이지 이동을 강제적으로 막는 명령어.
		}
		
		if(frm.pwd.value == ""){
			alert("비밀번호를 입력해 주세요.")
			frm.pwd.focus()
			return false //페이지 이동을 강제적으로 막는 명령어.
		}
		
		frm.method = "post"
		frm.action = "login"
		frm.submit()
	}
</script>
</head>
<body>
	<div align="center">
		<hr width="50%" color="blue">
			<h2>로그인 페이지</h2>
		<hr width="50%" color="blue">
		<br><br>
		
		<form name="frm">
			<table border="1">
				<tr>
					<th>아이디</th>
					<td>
					<input type="text" name="id">
					</td>
				</tr>
				
				<tr>
					<th>비밀번호</th>
					<td>
					<input type="password" name="pwd">
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
					<input type="button" onclick="validate()" value="로그인">&nbsp;
					<input type="reset" value="취소">
					</td>
				</tr>
			</table>
		</form>
			
	</div>
</body>
</html>