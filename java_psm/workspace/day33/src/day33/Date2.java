package day33;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date2 {

	public static void main(String[] args) {
		Calendar a=Calendar.getInstance();	//�̱��� ����
		Calendar b=new GregorianCalendar();	//��ĳ����
		System.out.println(a.toString());
		System.out.println(b.toString());	//�� ���� ����
		//�ڹٿ����� 1��(MONTH)�� 0���� ���� -> +1 �ʿ�
	}

}
