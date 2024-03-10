package parkseongmin;

public class A4 {
	//지역클래스 : 생성자 또는 메서드 안에서 내부 클래스 생성
	A4(){
		class B{
			B(){
				System.out.println("생성자-생성자 실행");
			}
			void method1() {
				System.out.println("생성자-method1() 실행");
			}
		}
		B b=new B();
		b.method1();
	}
	void useB(int arg) { //메서드 내부 클래스 작성해서 호출하는 방법
		int val=2;
		
		class B{	//내부클래스
			B(){	//생성자 생성 가능
				System.out.println("useB()-생성자 실행");
			}
			void method1() {
				System.out.println("useB()-method1() 실행");
				System.out.println(val);
				System.out.println(arg);
				
				//val=3;
				//arg=3;
			}
		}
		//외부클래스 메서드 안에서 B라는 내부클래스를 생성하고 호출한다.
		B b=new B();
		b.method1();
	}
	
	{
		System.out.println("블럭(최우선 출력)");
	}
}
