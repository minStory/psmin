//에러는 어쩔 수 없지만, 예외는 반드시 처리하자
//try{
//		쇼핑갔을 때
//}
//catch(돈이 없는 경우){
//			아빠에게 빌린다
//}
//catch(원하는 물건이 없는 경우){
//			집에 온다
//}
//예외 처리 방법
//1. try-catch문 (직접 처리)
//2. 예외 선언하기 (예외 떠넘기기(알리기))
//3. 은폐 덮기 (빈 try-catch문 사용)

//예외 발생시키키
//키워드 throw 사용하여 프로그래머가 고의로 예외 발생시킴
//1. 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든다.
//EXception e = new Exception("고의로 발생시킴");
//2. 키워드 throw를 이용해서 예외를 발생시킨다.
//throw e;

//1. 조상 Exception과 RuntimeException 선택은 프로그래머가 한다.
//	try-catch문
//2. String 생성자를 넣어줘야한다.

package day_0602;

public class Test03 {

	public static void main(String[] args) {
		try {
			Exception e=new Exception("고의 예외");
			throw e;
		}catch(Exception e) {
			System.out.println("예외 발생");
			System.out.println(e.getMessage());
		}
	}
}
