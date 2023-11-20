package day_0602;

import java.util.Calendar;

public class Test04 {

	public static void main(String[] args) {
		Calendar a=Calendar.getInstance();
		
		int year=a.get(Calendar.YEAR);
		int month=a.get(Calendar.MONTH)+1;
		int date=a.get(Calendar.DATE);
		
		System.out.println(year+"년"+month+"월"+date+"일");
		System.out.println(a.get(Calendar.DAY_OF_WEEK));
		//1=일요일 2=월요일.. 7=토요일
		System.out.println("이번 년도에서 오늘이 몇 일째인가? : ");
		System.out.println(a.get(Calendar.DAY_OF_YEAR));
		//이번 년도의 며칠 인지
		System.out.println("이번 달은 며칠까지 있는가? : ");
		System.out.println(a.getActualMaximum(Calendar.DATE));
	}

}
