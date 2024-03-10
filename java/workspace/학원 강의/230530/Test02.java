package day_0530;

public class Test02 {

	public static void main(String[] args) {
		//Tv 타입
		Tv t=new Tv();
		
		//SmartTv 타입
		SmartTv st=new SmartTv();	//부모+자손클래스의 기능 사용 가능
		Tv t1=new SmartTv();	//자손클래스인 SmartTv의 기능 사용 불가
		
//		SmartTv ss=new Tv(); -> 인스턴스Tv 멤버 개수보다 참조변수 ss가 사용할 수 있는 멤버 개수가 더 많아서 에러 발생
		
		//조상타입의 참조변수로 자손타입의 인스턴스를 참조할 수 있다.
		//반대로 자손타입의 참조변수로 조상타입의 인스턴스를 참조할 수는 없다.
	}

}

class Tv{
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() { channel++;}
	void channelDown() { channel--;}
}
class SmartTv extends Tv{
	String text;
	void caption() {}
}