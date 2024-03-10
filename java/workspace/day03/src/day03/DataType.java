package day03;

public class DataType {

	public static void main(String[] args) {
		int a = 65;
		float f = a;	//묵시적 형변환(자동 형변환)
		System.out.println(f);
		char c=(char)a;	//명시적 형변환(강제 형변환)
		System.out.println(c);
		
	}

}
