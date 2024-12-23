// 페이지 로드 시 실행되는 코드
document.addEventListener("DOMContentLoaded", () => {
	// ------ 영화 추가 페이지 날짜 select box ------
	const release_year = document.getElementsByClassName("release-year")[0];
	const release_month = document.getElementsByClassName("release-month")[0];
	const release_day = document.getElementsByClassName("release-day")[0];

	for (let i = 2024; i >= 1900; i--) {
		addOption(release_year, i, i);
	}

	for (let i = 1; i <= 12; i++) {
		addOption(release_month, i, i);
	}

	for (let i = 1; i <= 31; i++) {
		addOption(release_day, i, i);
	}
	// ------ end ------
});
// ------ DOMContentLoaded end ------