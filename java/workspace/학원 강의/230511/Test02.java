package parkseongmin;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//��ü �迭 ����
		TV tvarr[] = new TV[3];	//TVŬ������ ���� 3 ��ü �迭 ����
		for (int i = 0; i < 3; i++) {
			tvarr[i] = new TV();	//��ü �迭�� �ε������� ��ü ���� 
		}
		
		for(int i=0 ; i<3 ; i++) {
			tvarr[i].color=sc.next();	//���� �Է�
			tvarr[i].power=sc.nextBoolean();	//�õ� ���� �Է�
			tvarr[i].channel=sc.nextInt();	//ä�� ��ȣ �Է�
		}
		
		for (int i = 0; i < 3; i++) {	//���
			System.out.println(tvarr[i].color);
			System.out.println(tvarr[i].power);
			System.out.println(tvarr[i].channel);
		}
		
		//��ü ����
//		TV mytv;	//TV�� ��ü�� �����ϱ� ���� ���� ����
//		mytv=new TV();	//TVŬ������ ��ü ����
		TV mytv = new TV(); // �������� + ��ü����
		System.out.println();
		System.out.println(mytv.color);
		System.out.println(mytv.power);
		System.out.println(mytv.channel);
		mytv.powerOn();
		mytv.channelUp();
		mytv.color = "pink";
		System.out.println(mytv.color);
		System.out.println(mytv.power);
		System.out.println(mytv.channel);
		mytv.channel = 7; // TV��ü�� ������� channel�� 7����
		mytv.channelDown(); // TV��ü�� �޼��� channelDown() ȣ�� (�޼��� ���)
		System.out.println("������ ä���� " + mytv.channel + "�� �Դϴ�.");
	}
}

class TV {
	// TV�� �Ӽ�(�������)
	String color;
	boolean power;
	int channel;

	// TV�� ���(�޼���)
	void powerOn() {
		power = !power;
	} // TV�� �Ѱų� ���� ����� �ϴ� �޼���

	void channelUp() {
		channel++;
	} // TV�� ä���� �ø��� �޼���

	void channelDown() {
		channel--;
	} // TV�� ä���� ������ �޼���
}
