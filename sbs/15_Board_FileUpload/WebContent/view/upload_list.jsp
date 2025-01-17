<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
	   <hr width="30%" color="red">
	      <h3>UPLOAD 자료실 게시판 전체 리스트 페이지</h3>
	   <hr width="30%" color="red">
	   <br> <br>
	   
	   <table border="1" width="450">
	      <tr>
	         <th>글번호</th> <th>글제목</th>
	         <th>조회수</th> <th>작성일자</th>
	      </tr>
	      
	      <c:set var="list" value="${List }" />
	      
	      <c:if test="${!empty list }">
	         <c:forEach items="${list }" var="dto">
	            <tr>
	               <td> ${dto.getUpload_no() } </td>
	               <td> 
	                  <a href="<%=request.getContextPath() %>/upload_content.do?no=${dto.getUpload_no() }">
	               					${dto.getUpload_title() } </a>
	               </td>
	               <td> ${dto.getUpload_hit() } </td>
	               <td> ${dto.getUpload_date().substring(0, 10) } </td>
	            </tr>
	         </c:forEach>
	      </c:if>
	      
	      <c:if test="${empty list }">
	         <tr>
	            <td colspan="4" align="center">
	               <h3>자료실 전체 게시물이 없습니다.....</h3>
	            </td>
	         </tr>
	      </c:if>
	   </table>
	   <br>
	   
	   <input type="button" value="글쓰기"
	        onclick="location.href='upload_write.do'">
	        
	</div>
	
</body>
</html>








