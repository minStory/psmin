//A A B C D D
//a f z z 
//0 9 1 2 1
//a 8 E W g 6
//P 5 h 3 k x
//
//세로로 읽은 순서대로 글자들을 공백 없이 출력하면 다음과 같다:
//
//Aa0aPAf985Bz1EhCz2W3D1gkD6x
//
//총 다섯줄의 입력이 주어진다. 각 줄에는 최소 1개, 최대 15개의 글자들이 빈칸 없이 연속으로 주어진다.
//주어지는 글자는 영어 대문자 ‘A’부터 ‘Z’, 영어 소문자 ‘a’부터 ‘z’, 숫자 ‘0’부터 ‘9’ 중 하나이다. 각 줄의 시작과 마지막에 빈칸은 없다.
package parkseongmin;

import java.util.Scanner;

public class Test02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		char arr[][]=new char[5][6];
		for(int i=0 ; i<5 ; i++) {
			for(int j=0 ; j<arr[i].length ; j++) {
				arr[i][j]=sc.next().charAt(0);
				if(arr[i][j]==' ') {
					break;
				}
			}
		}
		for(int i=0 ; i<arr.length ; i++) {
			for(int j=0 ; j<5 ; j++) {
				System.out.print(arr[j][i]);
			}
		}
	
	}

}
//
//import java.util.Scanner;
//
//public class Main { 
//	public static void main(String[] args) {
//		Scanner sc=new Scanner(System.in);
//		String str=sc.nextLine();
//		String arr[]=str.split("\\.");
//		int y=Integer.parseInt(arr[0]);
//		int m=Integer.parseInt(arr[1]);
//		int d=Integer.parseInt(arr[2]);
//		System.out.printf("%04d.%02d.%02d",y,m,d);
//	}
//	