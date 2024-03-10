package day44;

public class ShareBank {

	public static void main(String[] args) {
		ATM atm = new ATM();
		Thread mom = new Thread(atm, "엄마");
		Thread son = new Thread(atm, "아들");
		mom.start();
		son.start();
		//멀티스레드(동시 출금) 시 오류 발생 가능성 존재
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
	//방법 1) 키워드 사용하여 동기화 메서드 사용
	synchronized void withdraw(int money) {
		Thread.yield();
		this.money -= money;
		System.out.println(Thread.currentThread().getName() + "이(가)" + money + "원 출금");
	}
	void printInfo() {
		System.out.println("현재 금액 : " + this.money + "원");
	}
}