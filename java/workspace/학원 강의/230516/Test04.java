package day_0516;

public class Test04 {

	public static void main(String[] args) {
		Order orderA = new Order();
		orderA.orderNum = "201907210001";
		orderA.id = "abc123";
		orderA.date = "2019년 7월 21일";
		orderA.name = "홍길동";
		orderA.productNum = "PD-345-12";
		orderA.adress = "서울시 영등포구 여의도동 20번지";
		orderA.orderPrint();
	}

}

class Order {
	String orderNum;
	String id;
	String date;
	String name;
	String productNum;
	String adress;

	void orderPrint() { // 출력메서드
		System.out.println("주문 번호 : " + orderNum);
		System.out.println("주문자 ID : " + id);
		System.out.println("주문 날짜 : " + date);
		System.out.println("주문자 이름 : " + name);
		System.out.println("주문 상품 번호 : " + productNum);
		System.out.println("배송 주소 : " + adress);
	}
}

//Q2j.아래 내용을 클래스로 구현하세요
//
//쇼핑몰에 주문이 들어왔습니다. 주문 내용은 다음과 같습니다.
//
//주문번호 : 201907210001
//주문자 아이디 : abc123
//주문 날짜 : 2019년 7월 21일
//주문자 이름 : 홍길순
//주문 상품 번호 : PD-345-12
//배송 주소 : 서울시 영등포구 여의도동 20번지
//
//위 주문 내용을 구현할 수 있는 클래스를 만들고 인스턴스로 생성한 후 위와 같은 형식으로 출력해보세요.