package day_0518;

public class Test04 {

	public static void main(String[] args) {
		System.out.println(sum(3,2));
		System.out.println(sum(2,3,4));
		System.out.println(sum(2.5,3.5,4.5));
		
	}
	static int sum(int a,int b) {
		System.out.println("���ڰ� ���� ��� ȣ���");
		return a+b;
	}
	static int sum(int a,int b,int c) {
		System.out.println("���ڰ� ���� ��� ȣ���");
		return a+b+c;
	}
	static double sum(double a,double b,double c) {
		System.out.println("double Ÿ���� ��� ȣ���");
		return a+b+c;
	}

}
