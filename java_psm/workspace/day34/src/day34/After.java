package day34;

import java.time.LocalDateTime;

public class After {

	public static void main(String[] args) {
		LocalDateTime ldt=LocalDateTime.now();
		System.out.println(ldt);
		
		LocalDateTime endTime=LocalDateTime.of(2017, 6,24,12,00);
		System.out.println(endTime);
		
		if(ldt.isAfter(endTime)) {
			System.out.println("유통기한이 지났습니다.");
		}
		else {
			System.out.println("유통기한이 아직 지나지 않았습니다.");
		}
	}

}
