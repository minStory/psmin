package day22;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User ar[] = new User[4];	//4ĭ¥�� �迭 ����

		for (int i = 0; i < 4; i++) {
			ar[i] = new User();	//�� ĭ�� ��ü���� ����
			System.out.print(i + 1 + "��° User �̸� : ");
			ar[i].name = sc.next();
			System.out.print(i + 1 + "��° User ��ȭ��ȣ : ");
			ar[i].phone = sc.next();
			System.out.print(i + 1 + "��° User ���� : ");
			ar[i].age = sc.nextInt();
			System.out.print(i + 1 + "��° User ���� : ");
			ar[i].gender = sc.next();
		}
		for (int i = 0; i < 4; i++) {
			ar[i].info();
		}
	}

}

class User {
	String name;
	String phone;
	int age;
	String gender;

	void info() {
		System.out.println("----------ȸ������----------");
		System.out.println("�̸� : " + name);
		System.out.println("��ȭ��ȣ : " + phone);
		System.out.println("���� : " + age);
		System.out.println("���� : " + gender);
	}
}