package day_0411;

import java.util.Scanner;	//스캐너 메서드 참조

public class Test05 {
	public static void main(String[] argd) {
		Scanner sc=new Scanner(System.in);	//스캐너 sc 생성
		int a=sc.nextInt();			//a 값 입력
		int b=sc.nextInt();			//b 값 입력
		System.out.println(a+b);		//a+b 출력
		System.out.println(a-b);		//a-b 출력
		System.out.println(a*b);		//a*b 출력
		System.out.println(a/b);		//a/b 출력
		System.out.println(a%b);		//a%b 출력
	}
}
