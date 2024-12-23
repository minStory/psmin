<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>영화 예매</title>
<!-- 제이쿼리 스크립트 -->
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>
</head>
<body>
	<c:import url="header" />

	<main>
		<div class="ticketing">

			<!--영화관 선택-->
			<div class="cinema">
				<form>
					<!--1-->
					<div class="c_top">
						<strong>영화관 선택</strong>
					</div>
					<!--2-->
					<div class="cinema_wrap">

						<!--1.지역선택-->
						<ul>
							<c:forEach var="i" begin="0" end="${localList.size() - 1 }">
								<li><input type="button"
									value="${localList.get(i) }(${sizeList.get(i) })"></li>
							</c:forEach>
						</ul>

						<!--2.지역 영화관 리스트-->
						<div class="cinema_list">
							<ul>
								<c:forEach var="i" begin="0" end="${seoulList.size() - 1 }">
									<li><input type="button" name=""
										value="${seoulList.get(i) }"></li>
								</c:forEach>
							</ul>
							<ul>
								<c:forEach var="i" begin="0"
									end="${gyeonggiIncheonList.size() - 1 }">
									<li><input type="button" name=""
										value="${gyeonggiIncheonList.get(i) }"></li>
								</c:forEach>
							</ul>
							<ul>
								<c:forEach var="i" begin="0"
									end="${chungCheongDaeJeonList.size() - 1 }">
									<li><input type="button" name=""
										value="${chungCheongDaeJeonList.get(i) }"></li>
								</c:forEach>
							</ul>
							<ul>
								<c:forEach var="i" begin="0"
									end="${jeollaGwangjuList.size() - 1 }">
									<li><input type="button" name=""
										value="${jeollaGwangjuList.get(i) }"></li>
								</c:forEach>
							</ul>
							<ul>
								<c:forEach var="i" begin="0"
									end="${gyeongbukDaeguList.size() - 1 }">
									<li><input type="button" name=""
										value="${gyeongbukDaeguList.get(i) }"></li>
								</c:forEach>
							</ul>
							<ul>
								<c:forEach var="i" begin="0"
									end="${gyeongnamBusanUlsanList.size() - 1 }">
									<li><input type="button" name=""
										value="${gyeongnamBusanUlsanList.get(i) }"></li>
								</c:forEach>
							</ul>
							<ul>
								<c:forEach var="i" begin="0" end="${gangwonList.size() - 1 }">
									<li><input type="button" name=""
										value="${gangwonList.get(i) }"></li>
								</c:forEach>
							</ul>
							<ul>
								<c:forEach var="i" begin="0" end="${jejuList.size() - 1 }">
									<li><input type="button" name=""
										value="${jejuList.get(i) }"></li>
								</c:forEach>
							</ul>
						</div>

					</div>
				</form>
			</div>

			<!--영화 선택-->
			<div class="movie">
				<form>
					<!--1-->
					<div class="m_top">
						<strong>영화선택</strong>
					</div>
					<!--2-->
					<div class="list_view">
						<ul>
							<li><input type="button" name="" value="예매순"></li>
							<li><input type="button" name="" value="관객순"></li>
							<li><input type="button" name="" value="예정작"></li>
						</ul>

						<div>
							<button>
								<img src="images/reserve/list_view_icon.png" alt="리스트 형식보기">
							</button>
							<button>
								<img src="images/reserve/gallery_view_icon.png" alt="갤러리 형식보기">
							</button>
						</div>
					</div>
					<!--3-->
					<div class="movie_wrap">
						<ul>
							<li><button>
									<span><img src="images/reserve/movie1.jpg" alt="영화"></span>
									<b class="y12">12</b> <span class="movie_name">혹성탈출:
										새로운시대</span>
								</button></li>
							<li><button>
									<span><img src="images/reserve/movie1.jpg" alt="영화"></span>
									<b class="y12">12</b> <span class="movie_name">남은 인생 10년</span>
								</button></li>
							<li><button>
									<span><img src="images/reserve/movie1.jpg" alt="영화"></span>
									<b class="ya">ALL</b> <span class="movie_name">창가의 토토</span>
								</button></li>
							<li><button>
									<span><img src="images/reserve/movie1.jpg" alt="영화"></span>
									<b class="y19">19</b> <span class="movie_name">애비게일</span>
								</button></li>
							<li><button>
									<span><img src="images/reserve/movie1.jpg" alt="영화"></span>
									<b class="y12">12</b> <span class="movie_name">더 초즌:
										선택받은 자</span>
								</button></li>
							<li><button>
									<span><img src="images/reserve/movie1.jpg" alt="영화"></span>
									<b class="y15">15</b> <span class="movie_name">파묘</span>
								</button></li>
							<li><button>
									<span><img src="images/reserve/movie1.jpg" alt="영화"></span>
									<b class="ya">ALL</b> <span class="movie_name">[보석기획]목소리의
										형태</span>
								</button></li>
							<li><button>
									<span><img src="images/reserve/movie1.jpg" alt="영화"></span>
									<b class="y12">12</b> <span class="movie_name">목화솜 피는날</span>
								</button></li>
							<li><button>
									<span><img src="images/reserve/movie1.jpg" alt="영화"></span>
									<b class="y15">15</b> <span class="movie_name">챌린저스</span>
								</button></li>
							<li><button>
									<span><img src="images/reserve/movie1.jpg" alt="영화"></span>
									<b class="y15">15</b> <span class="movie_name">스텔라</span>
								</button></li>
						</ul>
					</div>
				</form>
			</div>

			<!--날짜선택-->
			<div class="today">
				<form>
					<!--1-->
					<div class="t_top">
						<strong>2024-05-22(오늘)</strong>
					</div>
					<!--2-->
					<div class="calendar">

						<input type="text" value="5월">

						<div class="calendar_date">

							<ul>
								<li><input type="button" value="1" name="" class="select"></li>
								<c:forEach var="i" begin="2" end="31">
									<li><input type="button" value="${i }" name=""></li>
								</c:forEach>
							</ul>
						</div>

						<div class="calendar_btn">
							<button>&lt;</button>
							<button>&gt;</button>
						</div>
					</div>
					<!--3-->
					<div class="cal_movie">
						<!--movie1-->
						<div>
							<p>
								<b class="y15">15</b><strong>퓨리오사:매드맥스 사가</strong>
							</p>

							<p class="view">4D2D | 수퍼4D</p>

							<ul>
								<li>
									<button>
										<b>12:00</b> <span class="cal_movie_wrap"> <span>78/100</span>
											<span>3관</span>
										</span>
									</button>
								</li>

								<li>
									<button>
										<b>15:00</b> <span class="cal_movie_wrap"> <span>78/100</span>
											<span>3관</span>
										</span>
									</button>
								</li>

								<li>
									<button>
										<b>18:00</b> <span class="cal_movie_wrap"> <span>76/100</span>
											<span>3관</span>
										</span>
									</button>
								</li>

								<li>
									<button>
										<b>21:00</b> <span class="cal_movie_wrap"> <span>75/100</span>
											<span>3관</span>
										</span>
									</button>
								</li>
							</ul>
						</div>

						<!--movie2-->
						<div>
							<p>
								<b class="y12">12</b><strong>청춘 18X2 너에게로 이어지는길</strong>
							</p>

							<p class="view">2D</p>

							<ul>
								<li>
									<button>
										<b>12:50</b> <span class="cal_movie_wrap"> <span>140/142</span>
											<span>2관</span>
										</span>
									</button>
								</li>

								<li>
									<button>
										<b>15:30</b> <span class="cal_movie_wrap"> <span>142/142</span>
											<span>2관</span>
										</span>
									</button>
								</li>

								<li>
									<button>
										<b>17:40</b> <span class="cal_movie_wrap"> <span>332/332</span>
											<span>5관</span>
										</span>
									</button>
								</li>

								<li>
									<button>
										<b>22:40</b> <span class="cal_movie_wrap"> <span>332/332</span>
											<span>5관</span>
										</span>
									</button>
								</li>
							</ul>
						</div>
					</div>
				</form>
			</div>
		</div>
	</main>

	<jsp:include page="/WEB-INF/include/footer.jsp" />
</body>
</html>