package day10;

import java.util.*;	//util ��Ű���� �ִ� ��� Ŭ���� �ҷ�����

public class Updown_Game {

	public static void main(String[] args) {
		Random random=new Random();
		Scanner sc=new Scanner(System.in);
		int choice=0;
		int cpt=random.nextInt(100)+1;;
		while(choice!=cpt) {
			System.out.println("���� �Է� : ");
			choice=sc.nextInt();
			if(cpt>choice) {
				System.out.println("Up");
			}
			else if (cpt<choice){
				System.out.println("Down");
			}
			else {
				System.out.println("����!");	
			}
		}
	}
}
