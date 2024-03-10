package day_0518;

public class Test03 {

	public static void main(String[] args) {
		 Data3 d=new Data3();		//Data3클래스의 객체 d 생성
		 d.x=10;		//Data3클래스의 인스턴스변수 x에 주소 접근하여 값 10 변경
		 
		 Data3 d2=copy(d);		//copy함수를 통하여 d2에 d대입
		 System.out.println("d.x = "+d.x);	//기존 d.x 10 출력
		 System.out.println("d2.x = "+d2.x);		//추가 생성 후 참조형 복사한 d2.x 값 10 출력
		 
	}
	static Data3 copy(Data3 d) {
		Data3 tmp=new Data3();	//Data3 클래스의 객체 tmp 추가 생성
		tmp.x=d.x;	//객체 tmp의 인스턴스변수 x에 객체 d의 인스턴스변수 x를 주소 접근하여 대입
		return tmp;		//객체 tmp 반환
	}

}
class Data3{ int x; }	//Data3클래스에 인스턴스변수 x 생성
