// 왼쪽 버튼 누르면 -100% 작동
// 오른쪽 버튼 누르면 +100% 작동
const arrows =document.querySelector(".arrows");
const slides=document.querySelector(".slide-list")
const slideLength=slides.children.length;


let x=0;

function leftClickHandler(){
    if(x<=0){
        console.log("left X");
        x=0;
        return;
    }
    x-=100;
}

function rightClickHandler(){
    if(x>=(slideLength-1)*100){
        console.log("right X");
        x=(slideLength-1)*100;
        return;
    }
    x+=100;
}

const moveSlide=()=>slides.style.transform=`translateX(-${x}%)`;

function slideHandler(event){
    console.log(event.target);
    if(event.target.classList.contains("left-btn")){
        leftClickHandler();
    }
    else{
        rightClickHandler();
    }
    moveSlide();
}

arrows.addEventListener("click", slideHandler);


