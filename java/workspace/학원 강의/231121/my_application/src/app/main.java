package app;

import pack1.A;
import pack2.B;

public class main {

	public static void main(String[] args) {
		//pack1 > A.java -> method() -> A-method 실행
		A a = new A();
		a.method();
		//pack2 > B.java -> method() -> B-method 실행
		B b = new B();
		b.method();
		
	}

}
