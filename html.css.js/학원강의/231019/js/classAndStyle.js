// Javascript Style

const div=document.querySelector("div");
 
// CSS에서 background-color처럼 -(하이픈)가 붙어있으면
// -(하이픈)을 제거하고 뒤에있는 첫 글자를 대문자로 한다.
// ex) backgroundColor, zIndex

div.style.width="200px";
div.style.height= "200px";
div.style.backgroundColor="red";

// HTML의 class 조작하기
// 속성 중에서 class만 조작하는 방법
// setAttribute를 사용해도 되지만, class를 조작할 때에는 classList를 사용하는게 좋다.

div.classList.add("box","box2");
div.classList.remove("box");

// class 있는지 확인하기 -> Boolean 값을 반환한다.
console.log(div.classList.contains("box"));

// toggle
div.classList.toggle("active1");
div.classList.toggle("active2");
div.classList.toggle("active3");

setInterval(()=>{
    div.classList.toggle("active");
},1000)