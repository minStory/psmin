//���
//���뼺�� ���̰� �ڵ��� �ߺ��� �����Ͽ� ���α׷� ���꼺�� ���������� �⿩�Ѵ�.
//�ڼ�Ŭ������ ����Ŭ������ ��� ��������� ��ӹ޴´�.
//(��, �ʱ�ȭ���̳� �����ڴ� ��ӵ��� �ʴ´�.
//�ڼ�Ŭ������ ��������� ����Ŭ������ ����������� ���ų� ����.

package day_0519;

public class Test07 {

	public static void main(String[] args) {
		Student s1=new Student();
		s1.breath();
		s1.learn();
		Teacher t1=new Teacher();
		t1.eat();
		t1.teach();
	}
}

class Person {
	void breath() {
		System.out.println("������");
	}
	void eat() {
		System.out.println("��Ա�");
	}
	void say() {
		System.out.println("���ϱ�");
	}
}
class Student extends Person{
	void learn() {
		System.out.println("����");
	}
}
class Teacher extends Person{
	void teach() {
		System.out.println("����ġ��");
	}
}