package day08;

import java.util.Scanner;

public class SwitchEx {

	public static void main(String[] args) {
		//�ϳ⵿�� ���� å ���� ���� ��Ʈ�� ���
		Scanner sc=new Scanner(System.in);
		int book=sc.nextInt();
		book=book/10;
		switch(book) {
		case 0:	//book<10
			System.out.println("���� �� ����ϼ���.");
			break;
		case 1:	//10<=book<20
			System.out.println("å �д� ���� ���ô� ���̽ó׿�!");
			break;
		case 2:	//20<=book<30
			System.out.println("å�� ����ϴ� ���̽ó׿�!");
			break;
		default:
			System.out.println("����� �ٵ����Դϴ�.");
			break;				
		}
	}

}
