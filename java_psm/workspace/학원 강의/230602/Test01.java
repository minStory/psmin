//�������� ���¸� ���� �� �ִ� ����
//����Ÿ�� ���������� �ڼ�Ÿ�� ��ü�� �ٷ�� ��

//�������̽� : �߻�޼����� ����!!!!

//��ü ���� �κ� ���� ����
//������ ���� ���� ���� ���赵 (��� ����� public)

//��ü ���� �κ� ���� ����
//�߻�޼��� -> ����θ� �ְ� �����ΰ� ���� �޼���
//�߻�Ŭ���� -> �߻�޼��带 ���� Ŭ����
//�������̽� ���� -> �߻�޼��� ����(���븸���)

//�������̽� ���
//�������̽��� ������ �������̽��� ����(Object�� ������ �ƴ�)
//���� ��� ����(�߻�޼���� ����θ� �ֱ� ������ ������� �浹�� ����.)

package day_0602;

public class Test01 {

	public static void main(String[] args) {
		AA a = new BB() {
			public void f(){
				System.out.println("������");
			}
			public void f1() {
				System.out.println("������2");
			}
		};
		a.f();
//		a.f1();

	}
}
class AA{
	public void g() {
		System.out.println("ddd");
	}
	public void f() {
		System.out.println("methodAA()");
	}
}
class BB extends AA{}
//class BB extends AA{
//	public void f1() {
//		System.out.println("methodBB()");
//	}
//}