//여러가지 형태를 가질 수 있는 성질
//조상타입 참조변수로 자손타입 객체를 다루는 것

//인터페이스 : 추상메서드의 집합!!!!

//전체 생략 부분 생략 가능
//구현된 것이 전혀 없는 설계도 (모든 멤버가 public)

//전체 생략 부분 생략 가능
//추상메서드 -> 선언부만 있고 구현부가 없는 메서드
//추상클래스 -> 추상메서드를 가진 클래스
//인터페이스 구현 -> 추상메서드 구현(몸통만들기)

//인터페이스 상속
//인터페이스의 조상은 인터페이스만 가능(Object가 조상이 아님)
//다중 상속 가능(추상메서드는 선언부만 있기 때문에 멤버간의 충돌이 없다.)

package day_0602;

public class Test01 {

	public static void main(String[] args) {
		AA a = new BB() {
			public void f(){
				System.out.println("재정의");
			}
			public void f1() {
				System.out.println("재정의2");
			}
		};
		a.f();
//		a.f1();

	}
}
class AA{
	public void g() {
		System.out.println("ddd");
	}
	public void f() {
		System.out.println("methodAA()");
	}
}
class BB extends AA{}
//class BB extends AA{
//	public void f1() {
//		System.out.println("methodBB()");
//	}
//}