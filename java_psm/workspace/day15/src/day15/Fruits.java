package day15;
import java.util.Scanner;
public class Fruits {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String fruits[]=new String[3];
		
		for(int i=0 ; i<3 ; i++) {
			System.out.print(i+1+"��° ���� �̸� �Է� : ");
			fruits[i]=sc.next();
		}
		System.out.println("----�ֹ� ���� ����----");
		for(String i:fruits) {
			System.out.print(i+" ");
		}
		
	}

}
