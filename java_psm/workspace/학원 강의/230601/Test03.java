//����
//�����Ͽ��� ��Ÿ�ӿ���
//���� ����
//�����Ͽ��� : ������ �ÿ� �߻��ϴ� ����
//��Ÿ�� ���� : ���� �ÿ� �߻��ϴ� ����
//���� ���� : ������ ������ �ǵ��ʹ� �ٸ��� ����

//�ڹٸ� ����
//���� : ���α׷� �ڵ忡 ���ؼ� ������ �� ���� �ɰ��� ����
//���� : ���α׷� �ڵ忡 ���� ������ �� �ִ� �ټ� �̾��� ����

//EŬ������ : ������� �Ǽ��� ���� ������ ���ο� ���� �߻��ϴ� ����
//RuntimeEŬ������ : ���α׷����� �Ǽ��� �߻��ϴ� ����

//NullPointerException(NPE) : Null��ü�� ������ �� �߻�
//ArrayIndexOutOfBoundsException : �迭�� �����ϴ� �ε����� �߸��� ���
//NoClassDefFoundE~ : ���ϴ� Ŭ������ ã�� ������ ���
//OutOfMemoryE~ : ��� ������ �޸𸮰� ���� ���
//ClassCastE~ : ����ġ ���ϰ� Ŭ������ ����ȯ�ϴ� ���
//ArithmeticE~ : � ���� 0���� ���� �� �߻�

package day_0601;

public class Test03 {

	public static void main(String[] args) {
		try {
			int a[]= {2,0};
			int b=4;
			int c=b/a[2];	//�迭 ���� ����
//			int c=b/a[1];	//��� ����
//			int c=b/a[0];	//���� ���
//			int d=3;
			System.out.println(c);
//			System.out.println(d);
		}
		catch(ArithmeticException e) {
			System.out.println("��� ���� �߻�");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("�迭 ���� ���� �߻�");
		}
		System.out.println("����ó�� ���� ��");
	}
}
