package day05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//두가지 다중 catch를 만들어 보자.
		//정수형 배열을 만든다. cards = {4, 5, 1, 2, 7, 8} 
		//InputMismatchException : 입력이 잘못된 경우(Scanner에러)에 에러가 나는 예외 처리
		try {
			int[] card= {4, 5, 1, 2, 7, 8};
			System.out.println("몇 번째 카드를 뽑으시겠습니까?(1~6) >>> ");	
			int cardIndex=sc.nextInt();
			System.out.println("뽑은 카드 번호는 "+card[cardIndex-1]+" 입니다.");
			
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력 가능합니다.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("1~6 까지만 입력 가능합니다.");
		}
		System.out.println("프로그램을 종료합니다.");
		sc.close();
	}

}
