package day22;

import java.util.Scanner;

public class AnimalArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		Animals ar[] = new Animals[3];
		for (int i = 0; i < 3; i++) {
			ar[i] = new Animals();
		}
		for (int i=0 ; i<3 ; i++) {
			ar[i].kind=sc.next();
			ar[i].name=sc.next();
			ar[i].age=sc.nextInt();
			
		}
//		ar[0].kind = "�����";
//		ar[1].kind = "������";
//		ar[2].kind = "�����";
//
//		ar[0].name = "����";
//		ar[1].name = "����";
//		ar[2].name = "����";
//
//		ar[0].age = 1;
//		ar[1].age = 3;
//		ar[2].age = 1;

		for (int i = 0; i < 3; i++) {
			ar[i].info();
		}

	}

}

class Animals {
	String kind;
	String name;
	int age;

	void info() {
		System.out.println("���� : " + kind);
		System.out.println("�̸� : " + name);
		System.out.println("���� : " + age);
	}
}