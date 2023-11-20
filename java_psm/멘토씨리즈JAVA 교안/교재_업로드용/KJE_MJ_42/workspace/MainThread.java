package day42;

public class MainThread {
	public static void main(String[] args) {
		Thread3 t3= new Thread3();
		t3.start();
		
		System.out.println("Thread Name:"+Thread.currentThread().getName());	
		System.out.println("Thread state:"+Thread.currentThread().getState());
		System.out.println("Thread priority:"+Thread.currentThread().getPriority());
		
	}	
}

class Thread3 extends Thread{
	public void run() {
		this.setName("Thread3");
		System.out.println("Thread Name:"+Thread.currentThread().getName());
		System.out.println("Thread state:"+Thread.currentThread().getState());
		System.out.println("Thread priority:"+Thread.currentThread().getPriority());
	}
}
