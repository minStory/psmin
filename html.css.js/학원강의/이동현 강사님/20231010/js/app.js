// Camel Case
// 두번째 단어의 첫 글자는 대문자로 사용한다.

// 예시
var javascriptLearn = "js Learn"

// Snake Case
// 뱀처럼 생겼다해서 _를 사용한다.
var javascript_Learn = "Js Learn"

// Pascal Case
// 첫글자를 대문자로 사용한다. (생성자 함수 파트에서 배울거에요)
var JavascriptLearn = "JS Learn"


// Data Type 7개.
// 1. 문자열 => '', "", ``(백틱)
var string = `문자열`;

// 2. 숫자
var number = 5;

// 3. boolean(불리언, 불린)
var truthy = true;
var falsy = false;

// 4. undefined (정의되지 않았다.)
var und = undefined;

// 5. null (빈 값)
var nul = null;

// 6. Symbol (유일무이한 값)
var sym = Symbol("유일무이한 값")

// 7. Object(객체)
var obj = {}
var arr = []


// 자바스크립트는 동적 타입 언어다.
// 동적 타입 언어는 데이터 타입이 자유롭게 바뀔 수 있다.
// 타입이 자유롭다.
var age = "15"; // 문자열
age = 20; // 숫자

// 단점: 타입이 바뀔 수 있기 때문에 오류가 날 확률이 높다.

// 타입스크립트
// var age: number = 15;

// 산술 연산자
console.log(5 + 5); // 10
console.log(5 - 5); // 0
console.log(5 * 5); // 25
console.log(5 / 5); // 1
console.log(5 % 5); // 0

var counter = 0;

// 증감 연산자
++counter // 1씩 증가
counter++ // 1씩 증가
console.log(counter) // 2

--counter // 1씩 감소
counter-- // 1씩 감소
console.log(counter) // 0

// 문자열 연결 연산자
console.log("웹3" + " 자바스크립트");

console.log("5" + 5); // 55

console.log("5" == 5); // true 데이터 타입을 비교하지 않는다.
console.log("5" === 5);

console.log("5" !== 5);

// or 연산자
// true가 하나라도 있으면 true를 반환한다.
console.log(true || true); // true
console.log(true || false); // true 
console.log(false || true); // true
console.log(false || false); // false

// 회원가입, 성별 체크.
// 남□ 녀□

// and 연산자
// false가 하나라도 있으면 falsae를 반환한다.
console.log(true && true); // true
console.log(true && false); // false
console.log(false && true); // false 
console.log(false && false); // false
// 이름, 생년월일

console.log(!true) // false
console.log(!false) // true


// Truthy한 값
// Falsy한 값

// 진실인 값과 거짓인 값
// Falsy한 값 
// 0
// ""
// NaN (Not a Number)
// undefined
// null

console.log(!0); // true
console.log(0 || false) // false

console.log(typeof(1));
console.log(typeof(2.3))
console.log(typeof(true));
console.log(typeof "문자열"); // string
console.log(typeof ("5" + 5)); // 숫자가 아니라 문자열이다. string