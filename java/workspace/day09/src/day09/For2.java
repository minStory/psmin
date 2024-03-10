package day09;

public class For2 {

	public static void main(String[] args) {
		//1~10까지의 합 출력
		int sum=0;
		for(int i=0 ; i<10 ; i++) {
			System.out.printf("i=%d, sum=%d\n",i+1,sum+=i+1);
		}
	}

}
