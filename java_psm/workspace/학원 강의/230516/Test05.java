package day_0516;

public class Test05 {

	public static void main(String[] args) {
		Area.manual(); // Ŭ���� �޼��� ���� ����
//		Area.triangle(3,5);	//���� �߻�
//		Area.rectangle(3,4);	//���� �߻�

		Area calculator = new Area();
		calculator.manual();
		System.out.println(calculator.triangle(3, 5));
		System.out.println(calculator.rectangle(3, 4));

	}

}
// �޼��� : �۾��� �����ϴµ� �ʿ��� ���� �ְ� ���ϴ� ����� ��⸸ �ϸ� �ȴ�.
// �޼��尡 ���������� � ������ ���� ����� ����� �������� ���� ���� �������.
// �޼��忡 ���� ��(�Է�)�� ��ȯ�ϴ� ���(���)�� �˸� �ȴ�.
// ���ڽ�
// ����� + �����η� �̷���� �ִ�.

// return�� : ��ġ�ϰų� ��� �ڵ�����ȯ�� ������ ��
// ������ �� �ִ� �Ű������� �޸� return���� �� �ϳ��� ���� ��ȯ�� �� �ִµ�,
// �޼����� �Է�(�Ű�����)�� ���� ���� �� �־ ���(��ȯ��)�� �ִ� �ϳ��� ����ϴ� ���̴�.

class Area {
	static void manual() { // Ŭ���� �޼���
		System.out.println("���� ��� ������ �Լ� ���");
		System.out.println("triangle : �ﰢ�� ����");
		System.out.println("rectangle : �簢�� ����");
		System.out.println("�Դϴ�.");
	}

	double triangle(int a, int b) { // �ﰢ�� ���� ��ȯ �޼���
		return (double) a * b / 2;
	}

	int rectangle(int a, int b) { // �簢�� ���� ��ȯ �޼���
		return a * b;
	}
}