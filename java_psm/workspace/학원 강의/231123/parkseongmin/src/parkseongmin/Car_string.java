package parkseongmin;

public class Car_string {
	//자동차 이름
	private String carName;
	//자동차 회사
	private String company;
	
	public Car_string(String carName, String company) {
		this.carName = carName;
		this.company = company;
	}
	
	public String toString() {
		return "carName : "+this.carName+", Company : "+this.company;
	}
	
	//toString() 오버라이딩 클래스.toString() -> 차량이름 이름 : 소나타, 제조사 : 현대
}
