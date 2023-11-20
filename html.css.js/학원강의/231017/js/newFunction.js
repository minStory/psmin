// 생성자 함수
// 공통적인 프로퍼티를 새롭게 만드는 것이 아니라, 공장처럼 찍어내는 객체를 만들 수 있다.
// 생성자 함수는 Pascal Case를 사용한다.
// 앞에 new 키워드를 붙여줘야 한다.


// ES-5 자바스크립트 생성자(자바 클래스와 유사)
// function Student(name, age){
//     this.name=name;
//     this.age=age;
//     // this.getName=function(){
//     //     console.log(this.name);
//     // }
//     // this.getAge=function(){
//     //     return this.age;
//     // }
// }

// Student.prototype.getName=function(){
//     // return this.name;
//     console.log(this.name);
// }

// Student.prototype.class="SBS 컴퓨터학원";


// ES-6 자바 클래스와 유사하게 사용하기
class Student{
    constructor(){ //기본 생성자
        this.name="가나다";
        this.age=100;
    }
    // constructor(age, name){
    //     this.name=name;
    //     this.age=age;
    // }
    class="SBS 컴퓨터학원";
    getName(){
        console.log(this.name);
    }
}

// 프로토타입(Prototype)
// 어떤객체의 상위객체 역할을 하는 것을 말한다.

// 인스턴스(Instance)
// 생성자 함수를 변수에 할당하면 인스턴스라고 부른다.
const 창운 = new Student("창운",20);
const 다운 = new Student("다운",20);
const 민지 = new Student("민지",20);
const 솔 = new Student("솔",20);
const 성민 = new Student("성민",20);

const 기본 = new Student();

console.log(성민);
성민.getName();
console.log(성민.class);
기본.getName();

// 객체안에 있는 값이 함수가 아니라면 프로퍼티라고 부른다.
// 객체안에 있는 값이 함수라면 일반적으로 메서드라고 부른다.

// this => 자신이 속한 객체를 가리킨다.

// const 창문={
//     name:"창운",
//     age:"20",
//     getName:function(){
//         console.log(this.name);
//     }

// ES-6
// getName(){
//     console.log(this.name);
// }
// }

console.log(window);
