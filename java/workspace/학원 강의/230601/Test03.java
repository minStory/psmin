//에러
//컴파일에러 런타임에러
//논리적 에러
//컴파일에러 : 컴파일 시에 발생하는 에러
//런타임 에러 : 실행 시에 발생하는 에러
//논리적 에러 : 실행은 되지만 의도와는 다르게 돟작

//자바를 실행
//에러 : 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
//예외 : 프로그램 코드에 의해 수습될 수 있는 다소 미약한 오류

//E클래스들 : 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
//RuntimeE클래스들 : 프로그래머의 실수로 발생하는 예외

//NullPointerException(NPE) : Null객체를 참조할 때 발생
//ArrayIndexOutOfBoundsException : 배열을 참조하는 인덱스가 잘못된 경우
//NoClassDefFoundE~ : 원하는 클래스를 찾지 못했을 경우
//OutOfMemoryE~ : 사용 가능한 메모리가 없는 경우
//ClassCastE~ : 적절치 못하게 클래스를 형변환하는 경우
//ArithmeticE~ : 어떤 수를 0으로 나눌 때 발생

package day_0601;

public class Test03 {

	public static void main(String[] args) {
		try {
			int a[]= {2,0};
			int b=4;
			int c=b/a[2];	//배열 길이 오류
//			int c=b/a[1];	//산술 오류
//			int c=b/a[0];	//정상 출력
//			int d=3;
			System.out.println(c);
//			System.out.println(d);
		}
		catch(ArithmeticException e) {
			System.out.println("산술 오류 발생");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.err.println("배열 길이 오류 발생");
		}
		System.out.println("예외처리 공부 중");
	}
}
