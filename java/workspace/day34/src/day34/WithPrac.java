package day34;

import java.time.LocalDate;

public class WithPrac {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		System.out.println(ld);
																			//withDayOfMonth�� �ؾ� 8�� 23�Ϸ� ����
		LocalDate newLd=ld.withYear(1999).withMonth(8).withDayOfYear(23);	//withDayOfYear ����Ͽ� �⵵�� �������� �纯��
		System.out.println(newLd);
	}

}
