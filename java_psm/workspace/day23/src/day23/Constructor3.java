package day23;

public class Constructor3 {

	public static void main(String[] args) {
		Bclass b1=new Bclass("���浿");
		Bclass b2=new Bclass();	
		System.out.println(b1.name);
		System.out.println(b2);
	}

}
class Bclass{
	String name;
	//������ �����ε� : ������ ������ �ߺ�����
	Bclass(){}
	Bclass(String name){	//�Ű����� ������
		System.out.println("Bclass�� �Ű����� ������( )");
		this.name=name;
	}
	
}