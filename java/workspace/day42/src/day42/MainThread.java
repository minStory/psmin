package day42;

public class MainThread {

	public static void main(String[] args) {
		//main�� �ϳ��� ������
		System.out.println("���� ����ǰ� �ִ� �������� �̸� : "+Thread.currentThread().getName());
		System.out.println("���� ����ǰ� �ִ� �������� ���� : "+Thread.currentThread().getState());
		System.out.println("���� ����ǰ� �ִ� �������� �켱���� : "+Thread.currentThread().getPriority());
	}

}
