// 문서가 완전히 로드된 후 실행되는 코드
document.addEventListener("DOMContentLoaded", function () {

    var mpRight = document.querySelector(".mpRight"); // .mpRight 요소 선택
    var mpLeft = document.querySelector(".mpLeft"); // .mpLeft 요소 선택
    var headerBottom = document.querySelector(".main-page-header-bottom"); // .main-page-header-bottom 요소 선택
    var hiddenMenu = document.querySelector(".main-page-header-middle-menus-hidden"); // .main-page-header-middle-menus-hidden 요소 선택
    var menuItems = document.querySelectorAll(".main-page-header-middle-menus *"); // .main-page-header-middle-menus의 모든 자식 요소 선택

    // 슬라이드 다운 기능을 구현하는 함수
    function slideDown(element) {
        element.style.display = "block"; // 요소를 보이게 설정
        element.style.maxHeight = element.scrollHeight + "px"; // 요소의 최대 높이를 스크롤 높이로 설정
        element.style.opacity = "1"; // 요소를 완전히 보이게 설정
    }

    // 슬라이드 업 기능을 구현하는 함수
    function slideUp(element) {
        element.style.maxHeight = "0"; // 요소의 최대 높이를 0으로 설정
        element.style.opacity = "0"; // 요소를 투명하게 설정
        element.addEventListener("transitionend", function () {
            // 애니메이션이 끝난 후 요소를 숨김
            if (getComputedStyle(element).opacity === "0") {
                element.style.display = "none"; // 요소를 숨김
            }
        }, {once: true}); // 이벤트 리스너가 한 번만 호출되도록 설정
    }

    // .main-page-header-middle-menus의 모든 자식 요소에 대해 마우스 오버 시 슬라이드 다운
    menuItems.forEach(function (item) {
        item.addEventListener("mouseover", function () {
            slideDown(hiddenMenu); // .main-page-header-middle-menus-hidden 요소를 부드럽게 보이게 함
        });
    });

    // .main-page-header-middle-menus-hidden 요소에서 마우스가 떠날 때 슬라이드 업
    hiddenMenu.addEventListener("mouseleave", function () {
        slideUp(hiddenMenu); // 현재 요소를 부드럽게 숨김
    });

    // .main-page-header-middle-menus-hidden 요소의 초기 상태 설정
    hiddenMenu.style.display = "none"; // 요소를 숨김
    hiddenMenu.style.maxHeight = "0"; // 최대 높이를 0으로 설정
    hiddenMenu.style.opacity = "0"; // 투명도 설정
});
