package day43;

public class Thread2 {

	public static void main(String[] args) {
		Runnable t=new MyThread3();	//업캐스팅 (굳이 안해도됨)
		Thread t1=new Thread(t,"thread1"); //new Thread(Runnable targer, String name)	스레드 이름 지정
		t1.setPriority(1);	//우선순위 1로 지정
		
		System.out.println("t1의 우선순위는 : "+t1.getPriority());
		
		Thread t2=new Thread(t,"thread2");
		//우선순위 지정 X -> 우선순위 : 5
		System.out.println("t2의 우선순위는 : "+t2.getPriority());
		
		Thread t3=new Thread(t,"thread3");
		t3.setPriority(10);
		System.out.println("t3의 우선순위는 : "+t3.getPriority());
		
		t1.start();
		t2.start();
		t3.start();
	}

}

class MyThread3 implements Runnable{

	@Override
	public void run() {
		for(int i=0 ; i<5 ; i++) {
			//스레드 지정한 이름으로 출력
			System.out.println("<"+Thread.currentThread().getName()+">");
		}
		for(int i=0 ; i<1000 ; i++) {}	//시간 지연 역할
	}
	
}