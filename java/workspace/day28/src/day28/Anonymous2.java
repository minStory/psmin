package day28;

public class Anonymous2 {

	public static void main(String[] args) {
		OuterClass1 o=new OuterClass1() {
			void a() {
				System.out.println("새롭게 정의된 익명클래스 메서드입니다.");
			}
		};
		o.a();
		OuterClass1 ok=new OuterClass1();
		ok.a();	//익명클래스는 1회성 -> 실제 클래스의 메서드값이 바뀌는 것은 아님
		
	}
}
class OuterClass1{
	void a() {
		System.out.println("Method a()");
	}
	void b() {
		
	}

}