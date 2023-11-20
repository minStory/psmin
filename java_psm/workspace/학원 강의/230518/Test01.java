package day_0518;

public class Test01 {

	public static void main(String[] args) {
		Check.cm_Imember();
		Check.cm_Cmember();
		Check myinstance = new Check();
		myinstance.im_Cmember();
		myinstance.im_Imember();
	}

}

class Check {
	// instanceVariable : iv
	// classVariable : cv
	// instanceMethod : im
	// classMethod : cm

	static int cv = 5;
	int iv = 4;

	static void cm() {
	}

	static void im() {
	}

	static void cm_Imember() {
		// 클래스 메서드가 인스턴스 멤버에 접근 -> 에러 : 클래스메서드 생성시점이 인스턴스 멤버 생성시점보다 빠름
		// System.out.println(iv);
		// im();
	}

	void im_Cmember() {
		// 인스턴스 메서드가 클래스 멤버에 접근
		System.out.println(cv);
		cm();
	}

	static void cm_Cmember() {
		// 클래스 메서드가 클래스 멤버에 접근
		System.out.println(cv);
		cm();
	}

	void im_Imember() {
		//인스턴스 메서드가 인스턴스 멤버에 접근
		System.out.println(iv);
		im();
	}
}