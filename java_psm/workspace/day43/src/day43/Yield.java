package day43;

public class Yield {

	public static void main(String[] args) {
		MyThread4 s1=new MyThread4();
		MyThread5 s2=new MyThread5();
		Thread t1=new Thread(s1);
		Thread t2=new Thread(s2);
		t1.start();
		t2.start();
	}
}
class MyThread4 implements Runnable {
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			System.out.print("★");
			Thread.yield();		//자신에게 주어진 시간 양보
		}
	}
}
class MyThread5 implements Runnable{
	@Override
	public void run() {
		for(int i=0 ; i<30 ; i++) {
			System.out.print("☆");
		}
	}
}