document.addEventListener("DOMContentLoaded", () =>{
	
	let l_idx = 0; // 선택한 지역의 인덱스를 담을 변수
	let l_d_idx; // 선택한 세부지역의 인덱스를 담을 변수
	let m_idx; // 선택한 영화의 인덱스를 담을 변수
	
	let l_list = []; // 동적으로 생성되는 지역명을 담을 리스트
	let l_d_list = []; // 동적으로 생성되는 세부지역명을 담을 리스트
	let m_list = []; // 동적으로 생성되는 영화명을 담을 리스트
	
	let count = 0;
	let choose_count = 0;
	
	const partition_content = Array.from(document.getElementsByClassName("partition-content")[0].children);
	const reserve_content = Array.from(document.getElementsByClassName("reserve-content"));
	
	// 첫번째 파티션을 제외하고 모두 숨김
	reserve_content.forEach((li, idx) => {
		if(idx !== 0){
			li.style.display = "none";
		}
	});
	
	// 선택한 파티션 표시
	partition_content.forEach((p_li, p_idx) => {
		if(p_idx === 0){
			p_li.style.backgroundColor = "#FF243E";
			p_li.style.color = "#ffffff";
		}
		
		p_li.addEventListener("click", () => {
			partition_content.forEach((p_p_li, p_p_idx) => {
				p_p_li.style.fontWeight = "400";
				if(p_p_idx < p_idx){
					p_p_li.style.backgroundColor = "#333333";
					p_p_li.style.color = "#ffffff";
				}else{
					p_p_li.style.backgroundColor = "#ffffff";
					p_p_li.style.color = "#000000";
				}
			})
			
			p_li.style.backgroundColor = "#FF243E";
			p_li.style.color = "#ffffff";
			p_li.style.fontWeight = "800";
			
			reserve_content.forEach((r_li, r_idx) => {
				if(p_idx === r_idx){
					r_li.style.display = "flex";
				}else{
					r_li.style.display = "none";
				}
			});
		});
	});
	
	// Movie Data 받아오기
    fetchStringData();
    
    // String Data 받아오기
    setTimeout(fetchMovieData, 500); // 0.5초(500ms) 후에 실행
    
	// ------ String Data 받아오는 메서드 ------
	function fetchStringData(){
		fetch("reserve_data")
		    .then(response => response.json())
		    .then(data => {
			
		        // 페이지 로드 시 지역 표시
		    	const location_bottom_left = document.getElementsByClassName("location-bottom-left")[0];
		        data.local_list.forEach((li, idx) => {
					l_list.push(li);
		        	location_bottom_left.innerHTML += "<li>" + li + "<span>(" + data.size_list[idx] + ")</span>" + "</li>";
				})
				// 페이지 로드 시 첫번째 항목에 체크 표시
				location_bottom_left.children[0].classList.add("check");
				
				
				// 서블릿에서 받아온 list를 하나의 list에 담기
				const total_list = [data.seoul_list, data.gyeonggiIncheon_list, data.chungCheongDaeJeon_list, data.jeollaGwangju_list,
								data.gyeongbukDaegu_list, data.gyeongnamBusanUlsan_list, data.gangwon_list, data.jeju_list];
				// 지역명 리스트 생성								
				l_d_list = total_list;
				
				// 페이지 로드 시 세부 지역 표시
				const location_bottom_right = document.getElementsByClassName("location-bottom-right")[0];
		    	total_list[0].forEach(li => {
		    		location_bottom_right.innerHTML += "<li>" + li + "</li>"
				})
				
				// 지역 선택 시 세부 지역 변경
				const location_bottom_left_list = Array.from(document.getElementsByClassName("location-bottom-left")[0].children);
				const movie_bottom_list = document.getElementsByClassName("movie-bottom-list")[0];
				
		        location_bottom_left_list.forEach((li, idx) => {
					li.addEventListener("click", () => {
						// 선택한 지역의 인덱스 담기
						l_idx = idx;
						l_d_idx = null;
						m_idx = null;
						// 모든 지역의 배경색 및 체크아이콘 초기화
						location_bottom_left_list.forEach(li => {
							li.classList.remove("check");
						})
						
						total_list.forEach((total_li, total_idx) => {
							if(idx === total_idx){
								// 선택한 지역의 배경색 및 체크아이콘 적용
								li.classList.add("check");
								// 영화 리스트 초기화
								movie_bottom_list.innerHTML = "";
								// 세부지역 리스트 초기화
								location_bottom_right.innerHTML = "";
								// 선택한 지역에 해당하는 세부지역 표시
								total_li.forEach(li => {
									location_bottom_right.innerHTML += "<li>" + li + "</li>";
									// 동적으로 생성된 세부 지역명 적용을 위해 실행
									fetchMovieData();
								})
							}
						})
					})
				})
		    })
	        .catch(error => console.error("Error:", error));
    }
    // ------ end ------
	
	
	// ------ Movie Data 받아오는 메서드 ------
	function fetchMovieData(){
		fetch("reserve_data_movie")
			.then(response => response.json())
			.then(data => {
 				const location_bottom_right_list = Array.from(document.getElementsByClassName("location-bottom-right")[0].children);
				const movie_bottom_list = document.getElementsByClassName("movie-bottom-list")[0];
				
				location_bottom_right_list.forEach((li, idx) => {
					li.addEventListener("click", () => {
						// 선택한 세부지역의 인덱스 담기
						l_d_idx = idx;
						m_idx = null;
						// 모든 세부지역의 배경색 및 체크아이콘 초기화
						location_bottom_right_list.forEach(li => {
							li.classList.remove("check");
						})
						// 선택한 지역의 배경색 및 체크아이콘 적용
						li.classList.add("check");
						// 영화 리스트 초기화
						movie_bottom_list.innerHTML = "";
						// 선택한 세부지역에 헤딩하는 영화 리스트 표시
						data.forEach(li => {
							// 동적으로 생성된 영화 리스트 생성
							m_list.push(li.no);
							// 서버에서 받아온 제한연령 표시를 위한 변수
							const limit_age = "background:url('images/grade_" + li.limit_age +".png') no-repeat center/cover";
							movie_bottom_list.innerHTML += `<li><span class="limit-age" style="${limit_age};"></span>` + li.title + "</li>";
							
							const movie_list = Array.from(document.getElementsByClassName("movie-bottom-list")[0].children);
							// 선택한 영화 리스트에 배경색 및 체크아이콘 적용
							movie_list.forEach((li, idx) => {
								li.addEventListener("click", () => {
									// 선택한 영화의 인덱스 담기
									m_idx = idx;
									// 배경색 및 체크아이콘 초기화
									movie_list.forEach(li => {
										li.classList.remove("check");
									})
									li.classList.add("check");
								})
							});
						});
					});
				});
			})
			.catch(error => console.error("Error:", error));
	}
	// ------ end ------

	const movie_time = Array.from(document.getElementsByClassName("movie-time"));
	
	movie_time.forEach(li => {
		li.addEventListener("click", () => {
			let loc = l_list[l_idx];
			let loc_detail = l_d_list[l_idx][l_d_idx];
			let movie_no = m_list[m_idx];
			
			if(loc_detail !== undefined && movie_no !== undefined){
				partition_content[1].click();
			}
		})
	})
	
	
	const people_count = document.getElementsByClassName("people-count")[0];
	const plus_btn = document.getElementsByClassName("plus-btn")[0];
	const minus_btn = document.getElementsByClassName("minus-btn")[0];
	
	const seats = Array.from(document.getElementsByClassName("choose-seat-content")[0].children);
	
	people_count.innerHTML = count;
	
	minus_btn.addEventListener("click", () => {
		if(count > 0){
			count--;
		}
		
		if(count < choose_count){
			choose_count = 0;
			seats.forEach(li => {
				li.classList.remove("choose");
				li.classList.remove("complete");
			})
		}
		
		if(count === choose_count){
			seats.forEach(li => {
				li.classList.add("complete");
			})
		}
		
		if(count === 0){
			seats.forEach(li => {
				li.classList.remove("choose");
				li.classList.remove("complete");
			})
		}
		people_count.innerHTML = count;
		//alert("count = " + count + ", choose_count = " + choose_count);
	})
	
	plus_btn.addEventListener("click", () => {
		count++;
		people_count.innerHTML = count;
		
		if(choose_count !== count){
			seats.forEach(li => {
				li.classList.remove("complete");
			})
		}
		//alert("count = " + count + ", choose_count = " + choose_count);
	})
	
	
	
	seats.forEach(li => {
		li.addEventListener("click", () => {
			if(choose_count !== count){
				if(li.classList.contains("choose")){
					choose_count--;
					li.classList.remove("choose");
				}else{
					choose_count++;
					li.classList.add("choose");
				}
				
				if(choose_count ===  count){
					seats.forEach(li => {
						li.classList.add("complete");
					})
				}
			}else{
				alert("인원수를 추가해주세요.")
			}
			//alert("count = " + count + ", choose_count = " + choose_count);
		})
	})
	
	const go_payment_btn = document.getElementsByClassName("go-payment-btn")[0];
	
	go_payment_btn.addEventListener("click", () => {
		alert("Asdf");
		
		if(choose_count === count){
			fetch(`reserve_processing?loc=${loc}&loc_detail=${loc_detail}&movie_no=${movie_no}&count=${count}`)
				.then(response => response.json())
				.then(data => {
					alert("loc = " + data.loc + ", loc_detail = " + data.loc_detail + ", movie_no = " + data.movie_no + ", count = " + data.count);
					partition_content[2].click();
				})
				.catch(error => console.error("Error:", error));
		}
	})
	
	
	
	
});


