package day_0518;

public class Test02 {

	public static void main(String[] args) {
		Data d=new Data();	//DataŬ���� ��ü d ����
		d.x=10;	//DataŬ������ �ν��Ͻ����� x�� �ּ� �����Ͽ� �� ����
		System.out.println("main : x = "+d.x);	//�� 10 ���
		change(d);	//�� 1000 ���
//		change(d.x);
		System.out.println("After change(d.x)");
		System.out.println("main() : x = "+d.x);	//change�Լ����� �ּ� �����Ͽ� �����Ͽ����Ƿ� �� 1000 ���
	}
//	static void change(int x) {		//�⺻�� �Ű�����
//		x=1000;
//		System.out.println("change() : x = "+x);
//	}
	
	static void change(Data d) {	//������ �Ű����� 
		d.x=1000;	//DataŬ������ �ν��Ͻ����� x�� �ּ� �����Ͽ� �� ����
		System.out.println("change() : x = "+d.x);
	}
	//������ �Ű�����
	//1.change�޼��尡 ȣ��Ǹ鼭 �������� d�� ��(�ּ�)�� �Ű����� d�� ����, ���� �Ű����� d�� ����� �ּҰ����� x�� ������ ����
	//2.change�޼��忡�� �Ű����� d�� x�� ���� 1000���� ����
	//3.change�޼��尡 ����Ǹ鼭 �Ű����� d�� ���ÿ��� ���ŵ�

}
class Data{ int x; }	//DataŬ������ �ν��Ͻ����� x ����