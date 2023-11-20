//객체(object)
var user={
    name:"성민",
    age:10,
    "first-Name":"성민"
}

console.log(user);
console.log(user.age);
// 객체에서 값 접근하는 방법
// 객체에서 값을 접근하려면 두가지 방법이 있다.
// 1. 마침표 표기법 ✅
// 2. 대괄호 표기법
console.log(user.name);
console.log(user["name"]);
console.log(user["first-Name"]);

// 객체에서 추가하는 방법
user.hobby="코딩";
console.log(user.hobby);
console.log(user["hobby"]);

// 객체에서 값을 변경하는 방법
user.age=20;
console.log(user);

// 객체에서 프로퍼티 삭제하기
delete user.hobby;
console.log(user);