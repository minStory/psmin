<%@page import="com.emp.model.EmpDTO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//서블릿에서 넘어온 데이터를 jsp에서 받아주자
	List<EmpDTO> empList = (List<EmpDTO>)request.getAttribute("List");	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>사원 조회 페이지</title>
</head>
<body>
	<div align="center">
		<hr width="50%" color="blue">
			<h2>EMP 테이블 전체 사원 리스트 페이지</h2>
		<hr width="50%" color="blue">
		<br /><br />
		
		<table border="1" width="400">
			<tr>
				<th>사원No.</th>
				<th>사원명</th>
				<th>부서No.</th>
				<th>입사일자</th>
			</tr>
			 <%
	         if(empList.size() != 0) {
	        	 
	        	 for(int i=0; i<empList.size(); i++) {
	        		 EmpDTO dto = empList.get(i);
	      %>
	      			<tr>
	      			   <td> <%=dto.getEmpno() %> </td>
	      			   <td> 
	      			      <a href="<%=request.getContextPath() %>/content.do?no=<%=dto.getEmpno() %>">
	      			   					<%=dto.getEname() %> </a> </td>
	      			   <td> <%=dto.getDeptno() %> </td>
	      			   <td> <%=dto.getHiredate().substring(0,10) %> </td>
	      			</tr>
	      <%   	 }  // for문 end
	         }else {
	        	 // 사원 목록이 없는 경우
	      %>
	      		<tr>
	      		   <td colspan="4" align="center">
	      		      <h3>사원 전체 목록이 없습니다.....</h3>
	      		   </td>
	      		</tr>
	     <% } %>
	     
	     <tr>
	        <td colspan="4" align="center">
	           <input type="button" value="사원등록"
	           		onclick="location.href='insert.do'">
	        </td>
	     </tr>
		
		</table>
	</div>
</body>
</html>