package day_0516;

public class Test03 {

	public static void main(String[] args) {
		A a=new A();	//��ü ���� ����
		a.age=30;	//���� �� ����
		a.name="�ڼ���";	//�̸� ���ڿ� ����
		a.marryage=false;	//��ȥ ���� ����
		a.sons=0;	//�ڳ� �� �� ����
		
		System.out.println("���� : "+a.age);
		System.out.println("�̸� : "+a.name);
		System.out.println("��ȥ ���� : "+a.marryage);
		System.out.println("�ڳ� �� : "+a.sons);
	}

}
class A{
	int age;	//����
	String name;	//�̸�
	boolean marryage;	//��ȥ ����
	int sons;	//�ڳ� ��
}