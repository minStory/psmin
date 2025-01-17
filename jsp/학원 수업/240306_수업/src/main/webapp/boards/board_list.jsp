<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- 부트스트랩 v4.6 -> CSS, JS, Separate 복붙 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
<style>
	.pagination {
		justify-content: center;
	}
	
	.table {
		width: 700px;
	}
</style>

</head>
<body>

	<div align="center">
	   <hr width="30%" color="red">
	      <h3>BOARD 테이블 게시물 전체 리스트 페이지</h3>
	   <hr width="30%" color="red">
	   <br> <br>
	   
	   <!-- 부트스트랩 -> Content -> Tables -->
	   <table class="table table-hover">
	   		<tr>
	   			<td colspan="4" align="center">
	   				전체 게시물 수 : ${totalRecord} 개
	   			</td>
	   		</tr>
	   		
	   		<tr>
	   			<th>글번호</th>
	   			<th>글제목</th>
	   			<th>글조회수</th>
	   			<th>작성일자</th>
	   		
	   		</tr>
	   		
	   		<c:set var="list" value="${List }" />
	   		<c:if test="${!empty list }">
	   			<c:forEach items="${list }" var="dto">
	   			
		   			<tr>
			   			<td>${dto.getBoard_no() }</td>
			   			<td>
			   				<a href="${pageContext.request.contextPath }/board_content.do?no=${dto.getBoard_no() }&page=${page }">
			   					${dto.getBoard_title() }</a>
			   			</td>
			   			<td>${dto.getBoard_hit() }</td>
			   			<td>${dto.getBoard_date().substring(0, 10) }</td>
			   		</tr>
			   		
			   	</c:forEach>
		   		
	   		</c:if>
	   		
	   		<c:if test="${empty list }">
	   			<tr>
	   				<td colspan="4" align="center">
	   					<h3>전체 게시물 리스트가 없습니다..</h3>
	   				</td>
	   			</tr>
	   		</c:if>
	   		
	   </table>
	   <br>
	   
	   <!-- 부트스트랩 -> Component -> Modal -->
	   <!-- Button trigger modal -->
		<button type="button" class="btn btn-primary" data-toggle="modal" data-target="#exampleModal">
		  게시글 작성
		</button>
		
		<!-- Modal -->
		<div class="modal fade" id="exampleModal" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
		  <div class="modal-dialog">
		    <div class="modal-content">
		      <div class="modal-header">
		        <h5 class="modal-title" id="exampleModalLabel">BOARD 테이블 게시글 등록 폼 페이지</h5>
		        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
		          <span aria-hidden="true">&times;</span>
		        </button>
		      </div>
		      <div class="modal-body">
		        <form method="post" action="${pageContext.request.contextPath }/board_write_ok.do">
		        	<table border="1" width="300">
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
		        				<textarea type="text" name="cont"></textarea>
		        			</td>
		        		</tr>
		        		
		        		<tr>
		        			<th>글비밀번호</th>
		        			<td>
		        				<input type="password" name="pwd">
		        			</td>
		        		</tr>
		        	</table>
		        	<br>
		        	
		        	<div class="submit1">
		        		<input class="submit_btn btn-primary" type="submit" value="글쓰기">
		        		<input class="submit_btn btn-primary" type="reset" value="다시작성">
		        	</div>
		        </form>
		      </div>
<!-- 		      <div class="modal-footer">
		        <button type="button" class="btn btn-secondary" data-dismiss="modal">닫기</button>
		        <button type="button" class="btn btn-primary">게시글 등록</button>
		      </div> -->
		    </div>
		  </div>
		</div>
		<br><br>
	   
	   <!-- 부트스트랩 -> Component -> Pagination -->
	   <!-- 페이징 처리 -->
		<nav>
		  <ul class="pagination">
		    <li class="page-item">
		      <a class="page-link" href="board_list.do?page=1">First</a>
		    </li>
		    
		    <li>
		      <a class="page-link" href="board_list.do?page=${page - 1 }">Previous</a>
		    </li>
		    
		    <c:forEach begin="${startBlock }" end="${endBlock }" var="i">
		    
		       <c:if test="${i == page }">
		          <li class="page-item active" aria-current="page">
		      			<a class="page-link" href="board_list.do?page=${i }">${i }</a>
		    	  </li>
		       </c:if>
		       
		       <c:if test="${i != page }">
		          <li class="page-item">
		      			<a class="page-link" href="board_list.do?page=${i }">${i }</a>
		    	  </li>
		       </c:if>
		       
		    </c:forEach>
		    
		    <c:if test="${endBlock < allPage }">
		       <li class="page-item">
		      			<a class="page-link" href="board_list.do?page=${page + 1 }">Next</a>
		       </li>
		    
		       <li class="page-item">
		      			<a class="page-link" href="board_list.do?page=${allPage }">End</a>
		       </li>
		    
		    </c:if>
		    
		  </ul>
	   </nav>

	</div>
	
</body>
</html>