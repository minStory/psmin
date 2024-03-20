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
	   <hr width="30%" color="marmoon">
	      <h3>UPLOAD 테이블 자료실 게시판 글쓰기 폼 페이지</h3>
	   <hr width="30%" color="marmoon">
	   <br> <br>
	   
	   <%-- enctype 속성 : 파일을 업로드하기 위한 속성 --%>
	   <form method="post" enctype="multipart/form-data"
	      action="<%=request.getContextPath() %>/upload_write_ok.do">
	   
	      <table border="1" width="400">
	         <tr>
	            <th>작성자</th>
	            <td>
	               <input name="upload_writer">
	            </td>
	         </tr>
	         
	         <tr>
	            <th>글제목</th>
	            <td>
	               <input name="upload_title">
	            </td>
	         </tr>
	         
	         <tr>
	            <th>글내용</th>
	            <td>
	               <textarea rows="7" cols="25" name="upload_cont"></textarea>
	            </td>
	         </tr>
	         
	         <tr>
	            <th>첨부파일</th>
	            <td>
	               <input type="file" name="upload_file">
	            </td>
	         </tr>
	         
	         <tr>
	            <th>글 비밀번호</th>
	            <td>
	               <input type="password" name="upload_pwd">
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













