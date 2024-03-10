package day42;

public class Thread1 {
	//main문도 하나의 스레드
	public static void main(String[] args) {
		//JVM 스레드 요청
		//1) Thread 클래스 상속받은 클래스의 스레드를 요청
		MyThread th1=new MyThread();
		th1.start();
		
		//2) Runnable 인터페이스를 구현한 클래스의 스레드를 요청
		MyThread2 th2=new MyThread2();
		Thread t=new Thread(th2);	//Thread(Runnable target)
		t.start();
		
		for(int i=0 ; i<10 ; i++) {
			System.out.println("메인 함수 진행 중~"+(i+1));
		}
	}

}
//1) Thread 클래스 상속받아 작업을 구현
class MyThread extends Thread{
	//run()메서드 오버라이딩(재정의)
	public void run() {
		//스레드가 해야할 작업 구현
		for(int i=0 ; i<10 ; i++) {
			System.out.println("스레드 진행중 "+(i+1));
		}
	}
}
//2) Runnable 인터페이스를 구현하여 작업을 구현
class MyThread2 implements Runnable{
	//반드시 run()메서드 오버라이딩 필요(강제성)
	public void run() {
		for(int i=0 ; i<10 ; i++) {
			System.out.println("러너블 진행중"+(i+1));
		}
	}
}