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
	
	void setBuy(Product p) {	//�Ű������� ProductŬ������ �ڼ�Ÿ���� ���������� ��� ���̳� �Ű������� �޾Ƶ��δٴ� ��
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
		}
		else {
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
		System.out.println("���� �ܾ� : "+this.getMoney());
		System.out.println("���� ���ʽ�����Ʈ : "+this.getBonusPoint());
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