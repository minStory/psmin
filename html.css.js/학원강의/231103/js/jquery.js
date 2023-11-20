$(document).ready(function(){
    // process.. 
    // console.log($("#div"));
    // console.log($("li"));

    // $("li").css("color","red");

    // jQuery Version
    // $("li").on("click",function(){
    //     $("li").css("color","black")
    //     $(this).css("color","red")
    // });

});

// Javascript Version
const lists=document.querySelectorAll("li");

// for문
// for(let i=0; i<lists.length; i++){
//     lists[i].addEventListener("click",function(){
//         for(let j=0; j<lists.length; j++){
//         lists[j].style.color="black";
//         }
//     lists[i].style.color="red";
//     })
// }

// forEach 익명함수
// lists.forEach(function(li){
//     li.addEventListener("click",function(){
//         lists.forEach(function(li){
//             li.style.color="black"
//         })
//     li.style.color="red"
//     })
// })

// forEach 화살표함수
lists.forEach((li)=>{
    li.addEventListener("click",()=>{
        lists.forEach((li)=>{
            li.style.color="black"
        })
    li.style.color="red"
    })
})
