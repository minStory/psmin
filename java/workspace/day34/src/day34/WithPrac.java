package day34;

import java.time.LocalDate;

public class WithPrac {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
																			//withDayOfMonth로 해야 8월 23일로 변경
		LocalDate newLd=ld.withYear(1999).withMonth(8).withDayOfYear(23);	//withDayOfYear 사용하여 년도를 기준으로 재변경
		System.out.println(newLd);
	}

}
