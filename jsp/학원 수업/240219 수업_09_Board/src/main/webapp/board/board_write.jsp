<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Board 글쓰기 페이지</title>
<script type="text/javascript">
	function check(){
		
		if(frm.writer.value == ""){
			alert("작성자를 입력하세요!")
			frm.writer.focus();
			return false;
		}
		
		if(frm.title.value == ""){
				alert("제목을 입력하세요!")
				frm.title.focus();
				return false;
		}
		
		if(frm.content.value == ""){
				alert("글내용을 입력하세요!")
				frm.content.focus();
				return false;
		}
		
		if(frm.pwd.value == ""){
				alert("글비밀번호를 입력하세요!")
				frm.pwd.focus();
				return false;
		}

	}
</script>
</head>
<body>
	<div align="center">
		<hr width="50%" color="marmoon">
			<h3>BOARD 테이블 게시판 글쓰기 폼 페이지</h3>
		<hr width="50%" color="marmoon">
		
		<form method="post" name="frm" action="<%=request.getContextPath() %>/insert_ok.go" onsubmit="return check()">
			<table border="1" width="350px">
				<tr>
					<th>작성자</th>
					<td>
						<input type="text" name="writer">
					</td>
				</tr>
				
				<tr>
					<th>글제목</th>
					<td>
						<input type="text" name="title">
					</td>
				</tr>
				
				<tr>
					<th>글내용</th>
					<td>
						<textarea rows="7" cols="30" name="content"></textarea>
					</td>
				</tr>
				
				<tr>
					<th>글 비밀번호</th>
					<td>
						<input type="password" name="pwd">
					</td>
				</tr>
				
				<tr>
					<td colspan="2" align="center">
						<input type="submit" value="글쓰기">&nbsp;&nbsp;
						<input type="reset" value="다시작성">
					</td>
				</tr>
				
			</table>
		
		</form>
	</div>
</body>
</html>