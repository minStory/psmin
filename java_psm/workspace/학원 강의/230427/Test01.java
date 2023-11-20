package parkseongmin;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "Y";
		int cnt = 0;

		while (answer.equals("Y")) {	//사용자 응답 검사
			System.out.println("음악을 재생하시겠습니까?(Y)");
			answer = sc.nextLine();		//응답 입력

			if (answer.equals("Y")) {
				System.out.println("음악을 " + ++cnt + "번 재생했습니다.");	//cnt 증감 후 출력
			}
		}
		System.out.println("재생 종료");	//종료 문구 출력
	}
}
