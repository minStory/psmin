package day_0602;

import java.util.Calendar;

public class Test04 {

	public static void main(String[] args) {
		Calendar a=Calendar.getInstance();
		
		int year=a.get(Calendar.YEAR);
		int month=a.get(Calendar.MONTH)+1;
		int date=a.get(Calendar.DATE);
		
		System.out.println(year+"��"+month+"��"+date+"��");
		System.out.println(a.get(Calendar.DAY_OF_WEEK));
		//1=�Ͽ��� 2=������.. 7=�����
		System.out.println("�̹� �⵵���� ������ �� ��°�ΰ�? : ");
		System.out.println(a.get(Calendar.DAY_OF_YEAR));
		//�̹� �⵵�� ��ĥ ����
		System.out.println("�̹� ���� ��ĥ���� �ִ°�? : ");
		System.out.println(a.getActualMaximum(Calendar.DATE));
	}

}
