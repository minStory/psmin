package day28;

public class Anonymous4 {

	public static void main(String[] args) {
//		Abstract ab=new Abstract();	�߻�޼��� ��ü ���� �Ұ�
		Abstract ab=new Abstract() {		//�͸�Ŭ������ 1ȸ�� ����� ����
			void f2() {
				System.out.println("Abstract extends f2()");
			}
		};
		ab.f2();
	}

}
abstract class Abstract{
	abstract void f2();
	
}