package day43;

public class Sleep {

	public static void main(String[] args) {
		SleepThread t=new SleepThread();
		t.start();
	}
}

class SleepThread extends Thread{
	public void run() {
		System.out.println("카운트 다운 5초");
		for(int i=5 ; i>=0 ; i--) {
			System.out.println(i);
			if(i!=0) {
				try {	//try,catch문 같이 사용하여 예외처리할 것
					Thread.sleep(1000);	//해당 시간동안 block상태로 만들기 (1000당 1초)
				}
				catch(InterruptedException ie) {
					System.out.println(ie.toString());
				}
			}
		}
		System.out.println("종료!");
	}
}