package day23;

public class PhoneConstructor {

	public static void main(String[] args) {
		IPhone myphone1 = new IPhone();
		IPhone myphone2 = new IPhone("iphone SE", "white", 70);
		System.out.println(myphone1.model);
		System.out.println(myphone2.model);
		System.out.println(myphone1.color);
		System.out.println(myphone2.color);
		System.out.println(myphone1.capacity);
		System.out.println(myphone2.capacity);
	}
}
class IPhone {
	String model;
	String color;
	int capacity;

	IPhone() {	//default ������ ���� (���Է½� null �Ǵ� 0�� �����ϱ� ����)
	}

	IPhone(String model, String color, int capacity) {
		this.model = model;
		this.color = color;
		this.capacity = capacity;
	}

	void info() {
		System.out.println("model : " + model);
		System.out.println("color : " + color);
		System.out.println("capacity : " + capacity);
	}

}