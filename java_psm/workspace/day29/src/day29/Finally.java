//File-Program ����� �� ���� ���
//filnally�� ���� ���α׷� ����� �׻� ���־�� �ϱ� ����

package day29;

public class Finally {

	public static void main(String[] args) {
		//�ܺη� ����
		int a=0;
		int b=2;
		try {
			System.out.println("�ܺη� ����");
			int c=b/a;
		}
		catch(ArithmeticException e) {
			System.out.println("������ �߻��Ͽ����ϴ�.");
		}
		finally {
			System.out.println("������ ���� ����");
		}
	}

}
