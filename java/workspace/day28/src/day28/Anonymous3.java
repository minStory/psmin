package day28;

public class Anonymous3 {

	public static void main(String[] args) {
//		Inter1 it1=new Inter();	//�������̽��� ��ü ���� �Ұ�
		Inter1 it=new Inter1() {		//�͸�Ŭ������ 1ȸ�� ����� ����
			public void f1() {
				System.out.println("Inter1 imple f1()");
			}
		};
		it.f1();
	}

}
interface Inter1{
	void f1();
}
//�Ϲ�Ŭ����
class Inter1Impl implements Inter1{

	@Override
	public void f1() {
		
	}
	
}