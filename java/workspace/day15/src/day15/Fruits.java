package day15;
import java.util.Scanner;
public class Fruits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fruits[]=new String[3];
		
		for(int i=0 ; i<3 ; i++) {
			System.out.print(i+1+"번째 과일 이름 입력 : ");
			fruits[i]=sc.next();
		}
		System.out.println("----주문 받은 과일----");
		for(String i:fruits) {
			System.out.print(i+" ");
		}
		
	}

}
