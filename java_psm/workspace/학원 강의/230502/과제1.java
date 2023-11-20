package codeUp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		//정수 개수 n 입력
		int arr[] = new int[n];	//정수를 담은 길이 n 배열 선언
		int cnt = 0;				//임시변수 선언
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();	//인덱스0~n까지 값 입력
		}
		int v = sc.nextInt();		//개수를 확인할 값 입력
		for (int i = 0; i < n; i++) {
			cnt = arr[i] == v ? ++cnt : cnt;	//인덱스0~n까지 반복하여 v와 값이 같으면 임시변수++
		}
		System.out.println(cnt);		//출력
	}
}
