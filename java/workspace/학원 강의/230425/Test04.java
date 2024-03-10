package parkseongmin;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			for(int j=i+1 ; j<n ; j++) {
				System.out.print(" ");
			}
			for(int k=i ; k>=0 ; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
