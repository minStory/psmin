//abstract -> 추상의, 미완성의
//클래스 : 클래스 내에 추상 메서드가 선언되어 있음을 의미
//메서드 : 선언부만 작성, 구현부는 작성 하지 않은 추상메서드를 의미

package day_0530;

public class Test01 {

	public static void main(String[] args) {
		Time t=new Time();
		t.setH(23);
		System.out.println(t.getH());
		t.setM(59);
		System.out.println(t.getM());
		t.setS(1);
		System.out.println(t.getS());
	}
}

//자손클래스에서 접근 불가 (get, set)
//get(겟터) -> 단순히 멤버변수 값을 반환
//set(셋터) -> 매개변수에 지정된 값을 검사하고 조건에 맞는 값일 때 멤버변수의 값을 변경
class Time{
	private int h;
	private int m;
	private int s;
	
	int getH() {
		return h;
	}
	void setH(int h) {
		if(h<0||h>23) {return;}
		else { this.h=h;}
	}
	int getM() {
		return m;
	}
	void setM(int m) {
		if(m<0||m>59) {return;}
		else {this.m=m;}
	}
	int getS() {
		return s;
	}
	void setS(int s) {
		if(s<0||s>59) {return;}
		else {this.s=s;}
	}
}