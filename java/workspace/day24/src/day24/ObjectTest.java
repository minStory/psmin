package day24;

public class ObjectTest {

	public static void main(String[] args) {
		Aclass a1=new Aclass();
		Aclass a2=new Aclass();
		
		//toString() : ��ü������ ���ڿ� ���
		System.out.println(a1.toString());
		System.out.println(a1);
		//equals() : �� ��ü�� �����Ѱ��� ��
		System.out.println(a1.equals(a1));	//true
		System.out.println(a1.equals(a2));	//false
		//getClass() : ��ü�� Ŭ���� ������ ������
		System.out.println(a1.getClass());
		System.out.println(a2.getClass());
		
	}

}
class Aclass{
	//����� ��� ����
}