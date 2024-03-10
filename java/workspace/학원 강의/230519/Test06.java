//변수의 초기화 -> 변수를 선언하고 처음으로  값을 저장하는 것
//멤버변수는 초기화 하지 않아도 자동으로 변수 자료형의 기본값으로 초기화
//지역변수는 반드시 사용전에 초기화를 해줘야 한다.

//멤버변수의 초기화
//초기화 순서
//명시적 초기화 > 초기화 블럭 > 생성자
//1. 클래스변수(cv) 초기화 > 인스턴스변수(iv) 초기화
//2. 자동초기화 > 명시적 초기화(간단) > 초기화 블럭, 생성자(복잡)

package day_0519;

public class Test06 {
	static {
		System.out.println("static { }");	//1. 클래스 초기화 블럭
	}
	
	{
		System.out.println(" { }");		//인스턴스 초기화 블럭
	}
	
	public Test06() {
		System.out.println("생성자");		//생성자
	}
	
	public static void main(String[] args) {	//2. 메인문
		System.out.println("Test06 bt = new Test06()");
		Test06 bt = new Test06();	//인스턴스 -> 생성자
		
		System.out.println("Test06 bt2 = new Test06()");
		Test06 bt2 = new Test06();	//인스턴스 -> 생성자
	}
}
