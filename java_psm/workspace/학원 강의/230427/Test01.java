package parkseongmin;

import java.util.Scanner;

public class Test01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String answer = "Y";
		int cnt = 0;

		while (answer.equals("Y")) {	//����� ���� �˻�
			System.out.println("������ ����Ͻðڽ��ϱ�?(Y)");
			answer = sc.nextLine();		//���� �Է�

			if (answer.equals("Y")) {
				System.out.println("������ " + ++cnt + "�� ����߽��ϴ�.");	//cnt ���� �� ���
			}
		}
		System.out.println("��� ����");	//���� ���� ���
	}
}
