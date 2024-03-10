package day_0411;

import java.util.Scanner;	//스캐너 메서드 참조

public class Test04 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);	//스캐너 메서드 sc 생성
		int a=sc.nextInt();	//a 입력
		int b=sc.nextInt();	//b 입력
		System.out.println(a+b);	//입력 후 a+b 출력
	}
}
