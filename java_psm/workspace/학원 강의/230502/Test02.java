package parkseongmin;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++) {
			if (i == n / 2) {
				continue;
			}
			if (i <= n / 2) {
				for (int j = i; j > 0; j--) {
					System.out.print(" ");
				}
				for (int j = i; j < n - i; j++) {
					System.out.print("*");
				}
			} else {
				for (int j = i; j < n; j++) {
					System.out.print(" ");
				}
				for (int j = i; j > n - i; j--) {
					System.out.print("*");
				}
			}
			System.out.println();
		}

	}
}
