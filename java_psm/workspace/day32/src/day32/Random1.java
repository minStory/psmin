package day32;

import java.util.Random;

public class Random1 {

	public static void main(String[] args) {
		Random ran=new Random();		//seed : 현재시간
		Random ran1=new Random();	//seed : 현재시간
		Random ran2=new Random(2);	//seed : 2
		Random ran3=new Random(2);	//seed : 2
		System.out.println(System.currentTimeMillis());
		for(int i=0 ; i<5 ; i++) {
			System.out.println("random : "+i+"번째 값 : "+ran.nextInt(10));	//~까지 출력
		}
		for(int i=0 ; i<5 ; i++) {
			System.out.println("random1 : "+i+"번째 값 : "+ran1.nextInt(10));
		}
		for(int i=0 ; i<5 ; i++) {
			System.out.println("random2 : "+i+"번째 값 : "+ran2.nextInt(10));		//seed값이 같으면 동일값 출력
		}
		for(int i=0 ; i<5 ; i++) {
			System.out.println("random3 : "+i+"번째 값 : "+ran3.nextInt(10));
		}
		
	}

}
