package day33;

import java.util.Calendar;

public class Date4 {

	public static void main(String[] args) {
		Calendar today=Calendar.getInstance();
		Calendar endOfYear=Calendar.getInstance();
		Calendar christmas=Calendar.getInstance();
		
		endOfYear.set(Calendar.MONTH,11);	//month : 12��
		endOfYear.set(Calendar.DATE,31);	//date : 31��
		long diff=endOfYear.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("�������� ���� �� : "+diff/(24*60*60*1000)+"��");	//1000����1�ʿ��� *1000 *60�� *60�� *24��
		
		christmas.set(2023, 11, 25);
		diff=christmas.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("ũ������������ ���� �� : "+diff/(24*60*60*1000)+"��");
				
		}

}
