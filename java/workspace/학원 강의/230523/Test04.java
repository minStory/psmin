//composite ����
//�� ��
//��� : ~�� ~�̴�
//���� : ~�� ~�� ������ �ִ�

//�������̵�
//1.����ΰ� ����Ŭ������ �޼���� ��ġ�ؾ��Ѵ�.
//2.���� �����ڸ� ����Ŭ������ �޼��庸�� ���� ������ ������ �� ����.
//3.���ܴ� ����Ŭ������ �޼��庸�� ���� ������ �� ����.

//�����ε� : ������ ���� �޼��带 �����ϴ� ��
//�������̵� : ��ӹ��� �޼����� ������ �����ϴ� ��


package day_0523;

public class Test04 {

	public static void main(String[] args) {
		Leader leader1=new Leader();
		leader1.eat();	//��ӹ��� �޼��� ���
		leader1.say();	//�������̵��� �޼��� ���
	}

}
class Student{
	void learn() {
		System.out.println("����");
	}
	void eat() {
		System.out.println("��Ա�");
	}
	void say() {
		System.out.println("������ �ȳ��ϼ���!");	//�Ϲ� �л�
	}
}
class Leader extends Student{
	void lead() {
		
	}
	void say() {
		
		System.out.println("�����Բ� �λ�");	//�������̵�
	}
}