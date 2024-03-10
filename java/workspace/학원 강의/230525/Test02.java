package day_0525;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int y=sc.nextInt();
		
		System.out.println(f(x,y));
		int r=x*y/f(x,y);
		System.out.println(r);
		
	}
	static int f(int x,int y) {
		if(x%y==0) {
			return y;
		}
			return f(x,x%y);
	}

}
