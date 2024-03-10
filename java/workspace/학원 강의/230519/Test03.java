package day_0519;

public class Test03 {

	public static void main(String[] args) {
//		Cellphone myphone1=new Cellophone();

		Cellphone myphone = new Cellphone("Silver", 64);
		System.out.println(myphone.model);
		System.out.println(myphone.color);
		System.out.println(myphone.capacity);
	}

}

class Cellphone {
	String model = "Galaxy B";
	String color;
	int capacity;

	Cellphone(String color, int capacity) {
		this.color = color;
		this.capacity = capacity;
	}
}
