// 함수
// 많은 코드가 담긴 문법이다.
// 코드를 재사용하기 위해 사용한다.
// 객체지만, 호출을 할 수 있는 객체다.

// 함수를 만들 때 중요한 것
// 한가지의 일을 해야한다.
// 함수이름은 항상 의미에 맞게 지어야 한다.

// 함수 선언문
// function 키워드와 함수 이름이 있으면 함수 선언문이라고 한다.

// 매개변수(Parameter)
// 함수 선언부 옆에 있는 소괄호를 말한다.
// 인수에 넣은 순서대로 매개변수에서도 순서대로 받는다.

// 인수(Argument)
// 함수 호출부 옆에 있는 소괄호를 말한다.
// 실제 데이터가 입력되어야 한다.

// 반환값(return)
// 1. 함수가 값을 가지는 것을 말한다.
// 2. return을 만나면 함수는 종료한다.

// 함수 선언
function f(){
    console.log("함수")
}

// 함수 호출
f();

function addNumber(x,y){
    console.log(x+y)
    // return x+y;
}

console.log(addNumber(3,7));

// 함수가 이름이 있으면 기명함수라고 부른다.

// 함수가 이름이 없으면 익명함수라고 부른다.

// 함수를 변수에 담아서 사용하는 것을 함수 표현식이라고 부른다.
var fn=function(){
    console.log("익명함수")
}
fn();

// 함수 호이스팅
// 자바스크립트가 실행하기 이전에 식별자들을 평가하는데
// 함수 선언문은 함수 자체를 미리 기억하고 있기 때문에 호이스팅이 발생한다.
호이스팅();
function 호이스팅(){
    console.log("호이스팅");
}

// 함수 선언문과 함수 표현식의 차이
// 함수 선언문은 함수 호이스팅이 발생하지만
// 함수 표현식은 변수에 담았기 때문에 변수 호이스팅이 발생한다.

함수표현식();

var 함수표현식=function(){
    console.log("함수 표현식");
}

함수표현식();

function 함수표현식(){
    console.log("함수 표현식2");
}

함수표현식();


// for(var i=1; i<=9; i++){
//     console.log(`1 * ${i} = ${1*i}`);
// }

// 바깥에 있는 for문이 한번 돌 때마다 안에 있는 for문은 9번씩 돈다.
function 구구단출력(min, max){
    for(var i=min; i<=max; i++){
        for(var j=1; j<=9; j++){
            console.log(`${i} * ${j} = ${i*j}`);
        }
    }
}

function 구구단유효성(min, max, isValid){
    var isValid=true;
    if(min>max){
        alert("최소값이 최대값보다 클 수 없습니다.");
        isValid=false;
        return isValid;
    }
    if(typeof(min)!=="number" || typeof(max)!=="number"){
        alert("숫자를 입력해주세요.")
        isValid=false;
        return isValid;
    }
}

function 구구단(min, max, isValid){
    구구단유효성(min, max, isValid);
    if(isValid=true){
        구구단출력(min, max);
    }
}

// 구구단("ㅋㅋ",5);

// 중첩함수(외부함수, 내부함수)
function outerFunction(){
    function innerFunction(){
    }
}

// 프로그래밍 방법
// 1. 함수형 프로그래밍(functional Programming) FP
// 2. 객체지향 프로그래밍(Object Oriented Programming) OOP

// 1. 선언형 프로그래밍 -> 비절차적
// 2. 명령형 프로그래밍 -> 절차적

// 화살표 함수
// ES6(2015) 문법이다.
// 함수 표현식이다.

// 화살표 함수의 장점
// 코드가 한 줄이면 중괄호 블럭을 생략해도 된다. 즉. 간결해진다.
// 중괄호 블럭을 생략하면 return문이 생략된다.

// 화살표 함수 주의할 점
// 매개변수가 1개면 소괄호를 생략해도 된다.
// 매개변수가 0개이거나, 2개 이상이면 소괄호를 써야한다.


var arrow=()=>console.log('arrow');

var arrow2=x=>x;

var arrow3=(x,y)=>x+y;

arrow();
console.log(arrow2(1));
console.log(arrow3(1,2));