package day_0601;

public class Test05 {

	public static void main(String[] args) {
		try {
			Exception e=new Exception("고의 예외");
			Exception a=new Exception("고의 에외2");
			throw a;
		}catch(Exception e) {
			System.out.println("예외 발생");
			System.out.println(e.getMessage());
		}
	}

}
