package day18;

public class Calc {

	public static void main(String[] args) {
		System.out.println("--������ ��Ģ����--");
		System.out.println(add(1, 2));
		System.out.println(sub(3, 4));
		System.out.println(mul(5, 6));
		System.out.println(div(7,8));
		System.out.println("--�Ǽ��� ��Ģ����--");
		System.out.println(add(1.1, 2.2));
		System.out.println(sub(3.3, 4.4));
		System.out.println(mul(5.5, 6.6));
		System.out.println(div(7.7, 8.8));		
		System.out.println("--���ڿ��� ����--");	//����,����,������ �Ұ�
		System.out.println(add("hello","world"));

	}
	//������ ��Ģ����
	static int add(int x, int y) {return x + y;}
	static int sub(int x, int y) {return x - y;}
	static int mul(int x, int y) {return x * y;}
	static int div(int x, int y) {return x / y;}
	
	//�Ǽ��� ��Ģ����
	static double add(double x, double y) {return x + y;}
	static double sub(double x, double y) {return x - y;}
	static double mul(double x, double y) {return x * y;}
	static double div(double x, double y) {return x / y;}
	
	//���ڿ��� ��������
	static String add(String x,String y) {return x+y;}


}
