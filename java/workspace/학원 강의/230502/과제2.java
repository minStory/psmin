package codeUp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {			//줄바꿈 9번 진행 (9줄 다이아몬드)
			if (i <= 4) {								//i가 9의 절반 이하 일때
				for (int j = i; j <= 4; j++) {	//앞의 별 출력
					System.out.print("*");
				}
				for (int j = i; j > -i + 1; j--) {	//중간 공백 출력
					System.out.print(" ");
				}
				for (int j = i; j <= 4; j++) {	//뒤의 별 출력
					if (i != 0 || j != 4) {
						System.out.print("*");
					}
				}
			} else {								//i가 9의 절반 이상 일때
				for (int j = i; j >= 4; j--) {		//앞의 별 출력
					System.out.print("*");
				}
				for (int j = i; j < 15 - i; j++) {		//중간 공백 출력
					System.out.print(" ");
				}
				for (int j = i; j >= 4; j--) {			//뒤의 별 출력
					if (i != 8 || j != 4) {
						System.out.print("*");
					}
				}
			}
			System.out.println();				//줄바꿈
		}
	}
}
