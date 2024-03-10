package day02;
//1.준비물 : 입력기능을 내 코드에 연결시켜줘
import java.util.Scanner;
public class Day02input {

	public static void main(String[] args) {
		// 2. 준비물 : Scanner를 sc라는 이름으로 사용하겠다.
		Scanner sc = new Scanner(System.in);
	
		System.out.println(sc.next());		//sc.next(); /문자열로 입력받아라
		//-> 기능 자체가 키보드로 입력한 입력값
		System.out.println(sc.nextInt());	//sc.nextInt(); 정수값으로 입력받아라
		System.out.println(sc.nextFloat());	//sc.nextFloat(); 실수값으로 입력받아라
		System.out.println(sc.nextLine());		//sc.nextLine(); 문자열의 공백까지 입력받아라
	}

}
