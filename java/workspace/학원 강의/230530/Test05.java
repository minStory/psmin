//추상메서드 선언부
//미완성
//어떤 기능을 수행할 목적으로 작성했는지 설명
//abstract class Player{
//		abstract void play(int pos);	//추상메서드
//		abstract void stop();	//추상메서드
//}
//추상 : 낱낱의 구체적 표상이나 개념에서 공통된 성질을 

package day_0530;

public class Test05 {

	public static void main(String[] args) {
		//업캐스팅 시 자손클래스 기능 사용 불가
		Unit m=new Marine();
		Unit t=new Tank();
		Unit d=new Dropship();
		m.move(2,4);
		m.stop();
		t.move(3,5);
		t.stop();
		d.move(10,20);
		d.stop();
		
		Marine m1=new Marine();
		m1.stimPack();
		System.out.println(m1.x+" "+m1.y);
		Tank t1=new Tank();
		t1.changeMode();
		Dropship d1=new Dropship();
		d1.load();
		d1.unload();
		
		ComandCenter c=new ComandCenter();
		c.callName(m);
		c.callName(t);
		c.callName(d);
		
		Unit m2=new Marine(100,200);
		System.out.println(m2.x+" "+m2.y);
		
	}

}
abstract class Unit{
	int x=5;
	int y=10;
	abstract void move(int x,int y);
	abstract void stop();
}
class Marine extends Unit{
	public String toString() {
		return "마린";
	}
	void stimPack() {
		System.out.println("마린 미쳐보자");
	}
	@Override
	void move(int x, int y) {
		System.out.println("마린 x로 "+x+"만큼 y로 "+y+ "만큼 가즈아");
	}
	@Override
	void stop() {
		System.out.println("마린 멈춰");
	}
	Marine(){
		
	}
	Marine(int x,int y){
		this.x=x;
		this.y=y;
	}
}
class Tank extends Unit{
	public String toString() {
		return "시저탱크";
	}
	void changeMode() {
		System.out.println("시저모드 ㄱㄱ");
	}
	@Override
	void move(int x, int y) {
		System.out.println("시저탱크 x로 "+x+"만큼 y로 "+y+ "만큼 가즈아");
	}
	@Override
	void stop() {
		System.out.println("시저탱크 멈춰");
	}
}
class Dropship extends Unit{
	public String toString() {
		return "드랍쉽";
	}
	void load() {
		System.out.println("드랍쉽 태워");
	}
	void unload() {
		System.out.println("드랍쉽 내려");
	}
	@Override
	void move(int x, int y) {
		System.out.println("드랍쉽 x로 "+x+"만큼 y로 "+y+ "만큼 가즈아");
	}
	@Override
	void stop() {
		System.out.println("드랍쉽 멈춰");
	}
}
class ComandCenter{
	void callName(Unit u) {
		System.out.println("내 이름은 "+u+"이다!!");
	}
}