package day_0601;

public class Test04 {

	public static void main(String[] args) {
		int num1=100;
		int num2=0;
		int result=0;
		
		if(num2!=0) {
			result=num1/num2;
		}else {
			System.out.println("0으로 나눌 수 없습니다.");
		}
		System.out.println("result = "+result);
		System.out.println();
		
		try {
			result=num1/num2;
		}catch(ArithmeticException ex){
			System.out.println("0으로 나누면 발생하는 Exception");
			System.out.println(ex.getMessage());
		}
	}

}
