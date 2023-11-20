package day_0601;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		int a=sc.nextInt();
		System.out.println(str.charAt(a-1));
		System.out.println(str.length());
		System.out.println(str.indexOf("a")+1);
		
		String str1[]=sc.next().split("");
		int b=sc.nextInt();
		System.out.println(str1[b-1]);
		System.out.println(str1.length);
		
		
	}

}
