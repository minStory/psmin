package parkseongmin;

//외부클래스 static 메서드 안에서 내부클래스 객체 생성
public class A3 {
	//정적 멤버 클래스
	private int val;
	private static int cnt=1;
	
	
	static class B3{
//		int val2=val;
		int cnt2=cnt;
		
		void methodB() {
			System.out.println("methodB() 실행");
		}
	}
	B3 field=new B3();
	static B3 field2 =new B3();
	
	A3(){
		B3 field =new B3();
	}
	
	void method1() {
		B3 field=new B3();
	}
	static void method2() {
		B3 field=new B3();
	}
	

}
