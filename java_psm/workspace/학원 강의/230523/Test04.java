//composite 포함
//원 점
//상속 : ~은 ~이다
//포함 : ~은 ~을 가지고 있다

//오버라이딩
//1.선언부가 조상클래스의 메서드와 일치해야한다.
//2.접근 제어자를 조상클래스의 메서드보다 좁은 범위로 변경할 수 없다.
//3.예외는 조상클래스의 메서드보다 많이 선언할 수 없다.

//오버로딩 : 기존에 없는 메서드를 정의하는 것
//오버라이딩 : 상속받은 메서드의 내용을 변경하는 것


package day_0523;

public class Test04 {

	public static void main(String[] args) {
		Leader leader1=new Leader();
		leader1.eat();	//상속받은 메서드 사용
		leader1.say();	//오버라이딩한 메서드 사용
	}

}
class Student{
	void learn() {
		System.out.println("배우기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("선생님 안녕하세요!");	//일반 학생
	}
}
class Leader extends Student{
	void lead() {
		
	}
	void say() {
		
		System.out.println("선생님께 인사");	//오버라이딩
	}
}