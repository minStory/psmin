package day23;

public class Constructor3 {

	public static void main(String[] args) {
		Bclass b1=new Bclass("가길동");
		Bclass b2=new Bclass();	
		System.out.println(b1.name);
		System.out.println(b2);
	}

}
class Bclass{
	String name;
	//생성자 오버로딩 : 여러개 생성자 중복저의
	Bclass(){}
	Bclass(String name){	//매개변수 생성자
		System.out.println("Bclass의 매개변수 생성자( )");
		this.name=name;
	}
	
}