package scanner.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalCost = 0;
        while (true) {
            System.out.println("1: 상품입력, 2: 결제, 3: 프로그램 종료");
            int choice = sc.nextInt();
            if (choice == 1) {
                sc.nextLine();

                System.out.print("상품명을 입력하세요 : ");
                String productName = sc.nextLine();

                System.out.print("상품의 가격을 입력하세요 : ");
                int productCost = sc.nextInt();

                System.out.print("구매 수량을 입력하세요 : ");
                int productQuantity = sc.nextInt();

                totalCost += productCost * productQuantity;
                System.out.println("상품명 : " + productName + ", 가격 : " + productCost + ", 수량 : " + productQuantity + ", 합계 : " + productCost * productQuantity);
            } else if (choice == 2) {
                System.out.println("총 비용 : " + totalCost);
                totalCost = 0;
            } else if (choice == 3) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("올바른 옵션을 선택해주세요.");
            }
        }
    }
}