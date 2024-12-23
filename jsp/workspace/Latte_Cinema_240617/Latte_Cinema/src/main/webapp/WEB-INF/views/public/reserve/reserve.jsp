<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body class="reserve-background">
	<c:import url="header" />

	<main>
		<div class="reserve reserve-container">
			<section class="partition">
				<ul class="partition-content">
					<li><div class="partition-text-area">
							01<br>상영시간
						</div></li>
					<li><div class="partition-text-area">
							02<br>인원/좌석
						</div></li>
					<li><div class="partition-text-area">
							03<br>결제
						</div></li>
					<li><div class="partition-text-area">
							04<br>결제완료
						</div></li>
				</ul>
			</section>

			<section class="screen_time reserve-content">
				<div class="location">
					<div class="location-top">
						<h3>영화관</h3>
					</div>

					<div class="location-middle">
						<h4>전체</h4>
					</div>

					<div class="location-bottom">
						<ul class="location-bottom-left">
						</ul>

						<ul class="location-bottom-right">
						</ul>
					</div>
				</div>

				<div class="movie">
					<div class="movie-top">
						<h3>영화 선택</h3>
					</div>

					<div class="movie-middle">
						<select>
							<option>예매순</option>
							<option>관객순</option>
						</select>
						<div class="movie-middle-btn-area">
							<button class="btn-view-txt"></button>
							<button class="btn-view-img"></button>
						</div>
					</div>

					<div class="movie-bottom">
						<ul class="movie-bottom-list">
						</ul>
					</div>
				</div>

				<div class="datetime">
					<div class="datetime-top">
						<h3>날짜/시간</h3>
					</div>

					<div class="datetime-middle">datetime-middle</div>

					<div class="datetime-bottom">
						<p>영화제목</p>
						<div class="datetime-bottom-content">
							<p>4D</p>
							<ul>
								<c:forEach var="i" begin="0" end="16" step="2">
									<li class="movie-time">
										<p class="time">${9+i }:40</p>
										<div class="bottom-text-area">
											<span class="people">${i*10 }/200</span> <span class="hall"><fmt:formatNumber
													maxFractionDigits="0">${i/2 + 1 }</fmt:formatNumber>관</span>
										</div>
									</li>
								</c:forEach>
							</ul>
						</div>
					</div>
				</div>
			</section>

			<section class="seat reserve-content">
				<div class="choose-people">
					<div class="choose-people-top">
						<h3>인원/좌석 선택</h3>
						<span>인원은 최대 8명까지 선택 가능합니다.</span>
					</div>
					<div class="choose-people-middle">
						<span class="choose-people-middle-text">인원수</span>
						<div class="btn-area">
							<button class="minus-btn">-</button>
							<span class="people-count"></span>
							<button class="plus-btn">+</button>
						</div>
					</div>
					<div class="choose-people-bottom">
						<p>인원을 선택하세요.</p>
					</div>
				</div>

				<div class="choose-seat">
					<div class="choose-seat-bar">S C R E E N</div>
					<div class="choose-seat-content">
						<c:forEach var="i" begin="1" end="160">
							<span>${i }</span>
						</c:forEach>
					</div>
					<div class="choose-seat-type">
						<span>선택좌석</span> <span>선택가능</span> <span>예매완료</span>
					</div>
				</div>

				<div class="go-payment">
					<div class="go-payment-amount">
						<p>
							총 합계<strong> 0</strong>원
						</p>
					</div>
					<div class="go-payment-btn">결제하기</div>

				</div>
			</section>

			<section class="payment reserve-content">payment</section>

			<section class="complete reserve-content">complete</section>
		</div>

	</main>

	<jsp:include page="/WEB-INF/include/footer.jsp" />
</body>
</html>