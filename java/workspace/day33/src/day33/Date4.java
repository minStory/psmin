package day33;

import java.util.Calendar;

public class Date4 {

	public static void main(String[] args) {
		Calendar today=Calendar.getInstance();
		Calendar endOfYear=Calendar.getInstance();
		Calendar christmas=Calendar.getInstance();
		
		endOfYear.set(Calendar.MONTH,11);	//month : 12월
		endOfYear.set(Calendar.DATE,31);	//date : 31일
		long diff=endOfYear.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("연말까지 남은 날 : "+diff/(24*60*60*1000)+"일");	//1000분의1초에서 *1000 *60초 *60분 *24시
		
		christmas.set(2023, 11, 25);
		diff=christmas.getTimeInMillis()-today.getTimeInMillis();
		System.out.println("크리스마스까지 남은 날 : "+diff/(24*60*60*1000)+"일");
				
		}

}
