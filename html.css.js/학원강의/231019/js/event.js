// Event
// HTML 속성을 사용해 Event를 등록하는 방법 ❌
// DOM 프로퍼티를 사용해 Event를 등록하는 방법 ❌
// addEventListener를 사용해 Event를 등록하는 방법 ✅


const buttonPlus=document.querySelector(".plus");
const buttonMinus=document.querySelector(".minus");
const h1=document.querySelector("h1");
let cnt=0;

// addEventListener("이벤트 종류",이벤트 핸들러(함수))
// 이벤트 핸들러 -> 특정 이벤트가 발생했을 때 실행할 함수를 말한다.

buttonPlus.addEventListener("click",()=>{
    cnt++;
    h1.innerText=cnt;
});

buttonMinus.addEventListener("click",()=>{
    if(cnt<=0){
        return;
    }
    cnt--;
    h1.innerText=cnt;
})
