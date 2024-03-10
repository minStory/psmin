package parkseongmin;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//객체 배열 생성
		TV tvarr[] = new TV[3];	//TV클래스인 길이 3 객체 배열 선언
		for (int i = 0; i < 3; i++) {
			tvarr[i] = new TV();	//객체 배열의 인덱스마다 객체 생성 
		}
		
		for(int i=0 ; i<3 ; i++) {
			tvarr[i].color=sc.next();	//색상 입력
			tvarr[i].power=sc.nextBoolean();	//시동 여부 입력
			tvarr[i].channel=sc.nextInt();	//채널 번호 입력
		}
		
		for (int i = 0; i < 3; i++) {	//출력
			System.out.println(tvarr[i].color);
			System.out.println(tvarr[i].power);
			System.out.println(tvarr[i].channel);
		}
		
		//객체 생성
//		TV mytv;	//TV의 객체를 참조하기 위한 변수 선언
//		mytv=new TV();	//TV클래스의 객체 생성
		TV mytv = new TV(); // 변수선언 + 객체생성
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
		mytv.channel = 7; // TV객체의 멤버변수 channel에 7대입
		mytv.channelDown(); // TV객체의 메서드 channelDown() 호출 (메서드 사용)
		System.out.println("현재의 채널은 " + mytv.channel + "번 입니다.");
	}
}

class TV {
	// TV의 속성(멤버변수)
	String color;
	boolean power;
	int channel;

	// TV의 기능(메서드)
	void powerOn() {
		power = !power;
	} // TV를 켜거나 끄는 기능을 하는 메서드

	void channelUp() {
		channel++;
	} // TV의 채널을 올리는 메서드

	void channelDown() {
		channel--;
	} // TV의 채널을 내리는 메서드
}
