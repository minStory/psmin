package parkseongmin;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	//단 입력
		int i=1;	//곱할 값 초기식
		while(i<=9) {	//곱할 값 조건식
			System.out.println(n+" * "+i+" = "+n*i);	//구구단 출력
			i++;	//곱할 값 증감식
		}
	}

}
