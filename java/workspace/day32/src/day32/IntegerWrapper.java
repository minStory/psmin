package day32;

public class IntegerWrapper {

	public static void main(String[] args) {
		Integer ii=100;		//auto boxing
		System.out.println(ii.intValue()+3);	//Integer ->int
		System.out.println(ii.doubleValue()+3);	//Integer -> double
		System.out.println(ii.floatValue()+3);	//integer -> float
		System.out.println(ii.toString()+3);	//Integer -> String (���ڿ��� ������ ����)
		System.out.println("hello"+"world");	//���ڿ� ����
		
	}

}
