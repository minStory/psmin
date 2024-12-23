<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Latte Cinema</title>
</head>
<body>
	<!-- header.jsp 페이지를 서블릿을 통해 불러온다. -->
	<!-- 서버 시작과 동시에 서블릿을 작동시키기 위한 코드 -->
	<c:import url="header" />
	
	<main class="main">
		<div class="main-movie-list-container">
			<section class="main-movie-list">
				<ul>
					<c:forEach var="i" begin="0" end="4">
						<li class="main-movie-list-li">
							<div class="main-movie-list-photo-frame">
								<div class="frame-btn-area">
									<button
										onclick="location.href='reserve?no=${movieList.get(i).getMovie_no() }'">예매하기</button>
									<button
										onclick="location.href='movie_specific?no=${movieList.get(i).getMovie_no() }'">상세정보</button>
								</div>
							</div>
							<div class="main-movie-list-photo"
								style="background: url('images/movie_image/${movieList.get(i).getMovie_no() }/poster.png') no-repeat center/cover;">
								<p>${i+1 }</p>
							</div>
							<div class="main-movie-list-title">
								<span
									style="background: url('images/grade_${movieList.get(i).getMovie_limit_age() }.png') no-repeat;">${movieList.get(i).getMovie_title() }</span>
							</div>
							<div class="main-movie-list-util">
								<span>예매율</span> <span>평점</span>
							</div>
						</li>
					</c:forEach>
				</ul>
				<div class="main-arrow-area">
					<button class="main-arrow main-arrow-left"></button>
					<button class="main-arrow main-arrow-right"></button>
				</div>
			</section>
		</div>
		<div class="main-container">
			<section class="main-special-list">
				<div class="main-special-title">
					<h3>스페셜관</h3>
					<a href="special_hall">더보기</a>
				</div>
				<ul class="main-special-list-contents">
					<li class="main-special-list-charlotte"></li>
					<li class="main-special-list-s_plex"></li>
					<li class="main-special-list-s_mx4d"></li>
					<li class="main-special-list-super_4d"></li>
					<li class="main-special-list-super_s"></li>
					<li class="main-special-list-s_led"></li>
					<li class="main-special-list-cine_comfort"></li>
					<li class="main-special-list-cine_family"></li>
					<li class="main-special-list-cine_couple"></li>
				</ul>
				<ul class="main-special-content-media">
					<li class="main-special-content-charlotte"><video
							class="main-special-content-video" autoplay muted loop>
							<source src="videos/charlotte_visual.mp4" type="video/mp4" />
						</video>
						<div class="main-special-content-textarea">
							<h3>C H A R L O T T E</h3>
							<p>단 하나의 프리미엄 상영관</p>
						</div></li>

					<li class="main-special-content-charlotte"><video
							class="main-special-content-video" autoplay muted loop>
							<source src="videos/super_s_visual.mp4" type="video/mp4" />
						</video>
						<div class="main-special-content-textarea">
							<h3>SUPER PLEX</h3>
							<p>압도적 경험을 만나다</p>
						</div></li>

					<li class="main-special-content-s-mx4d"><video
							class="main-special-content-video" autoplay muted loop>
							<source src="videos/charlotte_visual.mp4" type="video/mp4" />
						</video>
						<div class="main-special-content-textarea">
							<h3>S MX4D</h3>
							<p>압도적 4D를 만나다</p>
						</div></li>

					<li class="main-special-content-super-4d"><video
							class="main-special-content-video" autoplay muted loop>
							<source src="videos/super_s_visual.mp4" type="video/mp4" />
						</video>
						<div class="main-special-content-textarea">
							<h3>SUPER 4D</h3>
							<p>다이나믹한 오감 만족 체험</p>
						</div></li>

					<li class="main-special-content-super-s"><video
							class="main-special-content-video" autoplay muted loop>
							<source src="videos/charlotte_visual.mp4" type="video/mp4" />
						</video>
						<div class="main-special-content-textarea">
							<h3>SUPER S</h3>
							<p>세계 최초 LED 시네마</p>
						</div></li>

					<li class="main-special-content-s-led"><video
							class="main-special-content-video" autoplay muted loop>
							<source src="videos/super_s_visual.mp4" type="video/mp4" />
						</video>
						<div class="main-special-content-textarea">
							<h3>S LED</h3>
							<p>세상의 모든 색으로 영화를 보다</p>
						</div></li>

					<li class="main-special-content-s-led"><video
							class="main-special-content-video" autoplay muted loop>
							<source src="videos/charlotte_visual.mp4" type="video/mp4" />
						</video>
						<div class="main-special-content-textarea">
							<h3>cineComfort</h3>
							<p>몰입을 위한 나만의 리클라이너</p>
						</div></li>

					<li class="main-special-content-s-led"><video
							class="main-special-content-video" autoplay muted loop>
							<source src="videos/super_s_visual.mp4" type="video/mp4" />
						</video>
						<div class="main-special-content-textarea">
							<h3>cineFamily</h3>
							<p>사랑하는 사람들과 함께 편안하고 안전하게 즐기는 프라이빗한 무비 피크닉</p>
						</div></li>

					<li class="main-special-content-cine-couple"><video
							class="main-special-content-video" autoplay muted loop>
							<source src="videos/charlotte_visual.mp4" type="video/mp4" />
						</video>
						<div class="main-special-content-textarea">
							<h3>cineCouple</h3>
							<p>연인을 위한 두근두근 커플석</p>
						</div></li>
				</ul>
			</section>

			<section class="main-notice-list">
				<div class="main-notice-title">
					<h3>공지사항</h3>
					<a href="notice_list">더보기</a>
				</div>
				<table>
					<tr>
						<th>작성자</th>
						<th>제목</th>
						<th>작성일시</th>
					</tr>

					<c:forEach var="i" begin="0" end="4">
						<tr
							onclick="location.href='notice_content?no=${noticeBoardList.get(i).getNotice_board_no() }'">
							<td>${noticeBoardList.get(i).getNotice_board_writer_id() }</td>
							<td>${noticeBoardList.get(i).getNotice_board_title() }</td>
							<td>${noticeBoardList.get(i).getNotice_board_created_date() }</td>
						</tr>
					</c:forEach>
				</table>
			</section>
		</div>
	</main>

	<!-- footer.jsp 페이지를 직접 불러온다. -->
	<jsp:include page="/WEB-INF/include/footer.jsp" />
</body>
</html>