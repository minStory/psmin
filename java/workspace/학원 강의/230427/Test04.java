//A,B �Է�
//A+B
//
//tc�� ������ �޾Ƽ� �׸�ŭ �ݺ�
//
//3
//1 1
//2
//2 3
//5
//3 4
//7

package parkseongmin;

import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int tc = sc.nextInt();		//�׽�Ʈ���̽� ���� �Է�
		for (int i = 0; i < tc; i++) {	//�׽�Ʈ���̽���ŭ �ݺ�
			int A = sc.nextInt();	//A �Է�
			int B = sc.nextInt();	//B �Է�
			System.out.println(A + B);	//A+B ���
		}
	}
}
