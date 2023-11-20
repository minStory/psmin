package day34;

import java.time.LocalDate;

public class Leap {

	public static void main(String[] args) {
		LocalDate ld=LocalDate.now();
		LocalDate newLd;
		int count=0;
		
		for(int i=1900 ; i<2100 ; i++) {
			newLd=ld.withYear(i);
			if(newLd.isLeapYear()) {
				System.out.println(newLd.getYear()+"���� �����Դϴ�.");
				count++;
			}
		}
		System.out.println("1900�� ���� 2100�� ���� ������ �� "+count+"�� �ֽ��ϴ�.");
	}

}
