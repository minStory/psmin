<%@page import="sbs.model.StudentDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//서블릿에서 보낸 데이터를 받아준다.
	List<StudentDTO> student = (List<StudentDTO>)request.getAttribute("List");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<div align="center">
	   <hr width="50%" color="red">
	      <h3>STUDENT 테이블 전체 학생 리스트</h3>
	   <hr width="50%" color="red">
	   <br> <br>
	   
	   <table border="1" width="800">
	      <tr>
	         <th>학 번</th> <th>이 름</th> <th>학 과</th>
	         <th>연락처</th> <th>주 소</th> <th>등록일</th>
	         <th>수 정</th> <th>삭 제</th>
	      </tr>
	      
	      <%
	        if(student.size() != 0) {  // 데이터가 있다면
	        	// 데이터 수만큼 반복해서 화면에 출력
	        	for(int i=0; i<student.size(); i++) {
	        		StudentDTO dto = student.get(i);
	      %>
	      			<tr>
	        		   <td> <%=dto.getId() %> </td>
	        		   <td> <%=dto.getName() %> </td>
	        		   <td> <%=dto.getMajor() %> </td>
	        		   <td> <%=dto.getPhone() %> </td>
	        		   <td> <%=dto.getAddr() %> </td>
	        		   <td> <%=dto.getRegdate().substring(0, 10) %> </td>
	        		   <td> 
	        		      <input type="button" value="수정"
	        		         onclick="location.href='update?no=<%=dto.getId() %>'">
	        		   </td>
	        		   <td>
	        		   	  <input type="button" value="삭제"
	        		         onclick="location.href='delete?no=<%=dto.getId() %>'">
	        		   </td>
	        		</tr>
	      <%   }  // for문 end
	        	
	        }else {  // 데이터가 없다면
	      %>
	      		<tr>
	      		   <td colspan="8" align="center">
	      		      <h3>학생 데이터가 없습니다.....</h3>
	      		   </td>
	      		</tr>  	
	      <%  }  %>
	      
	      <tr>
	         <td colspan="8" align="center">
	            <input type="button" value="학생등록"
	            	onclick="location.href='view/StudentInsert.jsp'">
	         </td>
	      </tr>
	   </table>
	</div>
</body>
</html>



