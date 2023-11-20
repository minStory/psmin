// 배열 (List)

const arr=["창운", "다운", "민지", "솔", "성민"];

console.log(arr);

arr.push("윤수");
console.log("push() 실행 후 :\n"+arr);

arr.unshift("현");
console.log("unshift() 실행 후 :\n"+arr);

arr.pop();
console.log("pop() 실행 후 :\n"+arr);

arr.shift();
console.log("shift() 실행 후 :\n"+arr);

console.log("'성민'의 Index No :\n"+arr.indexOf("성민"));

console.log("배열 길이 :\n"+arr.length);

console.log("reverse() 실행 후 :\n"+arr.reverse());

console.log(arr);

const newArr=arr.concat("윤수","상미");
console.log(newArr);

console.log("'솔'멤버가 있는지 검색 :\n"+newArr.includes("솔"));
