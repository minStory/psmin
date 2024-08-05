document.addEventListener("DOMContentLoaded", () => {

    // 페이지 로드 시 세션 시간 호출
    fetchRealTime();
    // ------ end ------


    // ------ 버튼을 누르면 세션 시간 초기화 ------
    const btnSession = document.getElementsByClassName("btn-session")[0];
    if (btnSession) {
        btnSession.addEventListener("click", () => {
            fetch("/session/initialized") // 세션을 리셋할 서버로 요청
                .then(response => {
                    if (response.ok) { // 응답이 정살일 경우
                        alert("Session initialization successful!");
                        fetchRealTime(); // 세션 시간 갱신
                    }
                })
                .catch(() => {
                    alert("Session initialization failed");
                });
        });
    }
    // ------ end ------
});
// ------ DOMContentLoaded end ------


// ------ 세션 실시간 알림 -------
function fetchRealTime() {
    fetch("/session/check") // 세션을 갱신할 서버로 요청
        .then(response => response.json()) // 응답을 json 객체로 변환
        .then(d => {
            // 비로그인 시에는 세션 실시간 알림 이벤트가 없다.
            const dto_field = document.getElementsByClassName("dto-field")[0];
            const dto = dto_field.getAttribute("data-dto");
            if (dto !== null) {
                const minute = d.minute === null || d.minute === undefined ? "" : d.minute < 10 ? "0" + d.minute : d.minute;
                const second = d.second === null || d.second === undefined ? "" : d.second < 10 ? "0" + d.second : d.second;
                document.getElementsByClassName("btn-session")[0].innerText = minute + ":" + second;
            }
        })
        .catch(() => {
            document.getElementsByClassName("btn-session")[0].innerText = "ERROR";
        });
}

// ------ end ------


// ------ 세션 만료 시 로그아웃  ------
function ExpiredSession() {
    fetch("/session/expired") // 세션 만료를 확인해 줄 서버로 요청
        .then(response => response.json()) // 응답을 json 객체로 변환
        .then(d => { // json 응답이 도착했을 때만 처리
            // 비로그인 시에는 세션이 만료되어도 이벤트가 없다.
            const dto_field = document.getElementsByClassName("dto-field")[0];
            const dto = dto_field.getAttribute("data-dto");
            if (dto !== null) {
                alert("Session expired");
                window.location.href = "/user/login"; // 세션 만료 시 리다이렉트할 페이지
            }
        })
        .catch(() => {
        });
}

// ------ end ------