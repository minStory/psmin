//�������� super : �ڼ�Ŭ�������� ����Ŭ�����κ��� ��ӹ��� ����� �����ϴµ� ���Ǵ� ��������
//��������� ���������� this�� ����
//��ӹ��� ����� �ڽ��� ����� super�� ����

package day_0523;

public class Test05 {

	public static void main(String[] args) {
		SportsCar mycar=new SportsCar("red",330);
		
		System.out.println(mycar.color);
		System.out.println(mycar.speedLimit);
	}

}
class Car{
	int wheel;
	int speed;
	String color;
	Car(){
		
	}
	
	Car(String color){
		this.color=color;
	}
}
class SportsCar extends Car{
	int speedLimit;
	
	SportsCar(String color,int speedLimit){
//		super(color);
		this.color=color;
		this.speedLimit=speedLimit;
	}
}
