package day14;

import java.util.Scanner;

public class Array3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int stScore[][] = new int[4][3];
		String subject[] = { "국어", "영어", "수학" };

		for (int i = 0; i < 4; i++) {
			System.out.println(i + 1 + "번 학생 점수----");
			for (int j = 0; j < 3; j++) {
				System.out.print(subject[j] + " : ");
				stScore[i][j] = sc.nextInt();
			}
		}
		for (int i = 0; i < 3; i++) {
			System.out.print("\t" + subject[i]);
		}
		System.out.println();
		for (int i = 0; i < 4; i++) {
			System.out.print(i + 1 + "번 :\t");
			for (int j = 0; j < 3; j++) {
				System.out.print(stScore[i][j] + "\t");
			}
			System.out.println();
		}

	}

}