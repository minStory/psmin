//Ex1.class 외부클래스
//Ex1$1.class 내부클래스
//Ex1$2.class 내부클래스
//Ex1$3.class 내부클래스

package day_0602;

public class Test02 {

	public static void main(String[] args) {
		System.out.println(Outer.Inner.siv);	//내부 클래스변수 출력
		Outer.Inner.f1();	//내부 클래스메서드 호출
		
		Outer o=new Outer();	//외부 객체 생성
		Outer.Inner oi=o.new Inner();	//외부를 통해 내부 객체 생성
		System.out.println("===내/외부 객체 생성 후===");
		System.out.println(oi.iv);	//내부 인스턴스변수 출력
		oi.f();	//내부 인스턴스메서드 호출
	}
}
class Outer{
	class Inner{
		int iv=100;
		static int siv=50;
		
		void f() {
			System.out.println("내부 인스턴스 메서드");
		}
		static void f1() {
			System.out.println("외부 인스턴스 메서드");
		}
	}
}