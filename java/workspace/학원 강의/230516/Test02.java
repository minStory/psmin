package day_0516;

public class Test02 {

	public static void main(String[] args) {
		System.out.println(Cars.wheel);
//		System.out.println(Cars.speed);

		Car mycar1 = new Car();
		System.out.println(Cars.wheel);
		System.out.println(mycar1.speed);

		Car mycar2 = new Car();
		System.out.println("<���� ��>");
		System.out.println("mycar1.speed : " + mycar1.speed);
		System.out.println("mycar2.speed : " + mycar2.speed);
		System.out.println("mycar1.wheel : " + mycar1.wheel);
		System.out.println("mycar2.wheel : " + mycar2.wheel);

		mycar2.speed = 100;
		mycar2.wheel = 5;
		System.out.println("<���� ��>");
		System.out.println("mycar1.speed : " + mycar1.speed);
		System.out.println("mycar2.speed : " + mycar2.speed);
		System.out.println("mycar1.wheel : " + mycar1.wheel);
		System.out.println("mycar2.wheel : " + mycar2.wheel);
	}
	// �ν��Ͻ� ���� : Ŭ���������� ����, �ν��Ͻ��� �����ؾ��ϰ� �ν��Ͻ����� ������ ��������� �����Ƿ� ���� �ٸ� ���� ���� �� �ִ�.
	// �ν��Ͻ����� ������ ���¸� �����ؾ��ϴ� �Ӽ��� ��� �ν��Ͻ� ������ �����Ѵ�.

	// Ŭ���� ���� : �ν��Ͻ� ���� �տ� static�� �ٿ��� �����, ��� �ν��Ͻ��� ����� �������(����)�� �����ϰ� �ȴ�.
	// �� Ŭ������ ��� �ν��Ͻ����� �������� ���� �����ؾ� �ϴ� ��� ����Ѵ�.

	// ���� ���� : �޼��� �������� ��� �����ϰ� �޼��� ����� �Ҹ�Ǿ� ��� �Ұ���, for, if{} ����� �Ҹ�Ǿ� ��� �Ұ���
	
	//�ν��Ͻ�, Ŭ���� ���� ����
	//ī�� Ŭ����(����, ����, ��, ����)
	//����, ���� : �ν��Ͻ� ���� (ī�帶�� �� ����)
	//��, ���� : Ŭ���� ���� (�� ����)
	//�ν��Ͻ� ������ �ν��Ͻ��� ������ �� ���� �����ǹǷ� �ν��Ͻ����� ���� �ٸ� ���� ���� �� ���
	//

}

class Cars {
	static int wheel = 4;
	int speed;
}