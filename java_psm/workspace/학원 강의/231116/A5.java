package parkseongmin;

public class A5 {
	//문제1: 외부클래스와 멤버 접근 제한 : 정적/인스턴스 비교
	//인스턴스 필드와 메서드
	int field;
	void method1() {
		System.out.println(1);
	}
	
	//정적 필드와 메서드
	static int field2;
	static void method2() {
		System.out.println(2);
	}
	
	class B{	//인스턴스 멤버 클래스 -> 인스턴스/정적 필드와 메서드 모두 허용 (Read & Write)
		void method() {	//메서드 호출
			//A5의 인스턴스 필드와 메서드
			field =10;
			method1();
			//A5의 정적필드와 메서드
			field2=20;
			method2();
		}
	}
	
	static class C{	//정적 멤버 클래스
		void method() {	//메서드 호출
			//A5의 인스턴스 필드와 메서드 -> 허용 X
			//static 정적(method area)는 객체가 없어도 사용하기 때문에
			//생성 시점이 달라 에러가 발생한다.
//			field =10;
//			method1();
			//A5의 정적필드와 메서드
			field2=20;
			method2();
		}
	}
	
}
