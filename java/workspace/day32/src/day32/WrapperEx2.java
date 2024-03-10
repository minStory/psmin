package day32;

public class WrapperEx2 {

	public static void main(String[] args) {
		int i=30;
		Integer ii=new Integer(i);	//Integer타입 객체 생성 (권장 X)
		System.out.println(ii);	//객체 출력
//		Integer i=3; 	//jdk9부터 이렇게 사용
		
		double d=3.14;
		Double dd=new Double(d);
		System.out.println(dd);
	}

}
