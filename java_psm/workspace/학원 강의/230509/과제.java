package parkseongmin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[][] = new int[101][101]; // �迭 ����
		int cnt = 0; // ���� �� ���� ����
		int n = sc.nextInt(); // �簢�� ���� �Է�
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt(); // �簢���� x��ǥ �Է�
			int y = sc.nextInt(); // �簢���� y��ǥ �Է�
			for (int j = x - 1; j < x + 9; j++) { // �����簢������ �ݺ�
				for (int k = y - 1; k < y + 9; k++) {
					arr[j][k] = 1; // �����簢�� ���� 1�� ����
				}
			}
		}
		for (int i = 0; i < 100; i++) {
			for (int j = 0; j < 100; j++) {
				cnt = arr[i][j] == 1 ? ++cnt : cnt; // ���� 1�̸� ���� 1����
			}
		}
		System.out.println(cnt); // ���� ���
	}

}