package day05;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Throw {
	public static void main(String[] args) {
//		try {
//		Exception e=new Exception("고의 발생");
//		throw e;
//		}catch(Exception e) {
//			System.out.println("에러 메시지 : "+e.getMessage());
//			e.printStackTrace();
//		}
//		System.out.println("프로그램이 종료되었습니다.");
		
		//scanner로 문항을 주고 어떤 사람인지 번호를 선택하게 한다.
		Scanner sc=new Scanner(System.in);
		
		//성격 유형검사를 시작합니다 라는 멘트를 주고 시작한다.
		System.out.println("성격 유형검사를 시작합니다.");
		//static 메서드를 활용해서 지문에 대한 문항을 검사하는 메서드를 만든다.
		try {
			Throw.checkYourSelf(sc); //scan에 오류를 static 메서드에 던질 수 있게 매개변수를 만들어준다.
		}catch(InputMismatchException e) {
			System.out.println("숫자만 입력 가능합니다.");
		}finally {
			if(sc!=null) {
				sc.close();
			}
		}
		System.out.println("프로그램을 종료합니다.");

	}
	//static method
	public static void checkYourSelf(Scanner sc) throws InputMismatchException {
		System.out.println("1. 사람과 어울리는 것이 좋다.\n2. 혼자 있는 것이 좋다.\n선택 >>>");
		int check=sc.nextInt();
		if(check==1) {
			System.out.println("당신은 ENFP 입니다.");
		}else if(check==2) {
			System.out.println("당신은 ISFP 입니다.");
		}
	}
}
