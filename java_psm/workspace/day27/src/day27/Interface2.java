package day27;

public class Interface2 {

	public static void main(String[] args) {
			//중간 클래스가 참조하는 클래스를 구현할 메인 클래스에서 객체 생성
			TourGuide guide=new TourGuide();
			guide.leisureSports();
			guide.sightseeing();
			guide.food();
	}
}
//기본 인터페이스 (조상)
interface Providable{
	void leisureSports();
	void sightseeing();
	void food();
}
//기본 인터페이스를 구현한 KoreaTour 클래스
class KoreaTour implements Providable{
	@Override
	public void leisureSports() {
		System.out.println("한강에서 수상스키 투어");
	}
	@Override
	public void sightseeing() {
		System.out.println("경복궁 관람 투어");
	}
	@Override
	public void food() {
		System.out.println("전주 비빔밥 투어");
	}	
}
//기본 인터페이스를 구현한 JapanTour 클래스
class JapanTour implements Providable{
	@Override
	public void leisureSports() {
		System.out.println("도쿄타워 번지점프 투어");
	}
	@Override
	public void sightseeing() {
		System.out.println("오사카 관람 투어");
	}
	@Override
	public void food() {
		System.out.println("초밥 투어");
	}
}
//클래스간의 관계를 느슨하게 하기위한 중간 클래스
class TourGuide{
	//KoreaTour를 참조할 객체
	private Providable tour1=new KoreaTour();
	//JapanTour를 참조할 객체
	private Providable tour2=new JapanTour();
	//인터페이스로 타입 선언 -> 업캐스팅
	//인터페이스 참조변수를 통해 클래스끼리의 관계를 느슨하게 하기위해 업캐스팅 (시스템의 변경에 용이)
	public void leisureSports() {
		tour1.leisureSports();
		tour2.leisureSports();
	}
	public void sightseeing() {
		tour1.sightseeing();
		tour2.sightseeing();
	}
	public void food() {
		tour1.food();
		tour2.food();
	}
}






