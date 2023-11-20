const ul = document.querySelector("ul");

// ! 이벤트 핸들러 함수에서의 첫번째 매개변수는 무조건 Event 객체다.
// ! 매개변수 이름은 자유롭게 사용할 수 있다.

let prevTarget;
let target;

function delegation(event){
    target = event.target;

    // ! event.target은 내가 클릭한 요소를 알려준다.
    if(target.nodeName === "UL") return
    if(prevTarget) prevTarget.classList.remove("active");
    
    while(target.nodeName !== "BUTTON") target = target.parentNode

    prevTarget = target;
    target.classList.add("active");
}

ul.addEventListener("click", delegation)