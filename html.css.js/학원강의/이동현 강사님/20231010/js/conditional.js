
// 조건문
// if(조건식){
//     // 조건식이 만족하면 코드 실행
// }

// 경고창
// alert("경고가 발생했습니다.")
// confirm("진행 하시겠습니까?")
// prompt("1 + 1은 무엇인가요?")

// var prom = prompt("1 + 1은 무엇인가요?");

// if(!prom || prom === ""){
//     alert("다시 시도해주세요.");
// }

// if(prom === "2"){
//     alert("정답입니다!")
// } else if(prom !== null && prom !== "2" && prom!== ""){
//     alert("틀렸습니다 다시 시도해주세요.")
// }

var drink = prompt("음료수를 선택하세요.")

if(drink === "콜라"){
    console.log("콜라")
} else if (drink === "사이다"){
    console.log("사이다")
} else {
    console.log("위에 조건들이 만족하지 않았을 때")
}



// 입력하고 확인 => 사용자가 입력한 그대로 값이 노출.
// 확인 눌렀을 때 => 아무런 값이 뜨지 않는다.
// 취소 => null 값이 뜬다.