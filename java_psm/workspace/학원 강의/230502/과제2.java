package codeUp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 9; i++) {			//�ٹٲ� 9�� ���� (9�� ���̾Ƹ��)
			if (i <= 4) {								//i�� 9�� ���� ���� �϶�
				for (int j = i; j <= 4; j++) {	//���� �� ���
					System.out.print("*");
				}
				for (int j = i; j > -i + 1; j--) {	//�߰� ���� ���
					System.out.print(" ");
				}
				for (int j = i; j <= 4; j++) {	//���� �� ���
					if (i != 0 || j != 4) {
						System.out.print("*");
					}
				}
			} else {								//i�� 9�� ���� �̻� �϶�
				for (int j = i; j >= 4; j--) {		//���� �� ���
					System.out.print("*");
				}
				for (int j = i; j < 15 - i; j++) {		//�߰� ���� ���
					System.out.print(" ");
				}
				for (int j = i; j >= 4; j--) {			//���� �� ���
					if (i != 8 || j != 4) {
						System.out.print("*");
					}
				}
			}
			System.out.println();				//�ٹٲ�
		}
	}
}
