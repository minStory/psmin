// 왼쪽 버튼 누르면 -100% 작동
// 오른쪽 버튼 누르면 +100% 작동
const leftBtn=document.querySelector(".arrows button:first-of-type");
const rightBtn=document.querySelector(".arrows button:last-of-type");

const slides=document.querySelector(".slide-list")

console.log("slide length : "+slides.children.length);

let x=0;

function leftClickHandler(){
    if(x<=0){
        console.log("left X");
        x=0;
        return;
    }
    x-=100;
    slides.style.transform=`translateX(-${x}%)`;
}

function rightClickHandler(){
    if(x>=(slides.children.length-1)*100){
        console.log("right X");
        x=(slides.children.length-1)*100;
        return;
    }
    x+=100;
    slides.style.transform=`translateX(-${x}%)`;
}

rightBtn.addEventListener("click", rightClickHandler);
leftBtn.addEventListener("click", leftClickHandler);

