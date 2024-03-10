package day33;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Date2 {

	public static void main(String[] args) {
		Calendar a=Calendar.getInstance();	//싱글턴 패턴
		Calendar b=new GregorianCalendar();	//업캐스팅
		System.out.println(a.toString());
		System.out.println(b.toString());	//두 값이 같다
		//자바에서는 1월(MONTH)을 0으로 본다 -> +1 필요
	}

}
