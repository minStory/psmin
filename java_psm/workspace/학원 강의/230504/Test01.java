package java230504;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int max = -9999, min = 9999;
		System.out.print("N을 입력하세요 >>> ");
		int n = sc.nextInt();
		int arr[] = new int[n];
		System.out.print("N개의 정수를 입력하세요 >>> ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
			max = arr[i] > max ? arr[i] : max;
			min = arr[i] < min ? arr[i] : min;
		}
		System.out.println("최대값 >>> " + max);
		System.out.println("최소값 >>> " + min);
	}
}
