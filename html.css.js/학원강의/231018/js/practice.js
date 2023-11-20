// main 태그 만들고, 안에 section 태그를 넣는다.
// section 태그를 gugudan 클래스로 만든다.
// section 태그 안에 구구단이 출력되게 만든다.

const main=document.createElement("main");
const section=document.createElement("section");

section.setAttribute("class", "gugudan");

function gugudanPrint(){
    let gugudanContents="";
    for(let i=1; i<=9; i++){
        gugudanContents+=`=====${i}단 시작=====</br>`;
        for(let j=1; j<=9; j++){
            gugudanContents+=`${i} * ${j} = ${i*j} </br>`;
        }
    }
    return gugudanContents;
}

section.innerHTML=gugudanPrint();

main.insertAdjacentElement("afterbegin",section);
document.body.appendChild(main);

