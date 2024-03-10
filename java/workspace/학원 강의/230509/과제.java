package parkseongmin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[101][101]; // 배열 선언
		int cnt = 0; // 넓이 셀 변수 선언
		int n = sc.nextInt(); // 사각형 개수 입력
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt(); // 사각형의 x좌표 입력
			int y = sc.nextInt(); // 사각형의 y좌표 입력
			for (int j = x - 1; j < x + 9; j++) { // 작은사각형에서 반복
				for (int k = y - 1; k < y + 9; k++) {
					arr[j][k] = 1; // 작은사각형 값을 1로 대입
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				cnt = arr[i][j] == 1 ? ++cnt : cnt; // 값이 1이면 넓이 1증가
			}
		}
		System.out.println(cnt); // 넓이 출력
	}

}