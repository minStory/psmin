package day35;

import java.math.BigDecimal;

public class BigDecimal1 {

	public static void main(String[] args) {
		//BigDecimal과 Double 사용의 정확성 비교
		double a=24.3953;
		double b=50.343998;
		System.out.println(a+b);
		
		BigDecimal num=new BigDecimal(String.valueOf(a));
		BigDecimal num2=new BigDecimal(String.valueOf(b));
		System.out.println(num.add(num2));
	}

}
