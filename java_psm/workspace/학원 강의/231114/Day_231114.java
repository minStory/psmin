package _pasted_code_1;

public class Main {

	public static void main(String[] args) {
//		연습1
//		Buyer buyer=new Buyer();
//		buyer.buy(new Video());
//		buyer.buy(new Audio());
//		Person p1=new Person(new RedSpeaker());
//		Person p2=new Person(new BlueSpeaker());

//		연습2
//		Speaker s1=new RedSpeaker();
//		Speaker s2=new BlueSpeaker();
//		Person p1=new Person(s1);
//		p1.turnOn(s1);
//		Person p2=new Person(s2);
//		p2.turnOn(s2);

		
//		인터페이스 다형성3
//		Fighter f=new Fighter();
//		f.move(100, 200);
//		f.attack(f);
//		
//		Unit2 f2=new Fighter();
//		f2.move(300,400);
//		f2.attack(f);
//		
//		Fightable f3=new Fighter();
//		f3.attack(new Fighter());
//		
//		System.out.println(f.getFightable());
//		Fightable nf=f.getFightable();
//		nf.attack(f);

//		인터페이스의 상속4
		TJ tj=new TJ();
		tj.connect();
		tj.sing();
		tj.music();
		
		BluetoothMic bm=tj;
		bm.connect();
		bm.sing();
		bm.music();
		
		Microphone bm2=tj;
		bm2.sing();
		
		Speaker bm3=tj;
		bm3.music();
		
	}
}

//인터페이스의 상속4
interface Microphone{
	abstract void sing();
}
interface Speaker{
	abstract void music();
}
interface BluetoothMic extends Microphone, Speaker{
	public void connect();
}
class TJ implements BluetoothMic{
	public void sing() {
		System.out.println("노래를 부르다.");
	}
	public void music() {
		System.out.println("음악이 틀다.");
	}
	public void connect() {
		System.out.println("블루투스로 연결하다.");
	}
}

//인터페이스 다형성3
//abstract class Unit2{
//	int x,y;
//	abstract void move(int x,int y);
//	void stop() {
//		System.out.println("멈춥니다.");
//	};
//}
//interface Fightable{
//	public void move(int x, int y);
//	public void attack(Fightable f);
//}
//class Fighter extends Unit2 implements Fightable{
//	public void move(int x, int y) {
//		System.out.println("["+x+","+y+"]으로 이동");
//	}
//	public void attack(Fightable f) {
//		System.out.println(f+"를 공격");
//	}
//	Fightable getFightable() {
//		Fighter f=new Fighter();
//		return f;
//	}
//}

// 연습2
//class Speaker{
//	String getName() {
//		return "스피커";
//	}
//}
//class RedSpeaker extends Speaker{
//	String getName() {
//		return "빨간"+super.getName();
//	}
//}
//class BlueSpeaker extends Speaker{
//	String getName() {
//		return "파란"+super.getName();
//	}
//}
//class Person{
//	String speaker;
//	Person(Speaker s){
//		this.speaker=s.getName();
//	}
//	void turnOn(Speaker s) {
//		System.out.println(speaker+"가 켜졌습니다.");
//	}
//}

// 연습1
//class Buyer{
//	void buy(Product p) {
//		System.out.println(p);
//	}
//}
//
//class Product{};
//class Video extends Product{
//	public String toString() {
//		return "Video";
//	}
//}
//class Audio extends Product{
//	public String toString() {
//		return "Audio";
//	}
//}
