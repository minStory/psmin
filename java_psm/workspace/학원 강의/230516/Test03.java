package day_0516;

public class Test03 {

	public static void main(String[] args) {
		A a=new A();	//객체 변수 생성
		a.age=30;	//나이 값 대입
		a.name="박성민";	//이름 문자열 대입
		a.marryage=false;	//결혼 여부 대입
		a.sons=0;	//자녀 수 값 대입
		
		System.out.println("나이 : "+a.age);
		System.out.println("이름 : "+a.name);
		System.out.println("결혼 여부 : "+a.marryage);
		System.out.println("자녀 수 : "+a.sons);
	}

}
class A{
	int age;	//나이
	String name;	//이름
	boolean marryage;	//결혼 여부
	int sons;	//자녀 수
}