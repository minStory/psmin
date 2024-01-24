package poly.ex.pay0;

import java.util.Scanner;

public class PayMain1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PayService payService = new PayService();

        while (true) {
            System.out.print("결제수단을 입력하세요: ");
            String payOption = sc.nextLine();

            if (payOption.equals("exit")) {
                System.out.println("프로그램을 종료합니다.");
                return;
            }

            System.out.print("결제금액을 입력하세요: ");
            int amount = sc.nextInt();
            sc.nextLine();
            payService.processPay(payOption, amount);
        }
    }
}