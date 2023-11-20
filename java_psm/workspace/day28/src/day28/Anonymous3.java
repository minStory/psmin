package day28;

public class Anonymous3 {

	public static void main(String[] args) {
//		Inter1 it1=new Inter();	//인터페이스는 객체 생성 불가
		Inter1 it=new Inter1() {		//익명클래스로 1회성 사용은 가능
			public void f1() {
				System.out.println("Inter1 imple f1()");
			}
		};
		it.f1();
	}

}
interface Inter1{
	void f1();
}
//일반클래스
class Inter1Impl implements Inter1{

	@Override
	public void f1() {
		
	}
	
}