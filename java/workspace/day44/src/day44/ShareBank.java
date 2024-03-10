package day44;

public class ShareBank {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm, "����");
		Thread son = new Thread(atm, "�Ƶ�");
		mom.start();
		son.start();
		//��Ƽ������(���� ���) �� ���� �߻� ���ɼ� ����
	}
}
class ATM implements Runnable {
	int money = 100000;
	@Override
	public void run() {
		for (int i = 0; i < 50; i++) {
			withdraw(1000);
			printInfo();
			try {
				Thread.sleep(100);
			} catch (Exception e) {}
		}
	}
	//��� 1) Ű���� ����Ͽ� ����ȭ �޼��� ���
	synchronized void withdraw(int money) {
		Thread.yield();
		this.money -= money;
		System.out.println(Thread.currentThread().getName() + "��(��)" + money + "�� ���");
	}
	void printInfo() {
		System.out.println("���� �ݾ� : " + this.money + "��");
	}
}