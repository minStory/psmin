package parkseongmin;

public class A1 {	//인스턴스 멤버 클래스 : 외부클래스
	int field;
	B field2;
	
	class B{	//내부클래스
		B(){	//내부클래스 생성자
			
		}
		void method() {
			System.out.println("methodB() 실행");
		}
	}
	A1(){
		B b=new B();
		b.method();
	}
	
	public void methodA() {
		B b=new B();
		b.method();
	}
}
