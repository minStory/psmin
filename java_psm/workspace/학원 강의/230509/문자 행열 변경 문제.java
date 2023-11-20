package parkseongmin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char cArr[][] = new char[5][15]; // 문자 배열 선언
		String sArr[] = new String[5]; // 문자열 배열 선언
		int max = 0; // 길이 최대값 변수 선언
		for (int i = 0; i < 5; i++) { // 반복
			sArr[i] = sc.nextLine(); // 문자열에 한줄 씩 입력
			max = sArr[i].length() > max ? sArr[i].length() : max; // 가장 긴 길이 값 대입
			for (int j = 0; j < sArr[i].length(); j++) {
				cArr[i][j] = sArr[i].charAt(j); // 문자열의 한 문자씩 문자배열에 대입
			}
		}
		for (int i = 0; i < max; i++) { // 행 방향 반복
			for (int j = 0; j < 5; j++) {
				if (cArr[j][i] == '\0') { // 값이 NULL일 때 출력 생략
					continue;
				}
				System.out.print(cArr[j][i]);
			}
		}
	}

}