package day_0530;

public class Test04 {

	public static void main(String[] args) {
		Buyer b=new Buyer();
		
//		Tv1 t=new Tv1();
//		Computer c=new Computer();
//		b.setGetbuy(new Tv1());
		
		Product t=new Tv1();
		Product c=new Computer();
		
		b.setGetBuy(t);
		b.setGetBuy(c);
	}

}
class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price=price;
		this.bonusPoint=(int)(price/10.0);
	}
}
class Tv1 extends Product{
	//Object클래스의 toString()을 오버라이딩
	public String toString() {
		return "TV";
	}
	Tv1(){
		//부모클래스의 생성자 Product(int price)를 호출하여 가격 입력
		super(100);
	}
}
class Computer extends Product{
	public String toString() {
		return "Computer";
	}
	Computer(){
		super(200);
	}
}
class Buyer{
	int money=1000;
	int bonusPoint=0;
	
	void setGetBuy(Product p) {	//매개변수로 Product클래스의 자손타입의 참조변수면 어느 것이나 매개변수로 받아들인다는 뜻
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
		}
		else {
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		System.out.println(p+"을/를 구입하셨습니다.");
		System.out.println("현재 잔액 : "+this.money);
		System.out.println("현재 보너스포인트 : "+this.bonusPoint);
		}
	}
}