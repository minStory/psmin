//참조변수 super : 자손클래스에서 조상클래스로부터 상속받은 멤버를 참조하는데 사용되는 참조변수
//멤버변수와 지역변수는 this로 구별
//상속받은 멤버와 자신의 멤버는 super로 구별

package day_0523;

public class Test05 {

	public static void main(String[] args) {
		SportsCar mycar=new SportsCar("red",330);
		
		System.out.println(mycar.color);
		System.out.println(mycar.speedLimit);
	}

}
class Car{
	int wheel;
	int speed;
	String color;
	Car(){
		
	}
	
	Car(String color){
		this.color=color;
	}
}
class SportsCar extends Car{
	int speedLimit;
	
	SportsCar(String color,int speedLimit){
//		super(color);
		this.color=color;
		this.speedLimit=speedLimit;
	}
}
