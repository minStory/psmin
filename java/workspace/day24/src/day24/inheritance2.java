package day24;

public class inheritance2 {

	public static void main(String[] args) {
		Leader leader=new Leader();
		leader.say();

	}

}
class Student2{
	void learn() {
		System.out.println("배우기");
	}
	void eat() {
		System.out.println("밤먹기");
	}
	void say() {
		System.out.println("선생님 안녕하세요~");
	}
}

class Leader extends Student2{
	void lead() {}
	void say() {		//메서드 오버라이딩
		System.out.println("선생님께 인사!");
		super.say();		//오버라이딩 후 부모클래스 생성자 호출 가능
	}
}