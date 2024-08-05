// 슬라이드쇼를 3초 간격으로 호출하도록 설정
let sH = setInterval(slideH, 3000);

// 슬라이드를 오른쪽으로 이동시키는 함수
function slideH() {
    var mainTopPhoto = document.querySelector(".mainTopPhoto"); // .mainTopPhoto 요소 선택
    var firstChild = mainTopPhoto.firstElementChild; // .mainTopPhoto의 첫 번째 자식 요소 선택

    // 슬라이드 이동 애니메이션 설정
    mainTopPhoto.style.transition = "margin-left 0.5s";
    mainTopPhoto.style.marginLeft = "-100%"; // 슬라이드 왼쪽으로 이동

    // 애니메이션이 끝난 후 호출되는 함수
    mainTopPhoto.addEventListener(
        "transitionend",
        function () {
            mainTopPhoto.appendChild(firstChild); // 첫 번째 자식을 마지막으로 이동
            mainTopPhoto.style.transition = "none"; // 애니메이션 제거
            mainTopPhoto.style.marginLeft = "0"; // 슬라이드를 원래 위치로 복구
        },
        {once: true} // 이벤트 리스너가 한 번만 호출되도록 설정
    );
}

// 슬라이드를 왼쪽으로 이동시키는 함수
function slideH_re() {
    var mainTopPhoto = document.querySelector(".mainTopPhoto"); // .mainTopPhoto 요소 선택
    var lastChild = mainTopPhoto.lastElementChild; // .mainTopPhoto의 마지막 자식 요소 선택

    mainTopPhoto.insertBefore(lastChild, mainTopPhoto.firstElementChild); // 마지막 자식을 첫 번째 위치로 이동
    mainTopPhoto.style.marginLeft = "-100%"; // 슬라이드 왼쪽으로 이동
    mainTopPhoto.style.transition = "none"; // 애니메이션 제거

    // 다음 프레임에서 애니메이션을 재설정
    requestAnimationFrame(function () {
        requestAnimationFrame(function () {
            mainTopPhoto.style.transition = "margin-left 0.5s"; // 애니메이션 설정
            mainTopPhoto.style.marginLeft = "0"; // 슬라이드를 원래 위치로 복구
        });
    });
}

// 문서가 완전히 로드된 후 실행되는 코드
document.addEventListener("DOMContentLoaded", function () {
    // .mpRight 요소 클릭 시 슬라이드 오른쪽으로 이동
    document.querySelector(".mpRight").addEventListener("click", function () {
        clearInterval(sH); // 슬라이드쇼 인터벌을 중지
        slideH(); // slideH 함수 호출
    });

    // .mpLeft 요소 클릭 시 슬라이드 왼쪽으로 이동
    document.querySelector(".mpLeft").addEventListener("click", function () {
        clearInterval(sH); // 슬라이드쇼 인터벌을 중지
        slideH_re(); // slideH_re 함수 호출
    });

    var mainPageHeaderBottom = document.querySelector(".main-page-header-bottom"); // .main-page-header-bottom 요소 선택

    // .main-page-header-bottom 요소에 마우스 오버 시 왼쪽과 오른쪽 버튼 보이게 설정
    mainPageHeaderBottom.addEventListener("mouseover", function () {
        document.querySelector(".mpLeft").style.display = "block"; // .mpLeft 요소 보이게 설정
        document.querySelector(".mpRight").style.display = "block"; // .mpRight 요소 보이게 설정
    });

    // .main-page-header-bottom 요소에서 마우스가 떠날 때 왼쪽과 오른쪽 버튼 숨기기
    mainPageHeaderBottom.addEventListener("mouseleave", function () {
        document.querySelector(".mpLeft").style.display = "none"; // .mpLeft 요소 숨기기
        document.querySelector(".mpRight").style.display = "none"; // .mpRight 요소 숨기기
    });
});
