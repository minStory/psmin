//Ŭ������ ���� ���
//�ʵ� - �������, �Ӽ�, ����. ��ü�� �����Ͱ� ����Ǵ°�
//������ - new �����ڷ� ȣ��Ǵ� �޼���� ��ü ���� �� �ʵ��� �ʱ�ȭ ���
//�޼���(�Լ�) - ���. ��ü�� ���ۿ� �ش��ϸ� Ŭ������ �پ��� ������ ����

//�����ε�
//�޼������ ���� �Ű������� ������ Ÿ���� �ٸ� ���� �޼���
//1. �޼��� �̸��� ���ƾ� �Ѵ�.
//2. �Ű������� ���� �Ǵ� Ÿ���� �޶�� �Ѵ�.
//3. ��ȯŸ���� ���谡 ����.

package day_0519;

public class Test01 {
	public static void main(String[] args) {
		OverloadingTest ot=new OverloadingTest();
		
		ot.cat();
		ot.cat(2,3);
		ot.cat("�ȳ�");
		
	}
}
class OverloadingTest{
	static void cat() {
		System.out.println("�Ű����� ����");
	}
	static void cat(int a, int b) {
		System.out.println("�Ű����� : "+a+","+b);
	}
	static void cat(String c) {
		System.out.println("�Ű����� : "+c);
	}
	
}