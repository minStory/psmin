//Ex1.class �ܺ�Ŭ����
//Ex1$1.class ����Ŭ����
//Ex1$2.class ����Ŭ����
//Ex1$3.class ����Ŭ����

package day_0602;

public class Test02 {

	public static void main(String[] args) {
		System.out.println(Outer.Inner.siv);	//���� Ŭ�������� ���
		Outer.Inner.f1();	//���� Ŭ�����޼��� ȣ��
		
		Outer o=new Outer();	//�ܺ� ��ü ����
		Outer.Inner oi=o.new Inner();	//�ܺθ� ���� ���� ��ü ����
		System.out.println("===��/�ܺ� ��ü ���� ��===");
		System.out.println(oi.iv);	//���� �ν��Ͻ����� ���
		oi.f();	//���� �ν��Ͻ��޼��� ȣ��
	}
}
class Outer{
	class Inner{
		int iv=100;
		static int siv=50;
		
		void f() {
			System.out.println("���� �ν��Ͻ� �޼���");
		}
		static void f1() {
			System.out.println("�ܺ� �ν��Ͻ� �޼���");
		}
	}
}