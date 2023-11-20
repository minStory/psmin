package parkseongmin;

public class Test01 {
	public static void main(String[] args) {
		Car mycar = new Car();
		System.out.println("�õ� ó�� �ʱ�ȭ : " + mycar.powerOn);
		System.out.println("���� ���� �ʱ�ȭ : " + mycar.color);
		System.out.println("������ �� �ʱ�ȭ : " + mycar.wheel);
		System.out.println("�ӷ� �ʱ�ȭ : " + mycar.speed);
		System.out.println("������ �۵� �ʱ�ȭ : " + mycar.wiperOn);

		mycar.power();
		System.out.println("�õ� �޼��� ���� : " + mycar.powerOn);
		mycar.power();
		System.out.println("�õ� �޼��� �ٽ� ���� : " + mycar.powerOn);

		mycar.color = "black";
		System.out.println("���� ���� ���� : " + mycar.color);

		Car mycar1 = new Car();
		Car mycar2 = new Car();
		mycar1.color = "red";
		mycar2.color = "black";

		mycar1.speedUp();
		mycar2.wiper();

		System.out.println("mycar1�� �� : " + mycar1.color);
		System.out.println("mycar2�� �� : " + mycar2.color);
		System.out.println("mycar1�� �ӵ� : " + mycar1.speed);
		System.out.println("mycar2�� �ӵ� : " + mycar2.speed);
		System.out.println("mycar1�� ������ �۵� ���� : " + mycar1.wiperOn);
		System.out.println("mycar2�� ������ �۵� ���� : " + mycar2.wiperOn);

	}
}

class Car {
	boolean powerOn;
	String color;
	int wheel;
	int speed;
	boolean wiperOn;

	void power() { // �õ� �޼���
		powerOn = !powerOn;
	}

	void speedUp() { // ���� �޼���
		speed++;
	}

	void speedDown() { // �극��ũ �޼���
		speed--;
	}

	void wiper() { // ������ �޼���
		wiperOn = !wiperOn;
	}

}
