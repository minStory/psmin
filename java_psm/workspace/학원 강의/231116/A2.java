package parkseongmin;

//정적 멤버 클래스 : 내부 클래스 static
public class A2 {
	
	//정적 멤버 클래스 : 내부 클래스
	static class B2{	//외부 클래스를 사용하지 않아도 사용 가능하다.
		
	}
	//인스턴스 필드값으로 B객체 대입할 수 있다.
	B2 field=new B2();	//인스턴스멤버를 이용한 객체 생성
	
	//정적 필드값으로 B 객체 대입할 수 있다.
	static B2 field2=new B2();
	
	//생성자
	A2(){
		B2 b=new B2();
	}
	
	static void method2() {
		
	}

}
