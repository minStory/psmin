package day32;

public class WrapperEx2 {

	public static void main(String[] args) {
		int i=30;
		Integer ii=new Integer(i);	//IntegerŸ�� ��ü ���� (���� X)
		System.out.println(ii);	//��ü ���
//		Integer i=3; 	//jdk9���� �̷��� ���
		
		double d=3.14;
		Double dd=new Double(d);
		System.out.println(dd);
	}

}
