package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = 0;
        int sum = 0;
        int count = 0;
        System.out.println("숫자를 입력하세요(-1 입력하면 종료) : ");
//        while (true) {
//            int num = sc.nextInt();
//            if (num == -1) {
//                double avg = (double) sum / count;
//                System.out.println("sum = " + sum);
//                System.out.println("avg = " + avg);
//                break;
//            }
//            sum += num;
//            count++;
//        }
        while((num = sc.nextInt()) != -1){
            sum += num;
            count++;
        }
        double avg = (double) sum / count;
        System.out.println("sum = " + sum);
        System.out.println("avg = " + avg);
    }
}
