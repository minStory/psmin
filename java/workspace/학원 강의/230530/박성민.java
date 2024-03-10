package day_0530;

public class Test04 {

	public static void main(String[] args) {
		Buyer b=new Buyer();
		
//		Tv1 t=new Tv1();
//		Computer c=new Computer();	// = b.buy(new Tv1());
		Product t=new Tv1();
		Product c=new Computer();
		t.price=100;
		t.bonusPoint=t.price/10;
		c.price=200;
		c.bonusPoint=c.price/10;
		
		b.setBuy(t);
		b.setBuy(c);
	}

}
class Product{
	int price;
	int bonusPoint;
}
class Tv1 extends Product{
	public String toString(){
		return "TV";
	}
}
class Computer extends Product{
	public String toString(){
		return "Computer";
	}
}
class Buyer{
	int money=1000;
	int bonusPoint=0;
	
	void setBuy(Product p) {	//매개변수로 Product클래스의 자손타입의 참조변수면 어느 것이나 매개변수로 받아들인다는 뜻
		if(money<p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
		}
		else {
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		System.out.println(p+"을/를 구입하셨습니다.");
		System.out.println("현재 잔액 : "+this.getMoney());
		System.out.println("현재 보너스포인트 : "+this.getBonusPoint());
		}
	}
	int getMoney() {
		return this.money;
	}
	int getBonusPoint() {
		return this.bonusPoint;
	}
//	void buy(Computer c) {
//		money-=c.price;
//		bonusPoint+=c.bonusPoint;
//	}
}