package day_0518;

public class Test02 {

	public static void main(String[] args) {
		Data d=new Data();	//Data클래스 객체 d 생성
		d.x=10;	//Data클래스의 인스턴스변수 x에 주소 접근하여 값 변경
		System.out.println("main : x = "+d.x);	//값 10 출력
		change(d);	//값 1000 출력
//		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = "+d.x);	//change함수에서 주소 접근하여 변경하였으므로 값 1000 출력
	}
//	static void change(int x) {		//기본형 매개변수
//		x=1000;
//		System.out.println("change() : x = "+x);
//	}
	
	static void change(Data d) {	//참조형 매개변수 
		d.x=1000;	//Data클래스의 인스턴스변수 x에 주소 접근하여 값 변경
		System.out.println("change() : x = "+d.x);
	}
	//참조형 매개변수
	//1.change메서드가 호출되면서 참조변수 d의 값(주소)이 매개변수 d에 복사, 이제 매개변수 d에 저장된 주소값으로 x에 접근이 가능
	//2.change메서드에서 매개변수 d로 x의 값을 1000으로 변경
	//3.change메서드가 종료되면서 매개변수 d는 스택에서 제거됨

}
class Data{ int x; }	//Data클래스의 인스턴스변수 x 생성