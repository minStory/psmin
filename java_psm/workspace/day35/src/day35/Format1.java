package day35;

import java.text.DecimalFormat;

public class Format1 {

	public static void main(String[] args) {
		//#은 없으면 생략, 0은 없으면 0으로 출력
		String pattern[] = { "###.###", "000.000", "-###.###", "000000.00%" };
		double arr[] = { 1.3, 3.33, 124, 243, 242 };

		for (int p = 0; p < pattern.length; p++) {
			DecimalFormat d=new DecimalFormat(pattern[p]);
			System.out.println("<<<<"+pattern[p]+">>>>");
			for(int i=0 ; i<arr.length ; i++) {
				System.out.println(d.format(arr[i]));
			}
		}
	}
}
