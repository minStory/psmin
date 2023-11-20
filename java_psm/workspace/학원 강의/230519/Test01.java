//클래스의 구성 멤버
//필드 - 멤버변수, 속성, 변수. 객체의 데이터가 저장되는곳
//생성자 - new 연산자로 호출되는 메서드로 객체 생성 시 필드의 초기화 담당
//메서드(함수) - 기능. 객체의 동작에 해당하며 클래스의 다양한 동작을 구성

//오버로딩
//메서드명이 같고 매개변수의 개수와 타입이 다른 여러 메서드
//1. 메서드 이름이 같아야 한다.
//2. 매개변수의 개수 또는 타입이 달라야 한다.
//3. 반환타입은 관계가 없다.

package day_0519;

public class Test01 {
	public static void main(String[] args) {
		OverloadingTest ot=new OverloadingTest();
		
		ot.cat();
		ot.cat(2,3);
		ot.cat("안녕");
		
	}
}
class OverloadingTest{
	static void cat() {
		System.out.println("매개변수 없음");
	}
	static void cat(int a, int b) {
		System.out.println("매개변수 : "+a+","+b);
	}
	static void cat(String c) {
		System.out.println("매개변수 : "+c);
	}
	
}