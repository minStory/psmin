package day11;

import java.util.Scanner;

public class ContinueEx1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int num;
		while(true) {
			System.out.print("숫자 입력 : ");
			num=sc.nextInt();
			if(num==0) {
				System.out.println("종료!");
				break;
			}
			else if(num<0) {
				System.out.println("아래 명령 무시하고 다음 반복 진행!");
				continue;
			}
			System.out.println("num : "+num);
		}
	}
}
