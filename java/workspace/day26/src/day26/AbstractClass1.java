package day26;

public class AbstractClass1 {

	public static void main(String[] args) {
		Pokemon pokemon=new Pikachu();
		System.out.println("�� ���ϸ��� : "+pokemon.getName());
		pokemon.attack();
		pokemon.sound();
		
		pokemon=new Squirtle();
		System.out.println("�� ���ϸ��� : "+pokemon.getName());
		pokemon.attack();
		pokemon.sound();
	}
}
abstract class Pokemon{
	String name;
	abstract void attack();
	abstract void sound();
	
	public String getName() {
		return this.name;
	}
}
class Pikachu extends Pokemon{
	Pikachu(){
		this.name="��ī��";
	}
	void attack() {
		System.out.println("���� ����");
	}
	void sound() {
		System.out.println("��ī ��ī!");
	}
}
class Squirtle extends Pokemon{
	Squirtle(){
		this.name="���α�";
	}
	void attack() {
		System.out.println("�� ����");
	}
	void sound() {
		System.out.println("���� ����!");
	}
}
