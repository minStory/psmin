package day_0518;

public class Test03 {

	public static void main(String[] args) {
		 Data3 d=new Data3();		//Data3Ŭ������ ��ü d ����
		 d.x=10;		//Data3Ŭ������ �ν��Ͻ����� x�� �ּ� �����Ͽ� �� 10 ����
		 
		 Data3 d2=copy(d);		//copy�Լ��� ���Ͽ� d2�� d����
		 System.out.println("d.x = "+d.x);	//���� d.x 10 ���
		 System.out.println("d2.x = "+d2.x);		//�߰� ���� �� ������ ������ d2.x �� 10 ���
		 
	}
	static Data3 copy(Data3 d) {
		Data3 tmp=new Data3();	//Data3 Ŭ������ ��ü tmp �߰� ����
		tmp.x=d.x;	//��ü tmp�� �ν��Ͻ����� x�� ��ü d�� �ν��Ͻ����� x�� �ּ� �����Ͽ� ����
		return tmp;		//��ü tmp ��ȯ
	}

}
class Data3{ int x; }	//Data3Ŭ������ �ν��Ͻ����� x ����
