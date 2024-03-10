package day30;

public class Exception3 {

	public static void main(String[] args) {
		try {
			methodA();
		}
		catch(Exception e) {
			System.out.println("메인에서 처리");
		}
	}
	public static void methodA() throws Exception{
		methodB();
	}
	public static void methodB() throws Exception{
		methodC();
	}
	public static void methodC() throws Exception{
		Exception e=new Exception();
		throw e;	//고의 예외 발생
	}
	//실행 : 메인 -> A -> B -> C -> C에서 에러 발생
	//에러 발생 후 책임 전가 : C -> B -> A -> 메인 ->메인에서 처리

}
