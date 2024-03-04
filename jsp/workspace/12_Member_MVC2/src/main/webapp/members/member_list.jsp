<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>전체 회원 조회</title>
<!-- 링크, 스크립트, css 파일 정리 -->
<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css" integrity="sha384-xOolHFLEh07PJGoPkLv1IbcEPTNtaed2xpHsD9ESMhqIYd0nLMwNLD69Npy4HI+N" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-Fy6S3B9q64WdZWQUiU+q4/2Lc9npb8tCaSX9FK7E8HnRr0Jz8D6OP9dO5Vg3Q9ct" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js" integrity="sha384-DfXdz2htPH0lsSSs5nCTpuj/zy4C+OGpamoFVy38MVBnE+IbbVYUew+OrCXaRkfj" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js" integrity="sha384-9/reFTGAW83EW2RDu2S0VKaIzap3H66lZH81PoYlFhbGU+6BZp6G7niu735Sk7lN" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.min.js" integrity="sha384-+sLIOodYLS7CIrQpBjl+C7nPvqq+FbNUBDunl/OZv93DB7Ln/533i8e/mZXLi/P+" crossorigin="anonymous"></script>
<style>
	hr{
		width:50%;
		background-color: navy;
	}
	.table{
		width:700px;
		text-align:center;
	}
	.pagination{
		justify-content:center;
	}
</style>
</head>
<body>
	<div align="center">
		<hr>
			<h3>MEMBER 테이블 전체 회원 조회 페이지</h3>
		<hr>
		<br>
		
		<form method="post" action="${pageContext.request.contextPath }/search">
			<select name="field">
				<option value="id">아이디</option>
				<option value="name">이름</option>
				<option value="job">직업</option>
				<option value="addr">주소</option>
			</select>
			
			<input type="text" name="keyword">&nbsp;&nbsp;&nbsp;
			<input class="btn btn-primary" type="submit" value="검색">
		</form>
		<br>
		
		<table class="table table-striped">
			<tr>
				<th colspan="5">
					<h5>전체 회원 수: ${totalRecord }명</h5>
				</th>
			</tr>
			<tr>
				<th>회원번호</th>
				<th>회원명</th>
				<th>직업</th>
				<th>회원가입일</th>
				<th>상세정보</th>
			</tr>
			
			<c:set var="list" value="${List }" />
			
			<c:if test="${!empty list }">
				<c:forEach items="${list }" var="dto">
					<tr>
						<th>
							<c:out value="${dto.getNum() }" />
						</th>
						<td>
							<c:out value="${dto.getMemname() }" />
						</td>
						<td>
							<c:out value="${dto.getJob() }" />
						</td>
						<td>
							<c:out value="${dto.getRegdate().substring(0, 10) }" />
						</td>
						<td>
							<input class="btn btn-primary" type="button" value="상세정보"
								onclick="location.href='content?num=${dto.getNum()}'">
						</td>
					</tr>
				</c:forEach>
			</c:if>
			
			<c:if test="${empty list }">
				<tr>
					<td colspan="5">
						<h3>전체 회원 리스트가 없습니다..</h3>
					</td>
				</tr>
			</c:if>
		</table>
		<br>
		
		<%-- Modal 창 만드는 버튼 --%>
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
		         <form method="post" action="${pageContext.request.contextPath }/member_insert_ok">
		            
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
		                     <textarea rows="7" cols="25" name="cont"></textarea>
		                  </td>
		               </tr>
		               
		               <tr>
		                  <th>글 비밀번호</th>
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
		      
		    </div>
		  </div>
		</div>
	    <br><br>
	    
	    <%-- 페이징 처리 영역 --%>
		<nav>
			<ul class="pagination">
				<li class="page-item">
					<a class="page-link" href="select?page=1">First</a>
				</li>
			    
				<li>
					<c:if test="${page == 1 }">
						<a class="page-link" href="select?page=${page }">Previous</a>
					</c:if>
					<c:if test="${page > 1}">
						<a class="page-link" href="select?page=${page - 1 }">Previous</a>
					</c:if>
				</li>
			    
				<c:forEach begin="${startBlock }" end="${endBlock }" var="i">
			    
					<c:if test="${i == page }">
						<li class="page-item active" aria-current="page">
							<a class="page-link" href="select?page=${i }">${i }</a>
						</li>
					</c:if>
			       
					<c:if test="${i != page }">
						<li class="page-item">
							<a class="page-link" href="select?page=${i }">${i }</a>
						</li>
					</c:if>
			       
				</c:forEach>
			    
				<c:if test="${endBlock < allPage }">
 					<li class="page-item">
						<a class="page-link" href="select?page=${page + 1 }">Next</a>
					</li>
			    
					<li class="page-item">
						<a class="page-link" href="select?page=${allPage }">End</a>
					</li>
			    
				</c:if>
			    
			</ul>
		</nav>
		<br>
		
		<input class="btn btn-primary" type="button" value="회원등록"
			onclick="location.href='insert'">&nbsp;&nbsp;&nbsp;
		<input class="btn btn-primary" type="button" value="메인페이지 이동"
			onclick="location.href='main.jsp'">
	</div>
</body>
</html>







