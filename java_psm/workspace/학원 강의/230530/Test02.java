package day_0530;

public class Test02 {

	public static void main(String[] args) {
		//Tv Ÿ��
		Tv t=new Tv();
		
		//SmartTv Ÿ��
		SmartTv st=new SmartTv();	//�θ�+�ڼ�Ŭ������ ��� ��� ����
		Tv t1=new SmartTv();	//�ڼ�Ŭ������ SmartTv�� ��� ��� �Ұ�
		
//		SmartTv ss=new Tv(); -> �ν��Ͻ�Tv ��� �������� �������� ss�� ����� �� �ִ� ��� ������ �� ���Ƽ� ���� �߻�
		
		//����Ÿ���� ���������� �ڼ�Ÿ���� �ν��Ͻ��� ������ �� �ִ�.
		//�ݴ�� �ڼ�Ÿ���� ���������� ����Ÿ���� �ν��Ͻ��� ������ ���� ����.
	}

}

class Tv{
	boolean power;
	int channel;
	
	void power() { power = !power;}
	void channelUp() { channel++;}
	void channelDown() { channel--;}
}
class SmartTv extends Tv{
	String text;
	void caption() {}
}