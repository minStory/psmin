package day30;

public class RethrowExample {

	public static void main(String[] args) {
		try {
			System.out.println("외부 try...");
			try {
				System.out.println("내부 try...");
				Exception e=new Exception();
				throw e;
			}
			catch(Exception e) {
				System.out.println("(내부 try-catch) exception : "+e);
				System.out.println("예외던지기 한 번 더 : ");
				throw e;
			}
			finally {
				System.out.println("finally 구문 출력");
			}
		}
		catch(Exception e ) {
			System.out.println("(외부 try-catch) exception : "+e);
		}
		System.out.println("종료");
	}
}
//외부 try 내부의 구문 모두 실행 후 외부 catch 실행 -> 종료