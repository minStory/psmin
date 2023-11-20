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
	//ObjectŬ������ toString()�� �������̵�
	public String toString() {
		return "TV";
	}
	Tv1(){
		//�θ�Ŭ������ ������ Product(int price)�� ȣ���Ͽ� ���� �Է�
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
	
	void setGetBuy(Product p) {	//�Ű������� ProductŬ������ �ڼ�Ÿ���� ���������� ��� ���̳� �Ű������� �޾Ƶ��δٴ� ��
		if(money<p.price) {
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
		}
		else {
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
		System.out.println("���� �ܾ� : "+this.money);
		System.out.println("���� ���ʽ�����Ʈ : "+this.bonusPoint);
		}
	}
}