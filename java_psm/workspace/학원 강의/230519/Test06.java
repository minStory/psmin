//������ �ʱ�ȭ -> ������ �����ϰ� ó������  ���� �����ϴ� ��
//��������� �ʱ�ȭ ���� �ʾƵ� �ڵ����� ���� �ڷ����� �⺻������ �ʱ�ȭ
//���������� �ݵ�� ������� �ʱ�ȭ�� ����� �Ѵ�.

//��������� �ʱ�ȭ
//�ʱ�ȭ ����
//����� �ʱ�ȭ > �ʱ�ȭ �� > ������
//1. Ŭ��������(cv) �ʱ�ȭ > �ν��Ͻ�����(iv) �ʱ�ȭ
//2. �ڵ��ʱ�ȭ > ����� �ʱ�ȭ(����) > �ʱ�ȭ ��, ������(����)

package day_0519;

public class Test06 {
	static {
		System.out.println("static { }");	//1. Ŭ���� �ʱ�ȭ ��
	}
	
	{
		System.out.println(" { }");		//�ν��Ͻ� �ʱ�ȭ ��
	}
	
	public Test06() {
		System.out.println("������");		//������
	}
	
	public static void main(String[] args) {	//2. ���ι�
		System.out.println("Test06 bt = new Test06()");
		Test06 bt = new Test06();	//�ν��Ͻ� -> ������
		
		System.out.println("Test06 bt2 = new Test06()");
		Test06 bt2 = new Test06();	//�ν��Ͻ� -> ������
	}
}
