package parkseongmin;

public class Test03 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			System.out.printf("i = %d, sum = %d\n", i, sum += i);
		}
	}

}
