package day11;

import java.util.Scanner;

public class BreakEx2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=0, sum=0;
		while(true) {
			System.out.println("���� ���ڸ� �Է����ּ��� : (���� 0)");
			i=sc.nextInt();
			if(i==0) {
				break;
			}
			sum+=i;
		}
		System.out.println("��������� �� : "+sum);
	}
}
