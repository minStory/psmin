package day34;

import java.util.Timer;
import java.util.TimerTask;

public class Timer1 {

	public static void main(String[] args) throws InterruptedException {	//���ð� ���� ���ͼ�Ʈ ����
		Timer t=new Timer(true);	//true -> ���α׷� ���� �� �ڵ� �Ҹ�
		TimerTask w1=new Work1();
		TimerTask w2=new Work2();
		
		t.schedule(w1, 3000);
		t.schedule(w2, 1000);
		//������ ���
		Thread.sleep(4000);
		System.out.println("��� �۾� ����!");
		
		
	}

}
class Work1 extends TimerTask{
	public void run() {
		System.out.println("work1 ����");
	}
	
}
class Work2 extends TimerTask{
	public void run() {
		System.out.println("work2 ����");
	}
}