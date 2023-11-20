package java230504;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // n입력
		int m = sc.nextInt(); // m입력
		int arr1[][] = new int[n][m]; // 2차원배열 2개 생성
		int arr2[][] = new int[n][m];

		for (int i = 0; i < n; i++) { // 첫번째 2차원배열 값 입력
			for (int j = 0; j < m; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) { // 두번째 2차원배열 값 입력
			for (int j = 0; j < m; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < n; i++) { // 두 2차원배열 각 자리의 합을 계산
			for (int j = 0; j < m; j++) {
				System.out.print(arr1[i][j] + arr2[i][j] + " ");
			}
			System.out.println();
		}

	}

}
