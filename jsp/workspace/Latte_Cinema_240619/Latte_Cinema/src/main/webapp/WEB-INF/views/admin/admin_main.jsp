<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자페이지</title>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.4.0/Chart.min.js"></script>
</head>
<body>
	<c:import url="header" />
	<!-- 관리자페이시 상단 -->
	<div class="adminpage_main">
		<div class="adminpage_top_infor adminpage-container"
			id="adminpage_top_infor">
			<div class="adminpage_box">
				<p>
					<strong>${dto.getAdmin_name() }</strong> 관리자님 환영합니다. <a
						href="admin_sales_list?no=1&no=2&no=3&no=4&no=5&
							no=6&no=7&no=8&no=9&no=10&no=11&no=12"
						class="salesmonth">월별 매출 자세히 보기</a>
				</p>
				<div class="adminpage_sales">
					<div class="adminpage_sales_chart">
						<canvas id="saleschart" height="110">
						
						</canvas>
					</div>
					<div class="adminpage_member_chart">
						<canvas id="memberchart">
						
						</canvas>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- 관리자페이지 공통 메뉴 -->
	<div class="adminpage_top_menu adminpage-container">
		<ul class="adminpage_top_menu_tab">
			<li><a><span>공지사항</span></a></li>
			<li><a><span>영화정보</span></a></li>
			<li><a><span>1:1문의</span></a></li>
			<li><a><span>맴버정보</span></a></li>
		</ul>
	</div>

	<!-- 관리자페이지 컨덴츠(결제내역) -->
	<div class="a">
		<div class="adminpage-container">
			<div class="admin-top-name-insert">
				<h3>공지사항</h3>
				<button onclick="location.href='admin_insert_notice'">작성하기</button>
			</div>

			<div class="admin-notice-box">
				<div class="admin">

					<!--3-->
					<div class="admin-search-quick">
						<form method="post" action="admin_notice_board_search">
							<select name="notice_field">
								<option value="search_title">제목</option>
								<option value="search_cont">내용</option>
								<option value="search_title_cont">제목+내용</option>
							</select> <input type="text" name="notice_keyword"
								placeholder="검색어를 입력해주세요"> <input type="submit"
								value="검색">
						</form>
					</div>

					<div class="admin-notice-table">
						<table>
							<thead>
								<tr>
									<th>번호</th>
									<th>구분</th>
									<th>제목</th>
									<th>등록일</th>
									<th colspan="2">비고</th>
								</tr>
							</thead>

							<tbody>
								<c:forEach var="n" begin="0" end="${noticeList.size() -1 }">
									<tr>
										<td>${noticeList.get(n).getNotice_board_no() }</td>
										<td>전체</td>
										<td><button
												onclick="location.href='notice_content?no=${noticeList.get(n).getNotice_board_no()}'">${noticeList.get(n).getNotice_board_title() }</button></td>
										<td><c:if
												test="${empty notice.get(n).getNotice_board_updated_date() }">
							${noticeList.get(i).getNotice_board_created_date() }
						</c:if> <c:if
												test="${!empty notice.get(n).getNotice_board_updated_date() }">
							${noticeList.get(i).getNotice_board_updated_date() }
						</c:if></td>
										<td><button
												onclick="location.href='admin_delete_notice_ok?noticeNo=${noticeList.get(n).getNotice_board_no()}'">삭제</button></td>
										<td><button
												onclick="location.href='admin_modify_notice?noticeNo=${noticeList.get(n).getNotice_board_no()}'">수정</button></td>
									</tr>
								</c:forEach>
							</tbody>
						</table>

						<div class="admin-notice-table-btn">
							<a href="admin_main?page=1">first</a><a
								href="admin_main?page=${page - 1 }">previous</a>
							<c:forEach begin="${startBlock }" end="${endBlock }" var="i">
								<a href="admin_main?page=${i}">${i}</a>
							</c:forEach>
							<c:if test="${endBlock < allPage }">
								<a href="admin_main?page=${page + 1 }">next</a>
								<a href="admin_main?page=${allPage }">last</a>
							</c:if>
						</div>

					</div>

				</div>
			</div>
			<!--notice end  -->
		</div>
	</div>


	<!-- 영화정보 -->
	<div class="b adminpage-container">
		<div class="admin-top-name-insert">
			<h3>영화정보</h3>
			<button onclick="location.href='admin_insert_movie'">작성하기</button>
		</div>
		<div class="admin-search-quick">
			<form method="post" action="admin_movie_search">
				<select name="movie_field">
					<option value="movie_title">제목</option>
					<option value="genre">장르</option>
					<option value="actor">배우</option>
					<option value="director">감독</option>
				</select> <input type="text" name="movie_keyword" placeholder="검색어를 입력해주세요">
				<input type="submit" value="검색">
			</form>
		</div>
		<div class="admin-movie-table">
			<div class="admin-movie-table">
				<table>
					<thead>
						<tr>
							<th>번호</th>
							<th>개봉 일자</th>
							<th>제목</th>
							<th>연령 등급</th>
							<th>상영 여부</th>
							<th colspan="2">비고</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach begin="0" end="${movieNowList.size()-1 }" var="mn">
							<tr>
								<td>${movieNowList.get(mn).getMovie_no() }</td>
								<td>${movieNowList.get(mn).getMovie_release_date() }</td>
								<td><a
									href="movie_specific?no=${movieNowList.get(mn).getMovie_no()}">${movieNowList.get(mn).getMovie_title() }</a></td>
								<c:if test="${movieNowList.get(mn).getMovie_limit_age() == 0}">
									<td>all</td>
								</c:if>
								<c:if test="${movieNowList.get(mn).getMovie_limit_age() != 0}">
									<td>${movieNowList.get(mn).getMovie_limit_age()}</td>
								</c:if>
								<td>현재 상영작</td>
								<td colspan=2><button
										onclick="location.href='admin_movie_delete_ok?MovieNo=${movieNowList.get(mn).getMovie_no() }'">삭제</button>
									<button
										onclick="location.href='admin_modify_movie?MovieNo=${movieNowList.get(mn).getMovie_no() }'">수정</button></td>
							</tr>
						</c:forEach>
					</tbody>
					<tbody>
						<c:forEach begin="0" end="${moviePlanList.size()-1 }" var="mp">
							<tr>
								<td>${moviePlanList.get(mp).getMovie_no() }</td>
								<td>${moviePlanList.get(mp).getMovie_release_date() }</td>
								<td><a
									href="movie_specific?no=${moviePlanList.get(mp).getMovie_no() }">${moviePlanList.get(mp).getMovie_title() }</a></td>
								<c:if test="${moviePlanList.get(mp).getMovie_limit_age() == 0}">
									<td>all</td>
								</c:if>
								<c:if test="${moviePlanList.get(mp).getMovie_limit_age() != 0}">
									<td>${moviePlanList.get(mp).getMovie_limit_age()}</td>
								</c:if>
								<td>상영 예정작</td>
								<td colspan=2><button
										onclick="location.href='admin_movie_delete_ok?MovieNo=${moviePlanList.get(mp).getMovie_no() }'">삭제</button>
									<button onclick="location.href=''">수정</button></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>


	<!-- 1:1문의 -->
	<div class="admin-inquiry c adminpage-container"></div>

	<!-- admin정보관리 -->
	<div class="admininfo d adminpage-container">
		<div class="admin-view-member-table">
			<div class="admin-top-name-insert">
				<h3>가입 멤버 정보</h3>
			</div>
			<div class="admin-view-member-inside">
				<div class="admin-search-quick">
					<form method="post" action="admin_member_search">
						<select name="member_field">
							<option value="member_name">회원이름</option>
							<option value="member_id">아이디</option>
						</select> <input type="text" name="member_keyword"
							placeholder="검색어를 입력해주세요"> <input type="submit"
							value="검색">
					</form>
				</div>
				<table>
					<thead>
						<tr>
							<th>맴버번호</th>
							<th>맴버 아이디</th>
							<th>멤버 이름</th>
							<th>멤버 마일리지</th>
							<th>멤버 등급</th>
							<th>멤버 가입일</th>
							<th colspan="2">비고</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach begin="0" end="${AdminViewMemberList.size()-1 }"
							var="am">
							<tr>
								<td>${AdminViewMemberList.get(am).getMember_no() }</td>
								<td>${AdminViewMemberList.get(am).getMember_id() }</td>
								<td><a
									href="admin_member_content?memberid=${AdminViewMemberList.get(am).getMember_id() }">${AdminViewMemberList.get(am).getMember_name() }</a></td>
								<td>${AdminViewMemberList.get(am).getMember_mileage() }</td>
								<td>${AdminViewMemberList.get(am).getMember_grade() }</td>
								<td>${AdminViewMemberList.get(am).getMember_signup_date().substring(0,10) }</td>
								<td><button>삭제</button>
									<button>수정</button></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<div class="admin-notice-table-btn">
					<a href="admin_main?memberinfo&pageMd=1">first</a><a
						href="admin_main?memberinfo&pageMd=${pageMd - 1 }">previous</a>
					<c:forEach begin="${startBlockMd }" end="${endBlockMd }" var="amp">
						<a href="admin_main?memberinfo&pageMd=${amp}">${amp}</a>
					</c:forEach>
					<c:if test="${endBlockMd < allPageMd }">
						<a href="admin_main?memberinfo&pageMd=${pageMd + 1 }">next</a>
						<a href="admin_main?memberinfo&pageMd=${allPageMd }">last</a>
					</c:if>
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="/WEB-INF/include/footer.jsp" />


	<!-- 텝변경 스크립트 -->
	<script>
		
		 var monthlyTotalSales = ${monthlyTotalSales};

    // Chart.js를 사용하여 그래프 생성 매출그래프
    var context = document.getElementById('saleschart').getContext('2d');
    var saleschart = new Chart(context, {
        type: 'bar', // 차트의 형태
        data: {
            labels: ['1월', '2월', '3월', '4월', '5월', '6월', '7월', '8월', '9월', '10월', '11월', '12월'], // x 축 레이블
            datasets: [{
                label: '월별 매출', // 차트 제목
                data: monthlyTotalSales, // 데이터 값 (각 월의 매출 금액)
                backgroundColor: 'rgba(54, 162, 235, 0.2)', // 막대 색상 (파란색)
                borderColor: 'rgba(54, 162, 235, 1)', // 막대 테두리 색상 (진한 파란색)
                borderWidth: 1 // 테두리 굵기
            }]
        },
        options: {
            scales: {
                yAxes: [{
                    ticks: {
                        beginAtZero: true, // y 축 시작값을 0으로 설정
                        callback: function(value) { return value.toLocaleString() + '원'; } // y 축 값 포맷팅 (금액 단위)
                    }
                }]
            },
            tooltips: {
                callbacks: {
                    label: function(tooltipItem, data) {
                        var value = data.datasets[tooltipItem.datasetIndex].data[tooltipItem.index];
                        return value.toLocaleString() + '원'; // 툴팁 값 포맷팅 (금액 단위)
                    }
                }
            }
        }
    });

    document.addEventListener("DOMContentLoaded", () => {
    	
    	   const a = document.getElementsByClassName("a")[0];
    	   const b = document.getElementsByClassName("b")[0];
    	   const c = document.getElementsByClassName("c")[0];
    	   const d = document.getElementsByClassName("d")[0];
    	   window.scrollTo(0, 700);
    	   
    	   const mypage_top_menu_tab = Array.from(document.getElementsByClassName("adminpage_top_menu_tab")[0].children);

    	   if(window.location.href.includes("movie")){
    	      a.style.display = "none";
    	      c.style.display = "none";
    	      d.style.display = "none";
    	      mypage_top_menu_tab[1].classList.add("bar");
    	   }else if(window.location.href.includes("inquiry")){
    	      a.style.display = "none";
    	      b.style.display = "none";
    	      d.style.display = "none";
    	      mypage_top_menu_tab[2].classList.add("bar");
    	   }else if(window.location.href.includes("memberinfo")){
    	      a.style.display = "none";
    	      b.style.display = "none";
    	      c.style.display = "none";
    	      mypage_top_menu_tab[3].classList.add("bar");
    	   }else{
    	      b.style.display = "none";
    	      c.style.display = "none";
    	      d.style.display = "none";
    	      mypage_top_menu_tab[0].classList.add("bar");
    	   }
    	   
    	   
    	   mypage_top_menu_tab.forEach((li, idx) => {
    	      li.addEventListener("click", () => {
    	         mypage_top_menu_tab.forEach((li) => {
    	            li.classList.remove("bar");
    	         });
    	         
    	         if(idx === 0){
    	            a.style.display = "block";
    	            b.style.display = "none";
    	            c.style.display = "none";
    	            d.style.display = "none";
    	            li.classList.add("bar");
    	            window.history.replaceState({}, document.title, window.location.pathname);
    	         }else if(idx === 1){
    	            a.style.display = "none";
    	            b.style.display = "block";
    	            c.style.display = "none";
    	            d.style.display = "none";
    	            li.classList.add("bar");
    	            window.history.replaceState({}, document.title, '?movie');
    	         }else if(idx === 2){
    	            a.style.display = "none";
    	            b.style.display = "none";
    	            c.style.display = "block";
    	            d.style.display = "none";
    	            li.classList.add("bar");
    	            window.history.replaceState({}, document.title, '?inquiry');
    	         }else if(idx === 3){
    	            a.style.display = "none";
    	            b.style.display = "none";
    	            c.style.display = "none";
    	            d.style.display = "block";
    	            li.classList.add("bar");
    	            const scroll = document.documentElement.scrollTop;
    	            save_scroll = scroll; // 팝업을 열 때 현재 스크롤 저장
    	            window.history.replaceState({}, document.title, '?memberinfo');
    	         }
    	      });
    	   });
    	});
    	
		//Chart.js를 사용하여 그래프 생성
		var mc = document.getElementById('memberchart').getContext('2d');
		var memberchart = new Chart(mc, {
		    type: 'doughnut', // 차트의 형태
		    data: {
		        labels: ['VIP', 'VVIP', 'GOLD', 'PLATINUM'], // 레이블
		        datasets: [{
		            label: '멤버 등급 분포도', // 차트 제목
		            data: [10, 20, 30, 40], // 데이터 값
		            backgroundColor: [
		                'rgba(255, 99, 132, 0.2)',
		                'rgba(54, 162, 235, 0.2)',
		                'rgba(255, 206, 86, 0.2)',
		                'rgba(75, 192, 192, 0.2)'
		            ], // 각 섹션의 배경 색상
		            borderColor: [
		                'rgba(255, 99, 132, 1)',
		                'rgba(54, 162, 235, 1)',
		                'rgba(255, 206, 86, 1)',
		                'rgba(75, 192, 192, 1)'
		            ], // 각 섹션의 테두리 색상
		            borderWidth: 1 // 테두리 굵기
		        }]
		    },
		    options: {
		        responsive: true, // 차트 반응형 설정
		        plugins: {
		            tooltip: {
		                callbacks: {
		                    label: function(tooltipItem) {
		                        var value = tooltipItem.raw;
		                        return value.toLocaleString() + '명'; // 툴팁 값 포맷팅 (명 단위)
		                    }
		                }
		            }
		        }
		    }
		});
	</script>
</body>
</html>