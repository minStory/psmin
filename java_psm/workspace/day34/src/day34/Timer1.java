package day34;

import java.util.Timer;
import java.util.TimerTask;

public class Timer1 {

	public static void main(String[] args) throws InterruptedException {	//대기시간 동안 인터셉트 방지
		Timer t=new Timer(true);	//true -> 프로그램 종료 시 자동 소멸
		TimerTask w1=new Work1();
		TimerTask w2=new Work2();
		
		t.schedule(w1, 3000);
		t.schedule(w2, 1000);
		//스레드 사용
		Thread.sleep(4000);
		System.out.println("모든 작업 종료!");
		
		
	}

}
class Work1 extends TimerTask{
	public void run() {
		System.out.println("work1 실행");
	}
	
}
class Work2 extends TimerTask{
	public void run() {
		System.out.println("work2 실행");
	}
}