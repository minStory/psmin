//A,B 입력
//A+B
//
//tc의 개수를 받아서 그만큼 반복
//
//3
//1 1
//2
//2 3
//5
//3 4
//7

package parkseongmin;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();		//테스트케이스 개수 입력
		for (int i = 0; i < tc; i++) {	//테스트케이스만큼 반복
			int A = sc.nextInt();	//A 입력
			int B = sc.nextInt();	//B 입력
			System.out.println(A + B);	//A+B 출력
		}
	}
}
