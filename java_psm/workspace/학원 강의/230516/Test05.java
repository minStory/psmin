package day_0516;

public class Test05 {

	public static void main(String[] args) {
		Area.manual(); // 클래스 메서드 접근 가능
//		Area.triangle(3,5);	//에러 발생
//		Area.rectangle(3,4);	//에러 발생

		Area calculator = new Area();
		calculator.manual();
		System.out.println(calculator.triangle(3, 5));
		System.out.println(calculator.rectangle(3, 4));

	}

}
// 메서드 : 작업을 수행하는데 필요한 값만 넣고 원하는 결과를 얻기만 하면 된다.
// 메서드가 내부적으로 어떤 과정을 거쳐 결과를 만들어 내는지는 전혀 몰라도 상관없다.
// 메서드에 넣을 값(입력)과 반환하는 결과(출력)만 알면 된다.
// 블랙박스
// 선언부 + 구현부로 이루어져 있다.

// return문 : 일치하거나 적어도 자동형변환이 가능한 것
// 선언할 수 있는 매개변수와 달리 return문은 단 하나의 값만 반환할 수 있는데,
// 메서드의 입력(매개변수)은 여러 개일 수 있어도 출력(반환값)은 최대 하나만 허용하는 것이다.

class Area {
	static void manual() { // 클래스 메서드
		System.out.println("현재 사용 가능한 함수 목록");
		System.out.println("triangle : 삼각형 넓이");
		System.out.println("rectangle : 사각형 넓이");
		System.out.println("입니다.");
	}

	double triangle(int a, int b) { // 삼각형 넓이 반환 메서드
		return (double) a * b / 2;
	}

	int rectangle(int a, int b) { // 사각형 넓이 반환 메서드
		return a * b;
	}
}