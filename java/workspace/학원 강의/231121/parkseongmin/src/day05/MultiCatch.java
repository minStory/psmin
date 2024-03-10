package day05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultiCatch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//�ΰ��� ���� catch�� ����� ����.
		//������ �迭�� �����. cards = {4, 5, 1, 2, 7, 8} 
		//InputMismatchException : �Է��� �߸��� ���(Scanner����)�� ������ ���� ���� ó��
		try {
			int[] card= {4, 5, 1, 2, 7, 8};
			System.out.println("�� ��° ī�带 �����ðڽ��ϱ�?(1~6) >>> ");	
			int cardIndex=sc.nextInt();
			System.out.println("���� ī�� ��ȣ�� "+card[cardIndex-1]+" �Դϴ�.");
			
		}catch(InputMismatchException e) {
			System.out.println("���ڸ� �Է� �����մϴ�.");
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("1~6 ������ �Է� �����մϴ�.");
		}
		System.out.println("���α׷��� �����մϴ�.");
		sc.close();
	}

}
