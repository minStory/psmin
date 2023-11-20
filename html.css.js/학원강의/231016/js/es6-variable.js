// let
// 변수
// 재할당 가능
// 중복 선언 불가
// 블록 레벨 스코프
// 호이스팅이 되지만 안되는 것처럼 동작한다.
// 전역 객체에 할당된다.

// let a=1;
// function f(){
//     let a=2;
//     console.log(a);
// }
// console.log(a);
// f();

// const
// 변수 => 상수 (변하지 않는 값)
// 재할당이 금지된 변수
// 선언과 동시에 초기화 해야한다.
// 블록레벨 스코프
// 호이스팅이 되지만 안되는 것처럼 동작한다.

// let x=1;

// if(true){
//     let x=5;
// }

// function b(){
//     let x=10;
// }
// b();
// console.log(x);

// 조건문, 반복문은 값으로 평가되지 않는다.

// 원시타입 => 불변성
// 객체타입 => 값이 변할 수 있음

// const x=5;
// console.log(x);

// const user={
//     name:"성민"
// }
// user.age=25
// console.log(user);
// user.name="길동";
// console.log(user);

// 변수를 선언할 때에는 웬만하면 const로 선언

// 변수 단계
// 1. 선언 단계
// 2. 초기화 단계

// var 키워드는 선언과 동시에 초기화가 진행된다.

// let, const는 선언단계와 초기화단계가 각각 분리되어서 진행된다.
// 즉, 선언 이전에 참조하려고하면 Error가 뜬다.

// const x=10;
// function a(){
//     console.log(x); // 이전에 참조할 수 없다. Temporal Dead Zone => 일시적 사각지대
//     // TDZ란 참조하고 있는 스코프에서 선언 이전에 참조할 수 없는 구간
//     const x=20;
// }
// a();

// let 재할당 가능
// let d=1; // 중복할당 불가
let d=10;
if (true){
    d=20;
}
console.log(d);

// const 재할당 불가
// const e=1; // 중복할당 불가
const e=10;
if (true){
    // e=20;
}
console.log(e);