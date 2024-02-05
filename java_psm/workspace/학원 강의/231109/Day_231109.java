package parkseongmin;

public class Main {
	public static void main(String[] args) {
//		클래스의 강제 타입 변환 -> 다운캐스팅
		//자식 클래스 < 부모 클래스 : 자동형변환 -> 부모에 맞추다보니 손실이 난다.
		//강제 타입 변환 : 내 타입(자식형)
		FireEngine f=new FireEngine();	//자식 객체
		Car c=new Car();
		Car c2=f;
		Car c_=null;	//부모형타입, 객체는 생성하지 않았다.
		
		c_=f;	//부모의 형 타입이고 자식으 ㅣ객체를 생성한 경우
		f=(FireEngine)c_;	//자식의 객체로 형변환
		f.drive();
		f.water();
		
		
//		제품클래스
		//@매개변수(함수:클래스) -> 객체를 생성할 때
		Buyer b=new Buyer();
		//제품의 객체를 생성해서 객체를 넘겨준다.
		Audio a=new Audio(100);
		Computer com=new Computer(200);
		Tv tv=new Tv(100);
		Nintendo n=new Nintendo(50);
		//바이어가 물건을 사게 한다.
//		b.buy(null);
		//바이어가 컴퓨터를 산다.
		b.buy(com);
		//바이어가 티비를 산다.
		b.buy(tv);
		b.buy(a);
		b.buy(n);
		//바이어가 현재 남은 돈을 출력한다.
		
//		추상클래스(레시피)
		//Recipe r=new Recipe("백종원");	//추상메서드는 미완성이라서 객체 생성 불가
		PastaRecipe pr=new PastaRecipe("백종원");	//추상클래스를 의존하는 자식클래스 객체 생성
		pr.info();	//인스턴스 메서드 호출
		pr.makeSource();	//자식 객체의 인스턴스 메서드 호출
		pr.cookingPlay();	//자식 객체에서 추상메서드 구현 후 완성된 메서드 호출
		
//		추상클래스 문제2: 플레이어를 활용한 추상클래스
		AudioPlayer ap=new AudioPlayer();
		ap.play(10);
		ap.stop();
	}
	
}

//추상클래스 : Player
//자식클래스 : AudioPlayer
abstract class Player {
	int pos;
	abstract void play(int pos);
	abstract void stop();
}

class AudioPlayer extends Player{
	void play(int pos) {
		System.out.println(pos+"위치부터 재생");
	}
	void stop() {
		System.out.println("재생 중지");
	}
}


//추상클래스(레시피)
abstract class Recipe {	//추상클래스 선언
	String chef;	//셰프 인스턴스 변수(멤버 필드)
	
	//기본생성자
	Recipe(String chef){
		this.chef=chef;
	}
	
	void info() {	//인스턴스 메서드
		System.out.println("이 레시피는 "+chef+"셰프님의 레시피입니다.");
	}
	abstract void cookingPlay();
}

class PastaRecipe extends Recipe{
	PastaRecipe(String chef) {
		super(chef);
		// TODO Auto-generated constructor stub
	}

	void makeSource() {
		System.out.println("파스타 소스를 직접 만든다.");
	}
	void cookingPlay() {
		System.out.println("요리 시작!");
	}
}



//제품 클래스 정의(설계도)
//Product : 제품
class Product{
	int price;	//가격
	int bonusPoint;
	
	//기본 생성자
	Product(int price){
		this.price=price;
		this.bonusPoint=(int)(price/10.0);
	}
}
//TV : 제품1
class Tv extends Product{
	Tv(int price){
		super(price);
	}
	public String toString() {
		return "TV";
	}
}
//Computer : 제품2
class Computer extends Product{
	Computer(int price){
		super(price);
	}
	public String toString() {
		return "Computer";
	}
}
//Audio : 제품3
class Audio extends Product{
	Audio(int price){
		super(price);
	}
	public String toString() {
		return "Audio";
	}
}
//Nintendo : 제품4
class Nintendo extends Product{
	Nintendo(int price){
		super(price);
	}
	public String toString() {
		return "Nintendo";
	}
}
//고객 : buyer -> 고객의 잔고를 계산 (money = 1000만원)
//고객의 잔고 : 적을 경우(money<price : 잔액 부족)
//			많을 경우(money>=price : 제품 구매)
class Buyer{	//물건을 사는 클래스 : 행위메서드
	int money=1000;	//고객의 잔고
	int BonusPoint=0;	//보너스 포인트
	//행위 : 물건을 산다
	void buy(Product p) {
		if(money<p.price) {
			System.out.println("잔액이 부족합니다.");
		}else {
			money-=p.price;	//잔고 - 제품 가격
			BonusPoint+=p.bonusPoint;	//고객 보너스 포인트 + 구매 보너스 포인트
			System.out.println(p.toString()+" 구매 완료! 잔액은 "+this.money+"만원, 잔여 포인트는 "+this.BonusPoint+"P 입니다.");
		}
	}
	
}



class Car{	//부모클래스
	String color;
	int door;
	void drive() {
		System.out.println("드라이브 중입니다.");
	}
	
}
//자식클래스
class FireEngine extends Car{
	void water() {
		System.out.println("water");
	}
}
//자식클래스
class Ambulance extends Car{	
}












