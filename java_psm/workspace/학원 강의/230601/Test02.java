package day_0601;

public class Test02 {

	public static void main(String[] args) {
		TourGuide guide=new TourGuide();	//TourGuide타입의 객체 생성
		guide.leisureSports();	//TourGuide의 클래스를 거쳐 인터페이스 Providable의 메서드 호출
		guide.sightseeing();
		guide.food();
	}

}
interface Providable{	//인터페이스 Providable 생성
	void leisureSports();	//추상메서드 생성
	void sightseeing();
	void food();
}
class KoreaTour implements Providable{	//인터페이스 Providable을 구현한 클래스 KoreaTour 생성
	public void leisureSports() {	//추상메서드의 내용 작성
		System.out.println("한강에서 수상스키 투어");
	}
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
	}
	public void food() {
		System.out.println("전주 비빔밥 투어");
	}
}
class JapanTour implements Providable{
	public void leisureSports() {
		System.out.println("도쿄타워 번지점프 투어");
	}
	public void sightseeing() {
		System.out.println("오사카 관람 투어");
	}
	public void food() {
		System.out.println("초밥 투어");
	}
}
class TourGuide{
	private Providable tour=new KoreaTour();	//KoreaTour타입을 Providable타입으로 형변환하여 객체 생성
	private Providable tour1=new JapanTour();	//JapanTour타입을 Providable타입으로 형변환하여 객체 생성
	public void leisureSports() {	//인터페이스를 참조하여 KoreaTour의 메서드 호출
//		tour.leisureSports();
		tour1.leisureSports();
	}
	public void sightseeing() {
//		tour.sightseeing();
		tour1.sightseeing();
	}
	public void food() {
//		tour.food();
		tour1.food();
	}
}