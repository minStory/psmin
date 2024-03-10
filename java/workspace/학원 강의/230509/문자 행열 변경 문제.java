package parkseongmin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char cArr[][] = new char[5][15]; // ���� �迭 ����
		String sArr[] = new String[5]; // ���ڿ� �迭 ����
		int max = 0; // ���� �ִ밪 ���� ����
		for (int i = 0; i < 5; i++) { // �ݺ�
			sArr[i] = sc.nextLine(); // ���ڿ��� ���� �� �Է�
			max = sArr[i].length() > max ? sArr[i].length() : max; // ���� �� ���� �� ����
			for (int j = 0; j < sArr[i].length(); j++) {
				cArr[i][j] = sArr[i].charAt(j); // ���ڿ��� �� ���ھ� ���ڹ迭�� ����
			}
		}
		for (int i = 0; i < max; i++) { // �� ���� �ݺ�
			for (int j = 0; j < 5; j++) {
				if (cArr[j][i] == '\0') { // ���� NULL�� �� ��� ����
					continue;
				}
				System.out.print(cArr[j][i]);
			}
		}
	}

}