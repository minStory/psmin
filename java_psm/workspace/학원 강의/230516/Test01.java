package day_0516;

public class Test01 {
	public static void main(String[] args) {
		 Car mycar1=new Car();	//�ν��Ͻ� ����1 ����
		 Car mycar2=new Car();	//�ν��Ͻ� ����2 ����
		 mycar1.color="red";	//�ν��Ͻ�1 ���� ����
		 mycar2.color="black";	//�ν��Ͻ�2 ���� ����
		 mycar1.speedUp();	//�ν��Ͻ�1 �ӵ� up
		 mycar2.wiper();	//�ν��Ͻ�2 ������ �ѱ�
		 
		 System.out.println("mycar1�� �� : "+mycar1.color);
		 System.out.println("mycar2�� �� : "+mycar2.color);
		 System.out.println("mycar1�� �ӵ� : "+mycar1.speed);
		 System.out.println("mycar2�� �ӵ� : "+mycar2.speed);
		 System.out.println("mycar1�� ������ �۵� ���� : "+mycar1.wiper);
		 System.out.println("mycar2�� ������ �۵� ���� : "+mycar2.wiper);
	}
	
}
class Car{
	boolean power;	//�õ�
	String color;	//����
	int wheel;	//������ ��
	int speed;	//�ӵ�
	boolean wiper;	//������
	
	void power() { power=!power;}	//�õ� �ѱ�<-->���� �޼���
	void speedUp() {speed++;}	//�ӵ� up �޼���
	void speedDown() {speed--;}	//�ӵ� down	�޼���
	void wiper() {wiper=!wiper;}	//������ �ѱ�<-->���� �޼���
}
