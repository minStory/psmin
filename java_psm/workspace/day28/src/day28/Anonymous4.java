package day28;

public class Anonymous4 {

	public static void main(String[] args) {
//		Abstract ab=new Abstract();	추상메서드 객체 생성 불가
		Abstract ab=new Abstract() {		//익명클래스로 1회성 사용은 가능
			void f2() {
				System.out.println("Abstract extends f2()");
			}
		};
		ab.f2();
	}

}
abstract class Abstract{
	abstract void f2();
	
}