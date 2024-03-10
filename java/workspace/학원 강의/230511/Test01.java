package parkseongmin;

public class Test01 {
	public static void main(String[] args) {
		Car mycar = new Car();
		System.out.println("시동 처음 초기화 : " + mycar.powerOn);
		System.out.println("차의 색상 초기화 : " + mycar.color);
		System.out.println("바퀴의 수 초기화 : " + mycar.wheel);
		System.out.println("속력 초기화 : " + mycar.speed);
		System.out.println("와이퍼 작동 초기화 : " + mycar.wiperOn);

		mycar.power();
		System.out.println("시동 메서드 동작 : " + mycar.powerOn);
		mycar.power();
		System.out.println("시동 메서드 다시 동작 : " + mycar.powerOn);

		mycar.color = "black";
		System.out.println("현재 차의 색상 : " + mycar.color);

		Car mycar1 = new Car();
		Car mycar2 = new Car();
		mycar1.color = "red";
		mycar2.color = "black";

		mycar1.speedUp();
		mycar2.wiper();

		System.out.println("mycar1의 색 : " + mycar1.color);
		System.out.println("mycar2의 색 : " + mycar2.color);
		System.out.println("mycar1의 속도 : " + mycar1.speed);
		System.out.println("mycar2의 속도 : " + mycar2.speed);
		System.out.println("mycar1의 와이퍼 작동 여부 : " + mycar1.wiperOn);
		System.out.println("mycar2의 와이퍼 작동 여부 : " + mycar2.wiperOn);

	}
}

class Car {
	boolean powerOn;
	String color;
	int wheel;
	int speed;
	boolean wiperOn;

	void power() { // 시동 메서드
		powerOn = !powerOn;
	}

	void speedUp() { // 엑셀 메서드
		speed++;
	}

	void speedDown() { // 브레이크 메서드
		speed--;
	}

	void wiper() { // 와이퍼 메서드
		wiperOn = !wiperOn;
	}

}
