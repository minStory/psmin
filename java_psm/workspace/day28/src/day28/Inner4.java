
package day28;

public class Inner4 {

	public static void main(String[] args) {
		//OuterClass 객체 생성 후 멤버에 접근
		//인스턴스멤버 접근 : 인스턴스명.병수명;
		//static멤버 접근 : 클래스명.변수명;
		System.out.println("===outer 클래스 접근하기===");
		OuterClass oc=new OuterClass();
		System.out.println("OuterClass의 a의 값 : "+oc.a);
		System.out.println("OuterClass의 b의 값 : "+OuterClass.b);	//객체 생성하지 않아도 사용 가능
		
		//인스턴스 내부 클래스 접근
		//외부 클래스 객체 생성
		//		OuterClass oc2 =  new OuterClass();
		//외부 클래스 객체로 내부 클래스 객체 생성
		//		OuterClass.Inner i = oc2.new Inner();
		//내부 클래스 객체로 메서드 호출
		//		i.InnerMethod();
		System.out.println("===Inner 클래스 접근하기===");
		OuterClass oc2=new OuterClass();
		OuterClass.Inner i=oc2.new Inner();
		
		System.out.println("Inner의 c의 값 : "+i.c);
		i.innerMethod();
		
		//스태틱 내부 클래스 접근
		//스태틱 클래스 객체 생성
		//		OuterClass.StaticInner si= new OuterClass.StaticInner();
		//스태틱 클래스로 스태틱 메서드 호출
		//		si.staticMethod();
		System.out.println("===StaticInner 클래스 접근하기===");
		OuterClass.StaticInner si=new OuterClass.StaticInner();
		System.out.println("StaticInner의 d의 값 : "+si.d);
		
//		si.staticMethod();		-> static클래스는 객체를 사용하지 않고 클래스명을 사용해서 호출
		OuterClass.StaticInner.staticMethod();
	}
}
class OuterClass{
	int a=3;
	static int b=4;
	class Inner{
		int c=5;
		public void innerMethod() {
			System.out.println("<Inner Class>");
		}
	}
	static class StaticInner{
		int d=6;
		static int stat=10;
		public static void staticMethod() {
			System.out.println("<Static Inner>");
		}
	}
}
