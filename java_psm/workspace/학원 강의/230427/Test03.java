package parkseongmin;

import java.util.Scanner;

public class Test03 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();	//�� �Է�
		int i=1;	//���� �� �ʱ��
		while(i<=9) {	//���� �� ���ǽ�
			System.out.println(n+" * "+i+" = "+n*i);	//������ ���
			i++;	//���� �� ������
		}
	}

}
