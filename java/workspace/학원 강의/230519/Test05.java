//생성자에서 다른 생성자 호출 - this()
//같은 클래스의 멤버들 간에 서로 호출이 가능, 생성자들도 서로 호출이 가능함
//조건을 만족 해야함
//1. 생성자의 이름으로 클래스이름 대신 this를 사용한다.
//2. 한 생성자에서 다른 생성자를 호출할 때는 반드시 첫 줄에서만 호출이 가능하다.
//	->생성자 내에서 초기화 도중에 다른 생성자를 호출하면 호출된 다른 생성자 내에서도 멤버변수를 초기화 할 것이므로
//		다른 생성자를 호출하기 이전의 초기화 작업이 무의미해질 수 있기 때문

//객체 자신을 자리키는 참조변수 - this.클래스 내 인스턴스변수
//color = color 같으면 둘 다 지역변수로 간주
//생성자의 매개변수로 인스턴스 변수들의 초기값을 제공 받는 경우가 많기 때문에 매개변수와
//인스턴스 변수의 이름이 일치하는 경우가 자주 있기 때문
//변수 이름을 다르게 하는 것 보다 this를 사용해서 구별되도록 하는 것이 의미가 더 명확하고 이해하기 쉬움

//인스턴스 변수에 접근이 가능 static메서드(클래스메서드) 접근이 불가능
//클래스메서드는 인스턴스를 생성하지 않고도 호출될 수 있으므로
//static메서드가 호출된 시점에 인스턴스가 존재하지 않을 수도 있기 때문

//this : 인스턴스 자신을 가리키는 참조변수, 인스턴스의 주소가 저장되어 있다. 모든 인스턴스메서드에 지역변수로 숨겨진 채로 존재
//this() , this(참조변수) : 생성자, 같은 클래스의 다른 생성자를 호출할 때 사용

package day_0519;

public class Test05 {

	public static void main(String[] args) {
		Car c1=new Car("red","auto",4);	//매개변수가 있는 생성자 사용
		System.out.println(c1.color);
		System.out.println(c1.geartype);
		System.out.println(c1.door);
		
		Car c2=new Car();	//기본생성자 사용
//		c2.color="black";
//		c2.geartype="Manual";
//		c2.door=2;
		System.out.println(c2.color);
		System.out.println(c2.geartype);
		System.out.println(c2.door);
		
		Car c3=new Car("pink");	//매개변수 color만 있는 생성자 사용
		System.out.println(c3.color);
		System.out.println(c3.geartype);
		System.out.println(c3.door);
		
		Car c4=new Car(6);	//매개변수 door만 있는 생성자 사용
		System.out.println(c4.color);
		System.out.println(c4.geartype);
		System.out.println(c4.door);
	}

}
class Car {
	String color;	//색상
	String geartype;	//변속기 종류
	int door;	//문의 개수
	
	Car(){
		this("white","auto",4);	//Car(String c, String g, int d) 호출
	}
	Car(String color){
		this(color,"auto",4);	//Car(String c, String g, int d) 호출
	}
	Car(int d){
		this("purple","auto",d);
	}

//	Car(String color){
//		door=5;
//		Car(color,"auto",4);
//	}	//에러1. 생성자의 두번째 줄에서 다른 생성자 호출
//		//에러2. this(color,"auto",4);

	Car(String c, String g, int d){	//매개변수가 있는 생성자
		this.color=c;
		this.geartype=g;
		this.door=d;
	}
//	Car(){	//기본생성자 - 생성자가 있을 시 기본생성자 자동 미생성 -> 직접 생성	
//	}
}
