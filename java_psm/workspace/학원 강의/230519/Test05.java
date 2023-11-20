//�����ڿ��� �ٸ� ������ ȣ�� - this()
//���� Ŭ������ ����� ���� ���� ȣ���� ����, �����ڵ鵵 ���� ȣ���� ������
//������ ���� �ؾ���
//1. �������� �̸����� Ŭ�����̸� ��� this�� ����Ѵ�.
//2. �� �����ڿ��� �ٸ� �����ڸ� ȣ���� ���� �ݵ�� ù �ٿ����� ȣ���� �����ϴ�.
//	->������ ������ �ʱ�ȭ ���߿� �ٸ� �����ڸ� ȣ���ϸ� ȣ��� �ٸ� ������ �������� ��������� �ʱ�ȭ �� ���̹Ƿ�
//		�ٸ� �����ڸ� ȣ���ϱ� ������ �ʱ�ȭ �۾��� ���ǹ����� �� �ֱ� ����

//��ü �ڽ��� �ڸ�Ű�� �������� - this.Ŭ���� �� �ν��Ͻ�����
//color = color ������ �� �� ���������� ����
//�������� �Ű������� �ν��Ͻ� �������� �ʱⰪ�� ���� �޴� ��찡 ���� ������ �Ű�������
//�ν��Ͻ� ������ �̸��� ��ġ�ϴ� ��찡 ���� �ֱ� ����
//���� �̸��� �ٸ��� �ϴ� �� ���� this�� ����ؼ� �����ǵ��� �ϴ� ���� �ǹ̰� �� ��Ȯ�ϰ� �����ϱ� ����

//�ν��Ͻ� ������ ������ ���� static�޼���(Ŭ�����޼���) ������ �Ұ���
//Ŭ�����޼���� �ν��Ͻ��� �������� �ʰ� ȣ��� �� �����Ƿ�
//static�޼��尡 ȣ��� ������ �ν��Ͻ��� �������� ���� ���� �ֱ� ����

//this : �ν��Ͻ� �ڽ��� ����Ű�� ��������, �ν��Ͻ��� �ּҰ� ����Ǿ� �ִ�. ��� �ν��Ͻ��޼��忡 ���������� ������ ä�� ����
//this() , this(��������) : ������, ���� Ŭ������ �ٸ� �����ڸ� ȣ���� �� ���

package day_0519;

public class Test05 {

	public static void main(String[] args) {
		Car c1=new Car("red","auto",4);	//�Ű������� �ִ� ������ ���
		System.out.println(c1.color);
		System.out.println(c1.geartype);
		System.out.println(c1.door);
		
		Car c2=new Car();	//�⺻������ ���
//		c2.color="black";
//		c2.geartype="Manual";
//		c2.door=2;
		System.out.println(c2.color);
		System.out.println(c2.geartype);
		System.out.println(c2.door);
		
		Car c3=new Car("pink");	//�Ű����� color�� �ִ� ������ ���
		System.out.println(c3.color);
		System.out.println(c3.geartype);
		System.out.println(c3.door);
		
		Car c4=new Car(6);	//�Ű����� door�� �ִ� ������ ���
		System.out.println(c4.color);
		System.out.println(c4.geartype);
		System.out.println(c4.door);
	}

}
class Car {
	String color;	//����
	String geartype;	//���ӱ� ����
	int door;	//���� ����
	
	Car(){
		this("white","auto",4);	//Car(String c, String g, int d) ȣ��
	}
	Car(String color){
		this(color,"auto",4);	//Car(String c, String g, int d) ȣ��
	}
	Car(int d){
		this("purple","auto",d);
	}

//	Car(String color){
//		door=5;
//		Car(color,"auto",4);
//	}	//����1. �������� �ι�° �ٿ��� �ٸ� ������ ȣ��
//		//����2. this(color,"auto",4);

	Car(String c, String g, int d){	//�Ű������� �ִ� ������
		this.color=c;
		this.geartype=g;
		this.door=d;
	}
//	Car(){	//�⺻������ - �����ڰ� ���� �� �⺻������ �ڵ� �̻��� -> ���� ����	
//	}
}
