package codeUp;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();		//���� ���� n �Է�
		int arr[] = new int[n];	//������ ���� ���� n �迭 ����
		int cnt = 0;				//�ӽú��� ����
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();	//�ε���0~n���� �� �Է�
		}
		int v = sc.nextInt();		//������ Ȯ���� �� �Է�
		for (int i = 0; i < n; i++) {
			cnt = arr[i] == v ? ++cnt : cnt;	//�ε���0~n���� �ݺ��Ͽ� v�� ���� ������ �ӽú���++
		}
		System.out.println(cnt);		//���
	}
}
