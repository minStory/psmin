package array.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maxProducts = 10;
//        String[][] product = new String[2][10];
        String[] product = new String[maxProducts];
        int[] price = new int[maxProducts];

        int count = 0;
        while (true) {
            System.out.print("1. 상품 등록 | 2. 상품 목록 | 3. 종료\n메뉴를 선택하세요:");
            int choice = sc.nextInt();
            sc.nextLine();
            if (choice == 1) {
                if (count >= maxProducts) {
                    System.out.println("더 이상 상품을 등록할 수 없습니다.");
                    continue;
                }
                System.out.print("상품 이름을 입력하세요:");
                product[count] = sc.nextLine();
                System.out.print("상품 가격을 입력하세요:");
                price[count] = sc.nextInt();
                count++;
            } else if (choice == 2) {
                if (count == 0) {
                    System.out.println("등록된 상품이 없습니다.");
                    continue;
                }
                for (int i = 0; i < count; i++) {
                    System.out.println(product[i] + ": " + price[i] + "원");
                }
            } else if (choice == 3) {
                System.out.println("프로그램 종료");
                break;
            } else {
                System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        }
    }
}