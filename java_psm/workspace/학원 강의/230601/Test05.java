package day_0601;

public class Test05 {

	public static void main(String[] args) {
		try {
			Exception e=new Exception("���� ����");
			Exception a=new Exception("���� ����2");
			throw a;
		}catch(Exception e) {
			System.out.println("���� �߻�");
			System.out.println(e.getMessage());
		}
	}

}
