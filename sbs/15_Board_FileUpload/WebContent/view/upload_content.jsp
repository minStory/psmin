<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<%
	request.setAttribute("newLine", "\n");
	request.setAttribute("br", "<br>");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

   <div align="center">
      <c:set var="dto" value="${upCont }" />
      <hr width="30%" color="red">
         <h3> ${dto.getUpload_writer() } 님 자료실 게시글 상세내역 페이지</h3>
      <hr width="30%" color="red">
      <br><br>
      
      <table border="1" width="500">
         <tr>
            <th>게시글No.</th>
            <td> ${dto.getUpload_no() } </td>
         </tr>
         
         <tr>
            <th>작성자</th>
            <td> ${dto.getUpload_writer() } </td>
         </tr>
         
         <tr>
            <th>글제목</th>
            <td> ${dto.getUpload_title() } </td>
         </tr>
         
         <tr>
            <th>글내용</th>
            <td> ${fn:replace(dto.getUpload_cont(), newLine, br) } </td>
         </tr>
         
         <tr>
            <th>글 비밀번호</th>
            <td> 
               <c:if test="${dto.getUpload_pwd().length() != 0 }">
                  <c:forEach begin="1" end="${dto.getUpload_pwd().length() }">
                             *
                  </c:forEach>
               </c:if>
            </td>
         </tr>
         
         <tr>
            <th>첨부파일</th>
            <c:if test="${!empty dto.getUpload_file() }">
               <td>
                  <a href="<%=request.getContextPath() %>/upload/${dto.getUpload_file() }"
               				target="_blank">${dto.getUpload_file() }</a>
               </td>
            </c:if>
            
            <c:if test="${empty dto.getUpload_file() }">
               <td> </td>
            </c:if>
         </tr>
         
         <tr>
            <th>글 조회수</th>
            <td> ${dto.getUpload_hit() } </td>
         </tr>
         
         <tr>
            <c:if test="${empty dto.getUpload_update() }">
               <th>작성일자</th>
               <td> ${dto.getUpload_date() } </td>
            </c:if>
            
            <c:if test="${!empty dto.getUpload_update() }">
               <th>수정일자</th>
               <td> ${dto.getUpload_update() } </td>
            </c:if>
         </tr>
         
         <%-- 데이터가 없는 경우 --%>
         <c:if test="${empty dto }">
            <tr>
               <td colspan="2" align="center">
                  <h3> 게시물 번호에 해당하는 게시물이 없습니다.....</h3>
               </td>
            </tr>
         </c:if>
      </table>
      <br>
      
         <input type="button" value="글수정"
              onclick="location.href='upload_modify.do?no=${dto.getUpload_no() }'">
         &nbsp;&nbsp;
         
         <input type="button" value="글삭제"
              onclick="if(confirm('정말로 게시글을 삭제하시겠습니까?')) {
			              location.href='upload_delete.do?no=${dto.getUpload_no() }'
			           }else { return; }">
         &nbsp;&nbsp;  
            
         <input type="button" value="전체목록"
              onclick="location.href='upload_list.do'">
              
   </div>
</body>
</html>















