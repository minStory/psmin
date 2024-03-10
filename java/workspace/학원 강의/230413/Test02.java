package day_0413;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		String h=sc.next();
//		System.out.println(h);
//		String java="Hello";
//		String a="Hello";
//		if(java.equals(a)) {
//			System.out.println("1");
//		String[] strE = str.split(".") ;
		int ymd[]=new int[3];
		for(int i=0 ; i<3 ; i++) {
			ymd[i]=sc.nextInt();
		}
		System.out.printf("%d.%d.%d",ymd[0],ymd[1],ymd[2]);
	}
}

