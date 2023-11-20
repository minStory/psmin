// 스코프
// 식별자의 유효범위를 말한다.

// 스코프의 종류
// 전역
// 지역

// var
// var는 함수 레벨 스코프다.
// 즉, 함수를 단위로 지역 스코프로 인정한다.

// 전역변수
var x=1;

// 전역변수는 어디서든지 접근이 가능하다.
// 지역변수는 전역에서 접근할 수 없다.

// 전역함수
function 전역(){
    // 지역변수
    var x=2;
    console.log(x);
    // console.log(y);
    
    function 지역(){
        var y=10;
        console.log(x);
    }
    지역();
}
// console.log(x);
// 전역();

// 현재 참조하고있는 스코프에서 먼저 찾고, 없으면 상위 스코프에서 찾는다.

// 스코프는 항상 상위 단방향으로 찾아 올라간다.
// 전역 스코프까지 찾아 올라가는데, 없으면 Reference Error가 나온다.
// 즉, 식별자를 찾을 수 없다라는 참조 에러라는 뜻이다.

let a=1;
// let a=2;
function f(){
    let a=1;
    console.log(a);
}
console.log(a);
f();