package day_0530;

public class Test06 {

	public static void main(String[] args) {
		Pokemon pika=new Pikachu();
		System.out.println("이 포켓몬은 : "+pika);
		pika.attack();
		pika.sound();
		Pokemon squir=new Squirtle();
		System.out.println("이 포켓몬은 : "+squir);
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
		return "피카츄";
	}
//	Pikachu(){
//		this.name="피카츄";
//	}

	@Override
	void attack() {
		System.out.println("전기 공격");
	}

	@Override
	void sound() {
		System.out.println("피카 피카!");
	}
}
class Squirtle extends Pokemon{
	public String toString() {
		return "꼬부기";
	}
//	Squirtle(){
//		this.name="꼬부기";
//	}

	@Override
	void attack() {
		System.out.println("물 공격");
	}

	@Override
	void sound() {
		System.out.println("꼬북 꼬북!");
	}
	
}