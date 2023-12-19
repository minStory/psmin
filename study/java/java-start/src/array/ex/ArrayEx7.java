package array.ex;

import java.util.Scanner;

public class ArrayEx7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[4][3];
        String[] subjects = {"국어", "영어", "수학"};

        for(int i = 0; i < arr.length; i++){
            System.out.println((i+1)+"번 학생의 성적을 입력하세요.");
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(subjects[j] + " 점수:");
                arr[i][j] = sc.nextInt();

            }
        }

        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            double avg = (double) sum / arr[i].length;
            System.out.println((i+1)+"번 학생의 총점:" + sum + ", 평균:" + avg);
        }
    }
}
