// ! 1. 오른쪽 버튼을 누르면 100% 작동
// ! 2. 왼쪽 버튼을 누르면 -100% 작동

const leftBtn = document.querySelector(".arrows button:first-of-type");
const rightBtn = document.querySelector(".arrows button:last-of-type");
const slides = document.querySelector('.slide-list');


let x = 0;

function rightClickHandler(){
    // 슬라이드의 개수 3 * 100
    // 300
    if (x >= (slides.children.length - 1) * 100){
        x = (slides.children.length - 1) * 100
        return 
    }

    x += 100
    slides.style.transform = `translateX(-${x}%)`;
}

function leftClickHandler(){
    if(x <= 0){
        x = 0
        return;
    }

    x -= 100;

    slides.style.transform = `translateX(-${x}%)`;
}


rightBtn.addEventListener("click", rightClickHandler)
leftBtn.addEventListener("click", leftClickHandler)