//������
//Ŭ���� ���� �޼��� ����� �������� ���� ���������� �� �� ������
//����������(public, protected, default, private)
//�� ��(static, final, abstract)
//default�� �����ڸ� ������ ������ �ڵ����� ���ȴ�

//static - Ŭ������, ��������
//			�������, �޼���, �ʱ�ȭ���� ���
//static ��� ��
//������� -> ��� �ν��Ͻ��� ���������� ���Ǵ� Ŭ���� ������ �ȴ�
//Ŭ�������� : �ν��Ͻ��� �������� �ʰ� ��� ����
//			Ŭ������ �޸𸮿� �ε�� �� ����
//�޼��� -> �ν��Ͻ��� �������� �ʰ� ȣ���� ������ static�޼��尡 �ȴ�
//static�޼��� �������� �ν��Ͻ������ ���� ����� �� ����

//final - ��������, ����� �� ����
//			Ŭ����, �޼���, �������, ���������� ���
//final ��� ��
//Ŭ���� -> ������ �� �� ���� Ŭ����, Ȯ�� �Ұ�, �ٸ�Ŭ������ ������ �� �� ����
//�޼��� -> ������ �� �� ���p �޼���, �������̵� �Ұ�
//������� �������� ���

//abstract - �߻���, �̿ϼ�
//abstract ��� ��
//Ŭ���� -> Ŭ���� ���� �߻� �޼��尡 ����Ǿ� ������ �ǹ��Ѵ�
//�޼��� -> ����θ� �ۼ��ϰ� �����δ� �ۼ����� �ʴ� �߻� �޼������� �˸���

package day_0525;

public class Test06 {

	public static void main(String[] args) {
		User user1=new User("ö��",20);
		User user2=new User("����",19);
//		System.out.println(user2.name+"�� ���̴�"+user2.age);
//		user2.age=99; �����߻�, ������ ���� �Ұ�
//		System.out.println(user2.name+"�� ���̴�"+user2.age);
		
		user2.setAge(99);
		System.out.println(user2.getName()+"�� ���̴�"+user2.getAge());
	}

}

class User{
	private String name;
	private int age;
	User(String name,int age){
		this.name=name;
		this.age=age;
	}
	public void setName(String name) {
		this.name=name;
	}
	public String  getName() {
		return name;
	}
	public void setAge(int age) {
		this.age=age;
	}
	public final int getAge() {
		return age;
	}
	
}
