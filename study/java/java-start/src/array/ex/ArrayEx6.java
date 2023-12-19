package array.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("입력 받을 숫자의 개수 입력: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        int minNumber,maxNumber;
        System.out.println(n + "개의 정수를 입력하세요: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        minNumber = maxNumber = arr[0];
        for (int i : arr) {
            if (i < minNumber) {
                minNumber = i;
            }
            if (i > maxNumber) {
                maxNumber = i;
            }
        }

        System.out.println("minNumber = " + minNumber);
        System.out.println("maxNumber = " + maxNumber);
    }
}
