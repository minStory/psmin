package parkseongmin;

import java.util.Scanner;

public class Main {
	public static  void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=6,b=6;
		System.out.println(f2(a,b,f(a,b))/6);
    }
	static int f(int a, int b) {
		if(a%b==0) {
			return b;
		}
		return f(b,a%b);
		
	}
	static int f2(int a,int b, int c) {
		a/=c;
		b/=c;
		return a*b*c;
	}
}
