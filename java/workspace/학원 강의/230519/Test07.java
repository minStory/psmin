//상속
//재사용성을 높이고 코드의 중복을 제거하여 프로그램 생산성과 유지보수에 기여한다.
//자손클래스는 조상클래스의 모든 멤버변수를 상속받는다.
//(단, 초기화블럭이나 생성자는 상속되지 않는다.
//자손클래스의 멤버변수는 조상클래스의 멤버변수보다 많거나 같다.

package day_0519;

public class Test07 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.breath();
		s1.learn();
		Teacher t1=new Teacher();
		t1.eat();
		t1.teach();
	}
}

class Person {
	void breath() {
		System.out.println("숨쉬기");
	}
	void eat() {
		System.out.println("밥먹기");
	}
	void say() {
		System.out.println("말하기");
	}
}
class Student extends Person{
	void learn() {
		System.out.println("배우기");
	}
}
class Teacher extends Person{
	void teach() {
		System.out.println("가르치기");
	}
}