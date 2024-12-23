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
		<h3>${specific.getMovie_title()} 수정페이지</h3>
		<form method="post"
			action="admin_modify_movie_ok">
			<input type="hidden" name="movie_no"
				value="${specific.getMovie_no() }">
			<table border="1">
				<tr>
					<th>영화 제목</th>
					<td><input type="text" name="title"
						value="${specific.getMovie_title() }"></td>
				</tr>
				<tr>
					<th>영화 내용</th>
					<td><textarea rows="7" cols="25" name="content">${specific.getMovie_content() }</textarea>
					</td>
				</tr>
				<tr>
					<th>영화 개봉일</th>
					<td><input type="text" name="date"
						value="${specific.getMovie_release_date() }"></td>
				</tr>
				<tr>
					<th>영화 상영시간</th>
					<td><input type="text" name="screentime"
						value="${specific.getMovie_screen_time() }"></td>
				</tr>
				<tr>
					<th>영화 나이제한</th>
					<td><input type="text" name="age"
						value="${specific.getMovie_limit_age() }"></td>
				</tr>
				<tr>
					<th>영화 장르</th>
					<td><input type="text" name="genre"
						value="${specific.getMovie_genre() }"></td>
				</tr>
				<tr>
					<th>영화 감독</th>
					<td><input type="text" name="director"
						value="${specific.getMovie_director() }"></td>
				</tr>
				<tr>
					<th>영화 배우</th>
					<td><input type="text" name="actor"
						value="${specific.getMovie_actor() }"></td>
				</tr>
				<tr>
					<td colspan="2" align="center"><input type="submit"
						value="글수정">&nbsp;&nbsp; <input type="reset" value="다시작성">
					</td>
				</tr>
			</table>
		</form>
	</div>
</body>
</html>