package day_0413;

public class Test03 {

	public static void main(String[] args) {
		int a = 5, b = 10;
		System.out.printf("%d %d\n", a, b);
		int temp = a;
		a = b;
		b = temp;
		System.out.printf("%d %d\n", a, b);
	}
		
}
