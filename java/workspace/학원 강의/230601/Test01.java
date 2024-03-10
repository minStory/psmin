//인터페이스 : 객체의 사용방법을 가이드라인 하는 것
//동일한 목적 하에 동일한 기능을 수행하게끔 강제하는 것이 바로 인터페이스. 개념이자 역할
//다형성을 극대화하여 코드 수정 줄이고 프로그램 유지보수 높이기 위해서 사용
 
//특징
//다중 상속 가능
//추상메서드, 상수만 사용
//생성자 사용 X
//메서드 오버라이딩 필수!!!

//class2 extends class1
//interface extends interface
//class implements interface

//참조변수의 다형성
//부모 pp = new 부모 O
//자식 cc = new 자식 O
//부모 pc = new 자식 O -> 형변환
//자식 cp = new 부모 X

//Fightable f = (Fightable) new Fighter();
//Fightable f = new Fighter();

//Fighter f = new Fighter();
//return f;

//return new Fighter();
//위의 2개 동일

//리턴타입이 인터페이스라는 것은 메서드가 해당 인터페이스를 구현한 클래스의 인스턴스를 반환한다는 것을 의미

package day_0601;

public class Test01 {
	public static void main(String[] args) {
		
	}
}
interface PlayingCard{
	public static final int SPADE=4;	//상수는 일반적으로 전체 대문자 사용
	final int DIAMOND=3;
	static int HEART=2;
	int CLOVER=1;			//public static final 생략 가능
}
interface Movable{
	//지정된 위치(x,y)로 이동하는 기능의 메서드
	void move(int x,int y);
}
interface Attackable{
	//지정된 대상(u)을 공격하는 기능의 메서드
//	void attack(Unit u);
}
interface Fightable extends Movable,Attackable{}	//다중상속 가능
