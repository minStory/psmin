// !배열
// !배열은 하나의 값에 여러개의 데이터가 저장되어 있는 것을 말한다.
var array=[1,2,3,4,5];
console.log(array);
// !배열안에 있는 각각의 값들을 요소라고 부른다.
// !배열에서는 인덱스 번호를 가지는데, 인덱스 번호는 0부터 시작한다.

// !1. 배열에서 요소 접근(인덱스 번호로 접근해야한다)
console.log(array[0]);

// !2. 배열 요소의 값 변경
array[0]=100;
console.log(array);

// !3. 배열 요소 추가
array[5]=6;
console.log(array);

// !배열 length 프로퍼티
console.dir(array.length);

var arr2=["창운","동현","다운","민지","솔","윤수","성민"];
for(var i=0 ; i<arr2.length; i++){
    if(arr2[i]==="동현"){
        continue;
    }
    console.log(arr2[i]);
}