package parkseongmin;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//n까지 더할 값 입력
		int sum = 0;	//더한 값을 저장할 변수 선언
		for (int i = 0; i < n; i++) {	//n만큼 반복
			sum += i + 1;	//i가 증가할 때마다 sum에 i값을 더하여 대입
		}
		System.out.println(sum);	//누적된 더한 값 출력
	}

}
