// !반복문
// & for문(반복 횟수를 알 때)
// !for(초기값; 조건식; 증감식)
// Template Literal은 백틱을 사용해야한다.
// 문자열에서 변수를 사용할 때에는 ${변수이름}을 사용해야한다.
// 템플릿 리터럴을 사용하면 문자열로 반환된다.
for(var i=0; i<10; i++){
    if(i%2){
        console.log(`홀수 : ${i}`);
    }else{
        console.log(`짝수 : ${i}`);
    }
}

// !for문 실행 순서
// 1. var i = 0;
// 2. i가 10보다 작으면 console.log(i)를 출력
// 3. i를 1씩 증가

// !반복문 키워드
// 1. break -> 반복문 탈출
// 2. continue

// & while문(반복 횟수를 모를 때)
var cnt=0;
while(true){
    // 무한반복
    cnt++;
    console.log(cnt);
    if(cnt===1000){
        break;
    }
}