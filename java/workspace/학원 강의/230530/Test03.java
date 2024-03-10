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
		System.out.println("������");
	}
}
class Lion extends Animal{
	public String toString() {
		return "����";
	}
}
class Rabbit extends Animal{
	public String toString() {
		return "�䳢";
	}
}
class Monkey extends Animal{
	public String toString() {
		return "������";
	}
}
class ZooKeeper{
	void feed(Animal a) {
		System.out.println(a+"���� �����ֱ�");
	}
//	void feed(Animal rabbit) {
//		System.out.println(rabbit+"���� �����ֱ�");
//	}
//	void feed(Animal monkey) {
//		System.out.println(monkey+"���� �����ֱ�");
//	}
}