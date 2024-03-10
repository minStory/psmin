//제어자
//클래스 변수 메서드 선언부 제어자의 종류 접근제어자 그 외 제어자
//접근제어자(public, protected, default, private)
//그 외(static, final, abstract)
//default는 제어자를 붙이지 않으면 자동으로 사용된다

//static - 클래스의, 공통적인
//			멤버변수, 메서드, 초기화블럭에 사용
//static 사용 시
//멤버변수 -> 모든 인스턴스에 공통적으로 사용되는 클래스 변수가 된다
//클래스변수 : 인스턴스를 생성하지 않고 사용 가능
//			클래스가 메모리에 로드될 때 생성
//메서드 -> 인스턴스를 생성하지 않고 호출이 가능한 static메서드가 된다
//static메서드 내에서는 인스턴스멤버를 직접 사용할 수 없다

//final - 마지막의, 변경될 수 없는
//			클래스, 메서드, 멤버변수, 지역변수에 사용
//final 사용 시
//클래스 -> 변경이 될 수 없는 클래스, 확장 불가, 다른클래스의 조상이 될 수 없다
//메서드 -> 변경이 될 수 없늩 메서드, 오버라이딩 불가
//멤버변수 지역변수 상수

//abstract - 추상의, 미완성
//abstract 사용 시
//클래스 -> 클래스 내에 추상 메서드가 선언되어 있음을 의미한다
//메서드 -> 선언부만 작성하고 구현부는 작성하지 않는 추상 메서드임을 알린다

package day_0525;

public class Test06 {

	public static void main(String[] args) {
		User user1=new User("철수",20);
		User user2=new User("영희",19);
//		System.out.println(user2.name+"의 나이는"+user2.age);
//		user2.age=99; 에러발생, 직접적 접근 불가
//		System.out.println(user2.name+"의 나이는"+user2.age);
		
		user2.setAge(99);
		System.out.println(user2.getName()+"의 나이는"+user2.getAge());
	}

}

class User{
	private String name;
	private int age;
	User(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String  getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public final int getAge() {
		return age;
	}
	
}
