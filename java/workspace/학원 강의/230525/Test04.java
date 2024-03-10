package day_0525;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int arr[] = new int[10000];
		while (true) {
			n = sc.nextInt();
			if(n==-1) { break; }
			int cnt = 0;
			int temp = 1;
			int sum = 0;
			while (temp < n) {
				if (n % temp == 0) {
					arr[cnt] = temp;
					cnt++;
				}
				temp++;
			}
			for (int i = 0; i < cnt; i++) {
				sum += arr[i];
			}
			if (sum == n) {
				System.out.print(sum + " = ");
				for (int i = 0; i < cnt; i++) {
					if (i == cnt - 1) {
						System.out.println(arr[i]);
					} else {
						System.out.print(arr[i] + " + ");
					}
				}
				System.out.println();
			} else {
				System.out.println(n + " is NOT perfect.");
			}
		}
		System.out.println("���α׷��� �����մϴ�.");

	}

}
//� ���� n�� �ڽ��� ������ ��� ������� �հ� ������, �� ���� ��������� �Ѵ�.
//���� ��� 6�� 6 = 1 + 2 + 3 ���� �������̴�.
//n�� ���������� �ƴ��� �Ǵ����ִ� ���α׷��� �ۼ��϶�.
//
//�Է�
//�Է��� �׽�Ʈ ���̽����� �� �� �������� n�� �־�����. (2 < n < 100,000)
//
//�Է��� �������� -1�� �־�����.
//
//���
//�׽�Ʈ���̽� ���� ���ٿ� �ϳ��� ����ؾ� �Ѵ�.
//n�� ���������, n�� n�� �ƴ� ������� ������ ��Ÿ���� ����Ѵ�(���� ��� ����).
//�̶�, ������� ������������ �����ؾ� �Ѵ�.
//n�� �������� �ƴ϶�� n is NOT perfect. �� ����Ѵ�.
//
//6
//12
//28
//-1
//
//6 = 1 + 2 + 3
//12 is NOT perfect.
//28 = 1 + 2 + 4 + 7 + 14