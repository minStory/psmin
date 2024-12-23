<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자페이지</title>
</head>
<body>
	<c:import url="header" />
	<!-- 관리자페이시 상단 -->
	<div class="adminpage_main">
		<div class="adminpage_top_infor adminpage-container" id="adminpage_top_infor">
			<div class="adminpage_box">
				<div class="adminpage_box_top">
					<h3 class="hidden">회원 등급 및 포인트</h3>
					<div class="admin_info">
						<div class="grade_area">
							<span class="txt_rank_common ml5">일반</span>
							<p class="name">
							<strong>${dto.getAdmin_name() } 관리자님 </strong> 반가워요!
						</p>
						</div>
						<div class="profile_set">
							<p class="tooltip_bk">닉네임을 설정해 주세요.</p>
							<button type="button" class="btn_txt_edit" title="레이어팝업 열기">편집</button>
						</div>
					</div>
					<div class="next_rank">
							<p>
								VIP까지 남은 금액 <em>260,000</em> 원
							</p>
						</div>
					<div class="bx_grade merge2020">
						<a href="#" class="btn_col5 ty5 rnd">MEMBERSHIP ZONE</a>
					</div>
				</div>
				<div class="adminpage_box_bottom">
					<div class="btn_wrap_1">
						<a href="#" target="_blank" title="L.POINT 페이지 이동"><span
							class="txt_img"><img src="#" alt="L.POINT"></span> <em>23P</em></a>
						<a href="#" title="쿠폰함 페이지 이동">쿠폰함 <em class="txt_color">0</em></a>
					</div>
				</div>
			</div>
			<div class="admin_theater" id="admin_theater">
				<div class="admin_theater_top">
					<h3 class="tit">admin 영화관</h3>
					<button type="button" class="btn_setup" title="레이어팝업 열기">설정</button>
				</div>
				<ul class="theater_box">
					<li class="add" id="admin_theater_1"><strong>1st</strong></li>
					<li class="add" id="admin_theater_2"><strong>2nd</strong></li>
					<li class="add" id="admin_theater_3"><strong>3rd</strong></li>
				</ul>
				<div class="banner_club">
					<a href="#"><img src="#" alt="BROVO CLUB 브라보"></a>
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
			<li><a><span>admin정보관리</span></a></li>
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
						<form>
							<select>
								<option value="제목">제목</option>
								<option value="내용">내용</option>
								<option value="제목+내용">제목+내용</option>
							</select>
							
								<input type="search" name="" placeholder="검색어를 입력해주세요"> <input
									type="submit" value="검색">
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
						<td><button onclick="location.href='admin_delete_notice_ok?noticeNo=${noticeList.get(n).getNotice_board_no()}'">삭제</button></td>
						<td><button onclick="location.href='admin_modify_notice?noticeNo=${noticeList.get(n).getNotice_board_no()}'">수정</button></td>
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
	<div class="b adminpage-container" >
		<div class="admin-top-name-insert">
			<h3>현재 상영작</h3>
			<button>작성하기</button>
		</div> 
		<div class="admin-search-quick">
						<form>
							<select>
								<option value="제목">제목</option>
								<option value="내용">내용</option>
								<option value="제목+내용">제목+내용</option>
							</select>
							
								<input type="search" name="" placeholder="검색어를 입력해주세요"> <input
									type="submit" value="검색">
						</form>
					</div>
		<div class="admin-movie-table">
			<div class="admin-movie-table-top">
					<table>
						<thead>
							<tr>
								<th>번호</th>
								<th>개봉 일자</th>
								<th>제목</th>
								<th>연령 등급</th>
								<th colspan="2">비고</th>
							</tr> 
						</thead>
						<tbody>
							<c:forEach begin="0" end="${movieNowList.size()-1 }" var="mn">
								<tr>
									<td>${movieNowList.get(mn).getMovie_no() }</td>
									<td>${movieNowList.get(mn).getMovie_release_date() }</td>
									<td><a href="movie_specific?no=${movieNowList.get(mn).getMovie_no()}">${movieNowList.get(mn).getMovie_title() }</a></td>
										<c:if test="${movieNowList.get(mn).getMovie_limit_age() == 0}">
									<td>
											all
									</td>
										</c:if>
										<c:if test="${movieNowList.get(mn).getMovie_limit_age() != 0}">
									<td>
											${movieNowList.get(mn).getMovie_limit_age()}
									</td>
										</c:if>
									<td colspan=2><button onclick="location.href='admin_movie_delete_ok?MovieNo=${movieNowList.get(mn).getMovie_no() }'">삭제</button><button onclick="location.href='admin_modify_movie?MovieNo=${movieNowList.get(mn).getMovie_no() }'">수정</button></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
			</div>
			<div class="admin-movie-table-bottom">
				<h3>상영 예정작</h3>
					<table>
						<thead>
							<tr>
								<th>번호</th>
								<th>개봉 일자</th>
								<th>제목</th>
								<th>연령 등급</th>
								<th colspan="2">비고</th>
							</tr> 
						</thead>
						<tbody>
							<c:forEach begin="0" end="${moviePlanList.size()-1 }" var="mp">
								<tr>
									<td>${moviePlanList.get(mp).getMovie_no() }</td>
									<td>${moviePlanList.get(mp).getMovie_release_date() }</td>
									<td><a href="movie_specific?no=${moviePlanList.get(mp).getMovie_no() }">${moviePlanList.get(mp).getMovie_title() }</a></td>
										<c:if test="${moviePlanList.get(mp).getMovie_limit_age() == 0}">
									<td>
											all
									</td>
										</c:if>
										<c:if test="${moviePlanList.get(mp).getMovie_limit_age() != 0}">
									<td>
											${moviePlanList.get(mp).getMovie_limit_age()}
									</td>
										</c:if>
										<td colspan=2><button onclick="location.href='admin_movie_delete_ok?MovieNo=${moviePlanList.get(mp).getMovie_no() }'">삭제</button><button onclick="location.href=''">수정</button></td>
								</tr>
							</c:forEach>
						</tbody>
					</table>
				</div>
		</div>
	</div>


	<!-- 1:1문의 -->
	<div class="admin-inquiry c adminpage-container">
 		<div class="admin-table">
 			<h3 class="admin-table-title">1:1 문의내역</h3>
                    <table>
                        <thead>
                            <tr> <th>번호</th> <th>제목</th> <th>날짜</th> <th>분류</th></tr>
                        </thead>

                        <tbody>
                            <tr> <td>3</td> <td><a href="#">문의목록3</a></td> <td>2024.05.06</td> <td>영화관</td> </tr>
                            <tr> <td>2</td> <td><a href="#">문의목록2</a></td> <td>2024.05.06</td> <td>영화</td> </tr>
                            <tr> <td>1</td> <td><a href="#">문의목록1</a></td> <td>2024.05.06</td> <td>개인정보</td> </tr>
                        </tbody>

                    </table>
		</div>
	
	</div>
	
	<!-- admin정보관리 -->
	<div class="admininfo d adminpage-container">
		<div class="admininfo-tab">
			<ul class="admininfo-menubox">
				<li>
					<a href="changeinfo">
						<span class="img"><img src="./images/adminpage/ic_admin_menu_1.png" alt="회원 정보 변경"></span>
						<span class="txt_rt_arrow">회원 정보 변경</span>
					</a>
				</li>
				<li>
					<a href="changepassword">
						<span class="img"><img src="./images/adminpage/ic_admin_menu_2.png" alt="비밀 번호 변경"></span>
						<span class="txt_rt_arrow">비밀 번호 변경</span>
					</a>
				</li>
				<li>
					<a href="memberquit">
						<span class="img"><img src="./images/adminpage/ic_admin_menu_3.png" alt="회원 탈퇴"></span>
						<span class="txt_rt_arrow">회원 탈퇴</span>
					</a>
				</li>
			</ul>
		
		<div class="list_bdr_box">
			<ul class="list_txt">
				<li>라떼시네마는 L.POINT 제휴 사이트입니다. 비밀번호/회원정보는 라떼멤버스㈜에서 관리되고 있으며, 회원가입 시 등록하신 개인정보는 라떼멤버스㈜에서 변경하실 수 있습니다.</li>
				<li>라떼시네마 회원탈퇴를 원하시면 회원탈퇴 버튼을 클릭해주세요. 회원을 탈퇴하시면 등록되어 있던 쿠폰/할인권/관람권/L.POINT카드 등 개인정보가 삭제되어 <br> 
				재가입 시 다시 입력하셔야 합니다.
				</li>
				
				<li>2024년 VIP 회원은 2023년 1월 1일부터 12월 31일 까지 관람한 영화의 VIP 승급금액 실적 기준으로 이루어 집니다. 
				<button type="button" class="btn_col4 ty3" title="레이어팝업 열기">광고 수신동의 내역 확인 및 변경</button>
				</li>
			</ul>
		</div>
		

	</div>
		
	
	
	</div>

	<jsp:include page="/WEB-INF/include/footer.jsp" />


	<!-- 텝변경 스크립트 -->
	<script>
		const a = document.getElementsByClassName("a")[0];
		const b = document.getElementsByClassName("b")[0];
		const c = document.getElementsByClassName("c")[0];
		const d = document.getElementsByClassName("d")[0];
		
		const adminpage_top_menu_tab = Array.from(document.getElementsByClassName("adminpage_top_menu_tab")[0].children);
		
		a.style.display = "block";
		b.style.display = "none";
		c.style.display = "none";
		d.style.display = "none";
		
		
		adminpage_top_menu_tab.forEach((li, idx) => {
			li.addEventListener("click", () => {
				
				a.style.display = "none";
				b.style.display = "none";
				c.style.display = "none";
				d.style.display = "none";
				
				if(idx == 0){
					a.style.display = "block";
				}else if(idx == 1){
					b.style.display = "block";
				}else if(idx == 2){
					c.style.display = "block";
				}else if(idx == 3 ){
					d.style.display = "block";
				}
			})
		})
	</script>
</body>
</html>