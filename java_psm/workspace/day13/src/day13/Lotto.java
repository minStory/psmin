package day13;

import java.util.*;		//Random Ŭ������ Scanner Ŭ���� 2�� �ʿ��ϹǷ� ��� Ŭ������ *�� ���

public class Lotto {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Random random=new Random();
		
		int lotto[]=new int[6];
		int user[]=new int[6];
		int cnt=0;
		int lottoBonus=0;
		int userBonus=0;
		
		lottoBonus=random.nextInt(45)+1;		//���ʽ� ��ȣ ����
		
		for(int i=0 ; i<lotto.length ; i++) {	//�ζǹ�ȣ ���� ����
			lotto[i]=random.nextInt(45)+1;
			for(int j=0 ; j<i ; j++) {			//���� ��ȣ ������ �ٽ� ����
				if(lotto[i]==lotto[j] || lottoBonus==lotto[j]) {
					i--;
					break;
				}
			}
		}
		System.out.println("�ζ� ��ȣ : "+Arrays.toString(lotto)+" ���ʽ� : "+lottoBonus);
		System.out.println("�ζ� ��ȣ�� �Է��ϼ��� : ");
		for(int i=0 ; i<user.length ; i++) {	//����� �ζ� ��ȣ �Է�
			user[i]=sc.nextInt();
				}
		for(int i=0 ; i<user.length ; i++) {	//�ζǹ�ȣ�� ����ڹ�ȣ ��
			for(int j=0 ; j<lotto.length ; j++) {
				if(user[i]==lotto[j]) {			//��ȣ�� ��ġ�� �� ���� ���� ī����
					cnt++;
				}
			}
			if(user[i]==lottoBonus) {		//���ʽ���ȣ ������ �� ���ʽ��� ī����
				userBonus++;
			}
		}
		if(cnt==6) {
			System.out.println("1���Դϴ�.");
		}
		else if(cnt==5&&userBonus==1) {
			System.out.println("2���Դϴ�.");
		}
		else if(cnt==5) {
			System.out.println("3���Դϴ�.");
		}
		else if(cnt==4) {
			System.out.println("4���Դϴ�.");
		}
		else if(cnt==3) {
			System.out.println("5���Դϴ�.");
		}
		else {
			System.out.println("��");
		}
	}
}
