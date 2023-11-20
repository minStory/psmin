package day_0516;

public class Test02 {

	public static void main(String[] args) {
		System.out.println(Cars.wheel);
//		System.out.println(Cars.speed);

		Car mycar1 = new Car();
		System.out.println(Cars.wheel);
		System.out.println(mycar1.speed);

		Car mycar2 = new Car();
		System.out.println("<변경 전>");
		System.out.println("mycar1.speed : " + mycar1.speed);
		System.out.println("mycar2.speed : " + mycar2.speed);
		System.out.println("mycar1.wheel : " + mycar1.wheel);
		System.out.println("mycar2.wheel : " + mycar2.wheel);

		mycar2.speed = 100;
		mycar2.wheel = 5;
		System.out.println("<변경 후>");
		System.out.println("mycar1.speed : " + mycar1.speed);
		System.out.println("mycar2.speed : " + mycar2.speed);
		System.out.println("mycar1.wheel : " + mycar1.wheel);
		System.out.println("mycar2.wheel : " + mycar2.wheel);
	}
	// 인스턴스 변수 : 클래스영역에 생성, 인스턴스를 생성해야하고 인스턴스마다 별도의 저장공간을 가지므로 서로 다른 값을 가질 수 있다.
	// 인스턴스마다 고유한 상태를 유지해야하는 속성의 경우 인스턴스 변수로 선언한다.

	// 클래스 변수 : 인스턴스 변수 앞에 static을 붙여서 만들고, 모든 인스턴스가 공통된 저장공간(변수)을 공유하게 된다.
	// 한 클래스의 모든 인스턴스들이 공통적인 값을 유지해야 하는 경우 사용한다.

	// 지역 변수 : 메서드 내에서만 사용 가능하고 메서드 종료시 소멸되어 사용 불가능, for, if{} 벗어나면 소멸되어 사용 불가능
	
	//인스턴스, 클래스 변수 차이
	//카드 클래스(무늬, 숫자, 폭, 넓이)
	//무늬, 숫자 : 인스턴스 변수 (카드마다 값 상이)
	//폭, 넓이 : 클래스 변수 (값 고정)
	//인스턴스 변수는 인스턴스가 생성될 때 마다 생성되므로 인스턴스마다 각기 다른 값을 가질 때 사용
	//

}

class Cars {
	static int wheel = 4;
	int speed;
}