package parkseongmin;

public class A5 {
	//����1: �ܺ�Ŭ������ ��� ���� ���� : ����/�ν��Ͻ� ��
	//�ν��Ͻ� �ʵ�� �޼���
	int field;
	void method1() {
		System.out.println(1);
	}
	
	//���� �ʵ�� �޼���
	static int field2;
	static void method2() {
		System.out.println(2);
	}
	
	class B{	//�ν��Ͻ� ��� Ŭ���� -> �ν��Ͻ�/���� �ʵ�� �޼��� ��� ��� (Read & Write)
		void method() {	//�޼��� ȣ��
			//A5�� �ν��Ͻ� �ʵ�� �޼���
			field =10;
			method1();
			//A5�� �����ʵ�� �޼���
			field2=20;
			method2();
		}
	}
	
	static class C{	//���� ��� Ŭ����
		void method() {	//�޼��� ȣ��
			//A5�� �ν��Ͻ� �ʵ�� �޼��� -> ��� X
			//static ����(method area)�� ��ü�� ��� ����ϱ� ������
			//���� ������ �޶� ������ �߻��Ѵ�.
//			field =10;
//			method1();
			//A5�� �����ʵ�� �޼���
			field2=20;
			method2();
		}
	}
	
}
