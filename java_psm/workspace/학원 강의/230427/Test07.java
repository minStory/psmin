package parkseongmin;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		int input = 0, answer = 0;

		answer = (int) (Math.random() * 100) + 1; // 1~100 ������ ������ ���� �Է�
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("1�� 100������ ������ �Է��ϼ���~~");
			input = sc.nextInt();

			if (input > answer) {
				System.out.println("�� ���� ���� �ٽ� �õ�");
			} else if (input < answer) {
				System.out.println("�� ū ���� �ٽ� �õ�");
			}
		} while (input != answer);
		System.out.println("�����Դϴ�~~");
	}

}
