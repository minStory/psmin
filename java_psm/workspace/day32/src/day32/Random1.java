package day32;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		Random ran=new Random();		//seed : ����ð�
		Random ran1=new Random();	//seed : ����ð�
		Random ran2=new Random(2);	//seed : 2
		Random ran3=new Random(2);	//seed : 2
		System.out.println(System.currentTimeMillis());
		for(int i=0 ; i<5 ; i++) {
			System.out.println("random : "+i+"��° �� : "+ran.nextInt(10));	//~���� ���
		}
		for(int i=0 ; i<5 ; i++) {
			System.out.println("random1 : "+i+"��° �� : "+ran1.nextInt(10));
		}
		for(int i=0 ; i<5 ; i++) {
			System.out.println("random2 : "+i+"��° �� : "+ran2.nextInt(10));		//seed���� ������ ���ϰ� ���
		}
		for(int i=0 ; i<5 ; i++) {
			System.out.println("random3 : "+i+"��° �� : "+ran3.nextInt(10));
		}
		
	}

}
