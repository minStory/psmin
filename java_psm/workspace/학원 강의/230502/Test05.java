package parkseongmin;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[] = new int[5]; // 길이 5인 배열 생성
		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr.length*10+i*10;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " "); // 출력
		}

	}

}
 