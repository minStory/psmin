package day26;

public class ShapeMain {

	public static void main(String[] args) {
		Shape shapes[] = new Shape[3];
		// 부모의 객체배열 요소에 자식 값 넣기 => 업캐스팅
		shapes[0] = new Rect();
		shapes[1] = new Circle();
		shapes[2] = new Line();
		// 컴파일 시 Shape로 인식하지만, 런타임 시 각 도형으로 인식 -> 동적바인딩
		for (int i = 0; i < 3; i++) {
			shapes[i].draw();
		}
	}
}

abstract class Shape {
	abstract void draw();
//		System.out.println("도형을 그리다");
}

class Rect extends Shape {
	void draw() {
		System.out.println("사각형을 그리다");
	};

}

class Circle extends Shape {
	void draw() {
		System.out.println("원을 그리다");
	}
}

class Line extends Shape {
	void draw() {
		System.out.println("선을 그리다");
	}
}