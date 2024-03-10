package parkseongmin;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();	//x,y 입력받기
		int y = sc.nextInt();

		if (x > 0) {
			if (y > 0) {
				System.out.println("1");	//x>0 , y>0 일때 1사분면
			} else {
				System.out.println("4");	//x>0 , y<0 일때 4사분면
			}
		} else {
			if (y > 0) {
				System.out.println("2");	//x<0 , y>0 일때 2사분면
			} else {
				System.out.println("3");	//x<0 , y<0 일때 3사분면
			}
		}

	}
}

//package parkseongmin;
//
//public class Test02 {
//
//	public static void main(String[] args) {
//		for(int i=0 ; i<5 ; i++) {	//5회 반복
//			for(int j=i ; j>=0 ; j--) {
//				System.out.print("*");	//별찍기
//			}
//			System.out.println();	//줄바꿈
//		}
//	}
//
//}
