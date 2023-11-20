// ! 1. 오른쪽 버튼을 누르면 100% 작동
// ! 2. 왼쪽 버튼을 누르면 -100% 작동
const arrows = document.querySelector(".arrows");
const slides = document.querySelector('.slide-list');
const paginationElem=document.querySelector(".pagination");

const slidesLength = slides.children.length - 1

const addClass = (element, className) => element.classList.add(className)
const removeClass = (element, className) => element.classList.remove(className)

const moveSlide = () => slides.style.transform = `translateX(-${x}%)`;

let prevPagination;

let x = 0;

function rightClickHandler(){
    if (x >= slidesLength * 100) {
        return 
    }

    x += 100
}

function leftClickHandler(){
    if(x <= 0){
        return;
    }

    x -= 100;
}

function disabledArrow(){
    const leftBtn = document.querySelector(".arrows button:first-of-type")
    const rightBtn = document.querySelector(".arrows button:last-of-type")
    
    if(x===0){
        addClass(leftBtn,"disabled");
    }
    
    if(x>0){
        removeClass(leftBtn,"disabled")
    }
    
    if(x !== slidesLength * 100){
        removeClass(rightBtn, "disabled")
    }
    
    if (x === slidesLength * 100){
        addClass(rightBtn, "disabled")
    }
}

function slideHandler(event){
    if(event.target.classList.contains("left-btn")){
        leftClickHandler(event.target)
    } else {
        rightClickHandler(event.target)
    }

    //화살표를 눌렀을 때, pagination 번호를 알아야 한다.
    // console.log(x/100);
    // console.log(document.querySelectorAll(".pagination li")[x/100]);
    const paginationElem = document.querySelectorAll(".pagination li")[x/100];
    
    if(prevPagination){
        removeClass(prevPagination, "active");
    }
    addClass(paginationElem,"active");
    prevPagination=paginationElem;

    moveSlide()
    disabledArrow();
}

function pagination(){
    for(let i=0; i<slides.children.length; i++){
        const createLI=document.createElement("li");
        createLI.setAttribute("class", `pagination-${i}`);
        paginationElem.insertAdjacentElement("beforeend",createLI); //요소를 어디에 넣을건지 결정
    }

    const firstPagination = document.querySelector(".pagination li")
    prevPagination = firstPagination

    addClass(firstPagination, "active")
}

function paginationHandler(event){
    // console.log(event.target)
    if(event.target.nodeName==="UL"){
        return;
    }

    if(prevPagination){
        removeClass(prevPagination, "active");
    }

    prevPagination=event.target;

    // console.log(event.target.getAttribute("class"));
    // 문자열을 잘라야함 -> Page가 있으면 번호만 출력해야한다.
    const index = event.target.getAttribute("class").slice(11);
    // console.log(index);

    x = index * 100;

    addClass(event.target, "active");
    moveSlide();
    disabledArrow();
}

paginationElem.addEventListener("click", paginationHandler);
arrows.addEventListener("click", slideHandler)

pagination();
disabledArrow();

