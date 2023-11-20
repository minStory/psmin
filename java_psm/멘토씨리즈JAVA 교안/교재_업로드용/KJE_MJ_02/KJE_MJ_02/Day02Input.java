package day02;
//1.준비물: 입력기능을 내코드에 연결시켜줘
import java.util.Scanner;
public class Day02Input {
	public static void main(String[] args) {
		//2.준비물: Scanner를 sc라는 이름으로 사용하겠다
		Scanner sc = new Scanner(System.in);
		//sc.next(): 문자열로 입력받아라-> 기능자체가 키보드로 입력한 입력값
//		System.out.println(sc.next());
		//sc.nextInt(): 정수값으로 입력받아라
//		System.out.println(sc.nextInt());
		//sc.nextFloat(): 실수형값으로 입력받아라
//		System.out.println(sc.nextFloat());
		System.out.println(sc.nextLine());
	}

}
