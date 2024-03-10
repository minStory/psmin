package day18;

public class Calc {

	public static void main(String[] args) {
		System.out.println("--정수의 사칙연산--");
		System.out.println(add(1, 2));
		System.out.println(sub(3, 4));
		System.out.println(mul(5, 6));
		System.out.println(div(7,8));
		System.out.println("--실수의 사칙연산--");
		System.out.println(add(1.1, 2.2));
		System.out.println(sub(3.3, 4.4));
		System.out.println(mul(5.5, 6.6));
		System.out.println(div(7.7, 8.8));		
		System.out.println("--문자열의 덧셈--");	//뺄셈,곱셉,나눗셈 불가
		System.out.println(add("hello","world"));

	}
	//정수의 사칙연산
	static int add(int x, int y) {return x + y;}
	static int sub(int x, int y) {return x - y;}
	static int mul(int x, int y) {return x * y;}
	static int div(int x, int y) {return x / y;}
	
	//실수의 사칙연산
	static double add(double x, double y) {return x + y;}
	static double sub(double x, double y) {return x - y;}
	static double mul(double x, double y) {return x * y;}
	static double div(double x, double y) {return x / y;}
	
	//문자열의 덧셈연산
	static String add(String x,String y) {return x+y;}


}
