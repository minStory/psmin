package day_0530;

public class Test06 {

	public static void main(String[] args) {
		Pokemon pika=new Pikachu();
		System.out.println("�� ���ϸ��� : "+pika);
		pika.attack();
		pika.sound();
		Pokemon squir=new Squirtle();
		System.out.println("�� ���ϸ��� : "+squir);
		squir.attack();
		squir.sound();
	}

}
abstract class Pokemon{
//	String name;
	
	abstract void attack();
	abstract void sound();
	
//	public String getName() {
//		return this.name;
//	}
}
class Pikachu extends Pokemon{
	public String toString() {
		return "��ī��";
	}
//	Pikachu(){
//		this.name="��ī��";
//	}

	@Override
	void attack() {
		System.out.println("���� ����");
	}

	@Override
	void sound() {
		System.out.println("��ī ��ī!");
	}
}
class Squirtle extends Pokemon{
	public String toString() {
		return "���α�";
	}
//	Squirtle(){
//		this.name="���α�";
//	}

	@Override
	void attack() {
		System.out.println("�� ����");
	}

	@Override
	void sound() {
		System.out.println("���� ����!");
	}
	
}