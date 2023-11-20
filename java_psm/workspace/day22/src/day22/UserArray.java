package day22;

import java.util.Scanner;

public class UserArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User ar[] = new User[4];	//4칸짜리 배열 생성

		for (int i = 0; i < 4; i++) {
			ar[i] = new User();	//각 칸의 객체정보 생성
			System.out.print(i + 1 + "번째 User 이름 : ");
			ar[i].name = sc.next();
			System.out.print(i + 1 + "번째 User 전화번호 : ");
			ar[i].phone = sc.next();
			System.out.print(i + 1 + "번째 User 나이 : ");
			ar[i].age = sc.nextInt();
			System.out.print(i + 1 + "번째 User 성별 : ");
			ar[i].gender = sc.next();
		}
		for (int i = 0; i < 4; i++) {
			ar[i].info();
		}
	}

}

class User {
	String name;
	String phone;
	int age;
	String gender;

	void info() {
		System.out.println("----------회원정보----------");
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phone);
		System.out.println("나이 : " + age);
		System.out.println("성별 : " + gender);
	}
}