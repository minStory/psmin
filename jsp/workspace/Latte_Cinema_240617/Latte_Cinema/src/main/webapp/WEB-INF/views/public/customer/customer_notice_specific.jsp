<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:import url="header" />
		<main class="customer_main">
			<div class="customer">
				<!--1-->
				<h3>고객센터</h3>
	
				<!--2-->
				<div class="customer_tab">
					<button type="button" onclick="#" class="customer_btn1">FAQ</button>
					<button type="button" onclick="#" class="customer_btn2">공지사항</button>
					<button type="button" onclick="#" class="customer_btn3">1:1문의</button>
				</div>
			</div>
			<div class="notice-specific-zone">
				<h4>${notice.getNotice_board_title()}</h4>
				
				<div class="notice-specific-zone-top">
					<span>영화관 | <b>전체</b></span>
					<span>등록일 | <b><c:if
												test="${empty notice.getNotice_board_updated_date() }">
							${notice.getNotice_board_created_date() }
						</c:if> <c:if
												test="${!empty notice.getNotice_board_updated_date() }">
							${notice.getNotice_board_updated_date() }
						</c:if></b></span>
					<span>조회수 | <b>${notice.getNotice_board_hit() }</b></span>
				</div>
				
				<div class="notice-specific-zone-middle">
					${notice.getNotice_board_content() }
				</div>
				<c:set var="p" value="${notice.getNotice_board_no() }" />
				<div  class="notice-specific-zone-bottom">
					<a>다음글</a>
					<a>이전글</a>
				</div>
			</div>
		</main>
	<jsp:include page="/WEB-INF/include/footer.jsp" />
</body>
</html>