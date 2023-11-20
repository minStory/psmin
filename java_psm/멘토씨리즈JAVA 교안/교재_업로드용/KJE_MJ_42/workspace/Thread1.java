package day42;

public class Thread1 {
	public static void main(String[] args) {
		MyThread t1= new MyThread();
		MyThread2 t2= new MyThread2();
		
		t1.start();
		
		Thread t= new Thread(t2);
		t.start();
		
		for(int i=0;i<10;i++) {
			System.out.println("main 진행 중 "+i);
		}
	}
}


class MyThread extends Thread{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Thread 진행 중 "+i);
		}
	}
}
class MyThread2 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Runnable 진행 중 "+i);
		}
	}
	
}