package day_0530;

public class Test03 {

	public static void main(String[] args) {
		Animal lion=new Lion();
		ZooKeeper james=new ZooKeeper();
		james.feed(lion);
		
		Animal rabbit=new Rabbit();
		james.feed(rabbit);
		Animal monkey=new Monkey();
		james.feed(monkey);
	}

}
class Animal{
	void breath() {
		System.out.println("숨쉬기");
	}
}
class Lion extends Animal{
	public String toString() {
		return "사자";
	}
}
class Rabbit extends Animal{
	public String toString() {
		return "토끼";
	}
}
class Monkey extends Animal{
	public String toString() {
		return "원숭이";
	}
}
class ZooKeeper{
	void feed(Animal a) {
		System.out.println(a+"에게 먹이주기");
	}
//	void feed(Animal rabbit) {
//		System.out.println(rabbit+"에게 먹이주기");
//	}
//	void feed(Animal monkey) {
//		System.out.println(monkey+"에게 먹이주기");
//	}
}