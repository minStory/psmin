// HTML에 접근하는 방법
// getElementById
// html 요소에 id값을 사용해서 접근할 수 있다.

const div=document.getElementById("div");
console.log(div);


// CSS 선택자처럼 요소에 접근하는 방법

// document.querySelector()
// html에 맨 위에 있는 요소 1개만 가져온다.

// document.querySelectorAll()
// html에 있는 모든 요소를 가져온다.
// querySelectorAll()을 사용하면 유사배열로 가져온다.

// 유사배열
// length 프로퍼티가 있고, 인덱스로 접근할 수 있는 것을 말한다.
// 유사배열은 배열 메서드를 사용할 수 없다.

const ul=document.querySelector(".ul");
const li=document.querySelector("li");
console.dir(ul);
console.log(li);

const lists=document.querySelectorAll("li");
console.log(lists);
console.log(lists[0]);


// 요소로 조작하기
// 1. innerText -> 텍스트를 넣고 읽을 수 있다.
// 2. innerHTML -> HTML 태그가 적용이 된다. 혹은 HTML 태그 및 텍스트를 읽을 수 있다.
// 3. textContent -> 텍스트를 넣고 읽을 수 있다.
const span=document.querySelector("span");

// span.innerText="이너텍스트";
span.textContent="텍스트컨텐트";
// span.innerHTML="<h1>이너HTML</h1>";

console.log(span);

console.log(ul.nodeName==="UL");


// HTML 속성 가져오기
// 1. setAttribute -> 속성 설정하기
// 2. getAttribute -> 속성 가져오기
// 3. hasAttribute -> 속성이 있으면 true, 없으면 false
// 4. removeAttribute -> 속성 제거하기
span.setAttribute("id", "span");
console.log(span.getAttribute("id"));
console.log(span.hasAttribute("id"));
span.removeAttribute("id");


// 요소 생성하기
// document.createElement(태그이름);
const main=document.createElement("main");
console.log(main);

// 요소를 어디에 넣을지 결정하기.
// appendChild() -> 특정 요소 맨 뒤에 넣는다.
document.body.appendChild(main);

// 'beforebegin' – elem 바로 앞에 html을 삽입합니다.
// 'afterbegin' – elem의 첫 번째 자식 요소 바로 앞에 html을 삽입합니다.
// 'beforeend' – elem의 마지막 자식 요소 바로 다음에 html을 삽입합니다.
// 'afterend' – elem 바로 다음에 html을 삽입합니다.

const div2=document.createElement("div");

div2.textContent="내가 만든 div";
console.log(div2);
main.insertAdjacentElement("beforebegin",div2);
main.insertAdjacentElement("afterbegin",div2);
main.insertAdjacentElement("beforeend",div2);
main.insertAdjacentElement("afterend",div2);