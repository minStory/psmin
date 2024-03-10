package day_0516;

public class Test01 {
	public static void main(String[] args) {
		 Car mycar1=new Car();	//인스턴스 변수1 생성
		 Car mycar2=new Car();	//인스턴스 변수2 생성
		 mycar1.color="red";	//인스턴스1 색상 변경
		 mycar2.color="black";	//인스턴스2 색상 변경
		 mycar1.speedUp();	//인스턴스1 속도 up
		 mycar2.wiper();	//인스턴스2 와이퍼 켜기
		 
		 System.out.println("mycar1의 색 : "+mycar1.color);
		 System.out.println("mycar2의 색 : "+mycar2.color);
		 System.out.println("mycar1의 속도 : "+mycar1.speed);
		 System.out.println("mycar2의 속도 : "+mycar2.speed);
		 System.out.println("mycar1의 와이퍼 작동 여부 : "+mycar1.wiper);
		 System.out.println("mycar2의 와이퍼 작동 여부 : "+mycar2.wiper);
	}
	
}
class Car{
	boolean power;	//시동
	String color;	//색상
	int wheel;	//바퀴의 수
	int speed;	//속도
	boolean wiper;	//와이퍼
	
	void power() { power=!power;}	//시동 켜기<-->끄기 메서드
	void speedUp() {speed++;}	//속도 up 메서드
	void speedDown() {speed--;}	//속도 down	메서드
	void wiper() {wiper=!wiper;}	//와이퍼 켜기<-->끄기 메서드
}
