package day05;

public class PrintStackGetMessage {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
		System.out.println(3);
		System.out.println(0/0);
		//ArithmeticException �ν��Ͻ� : ����ó�� Ŭ���� ȣ��Ǹ鼭 �ν��Ͻ� ����
		//e.printStackTrace(); // ArithmeticException >RuntimeException
		}catch(ArithmeticException e) {
			//�޼����� ������ �޽��� ���
			e.printStackTrace(); //����ó�� Ŭ������ �����ؼ� �ش� �޼��带 ȣ���ϴ� ��
			//������ �޽����� ���ͼ� ���
			System.out.println("���� �޽��� : "+e.getMessage());
		}
		System.out.println(6);
	}

}
