package day30;

class Exception5 {

	public static void main(String[] args) {
		int age=-19;
		try {
			ticketing(age);		//ticketing메서드 호출
		}catch(AgeException e) {
			e.printStackTrace();	//오류를 출력하는 메서드
		}
	}
	public static void ticketing(int age) throws AgeException {
		if(age<0) {
			throw new AgeException("나이 입력이 잘못되었습니다.");	//생성자 호출 -> 매개변수에 값 전달
		}
	}
}
//사용자 정의 예외 -> Exception 클래스를 상속받을 것
class AgeException extends Exception{
	public AgeException(){	}	//기본생성자 생성
	public AgeException(String message){		//매개변수생성자 생성
		super(message);	//전달받은 매개변수의 값을 부모클래스에 전달 (나타낼 메세지 변경)
	}
}