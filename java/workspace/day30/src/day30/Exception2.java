package day30;

public class Exception2 {

	public static void main(String[] args) {
		try {
			Exception e=new Exception("���� ����");
			throw e;	//���������� ���ܸ� �����ڴ�.(�߻�)
		}
		catch(Exception e) {
			System.err.println("���� �߻�");
			System.out.println(e.getMessage());
		}
	}

}
