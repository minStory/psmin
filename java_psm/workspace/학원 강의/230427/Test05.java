package parkseongmin;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();	//n���� ���� �� �Է�
		int sum = 0;	//���� ���� ������ ���� ����
		for (int i = 0; i < n; i++) {	//n��ŭ �ݺ�
			sum += i + 1;	//i�� ������ ������ sum�� i���� ���Ͽ� ����
		}
		System.out.println(sum);	//������ ���� �� ���
	}

}
