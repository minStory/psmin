package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("-----------------------------------");
            System.out.println("1.입금 | 2.출금 | 3.잔액 확인 | 4.종료");
            System.out.println("-----------------------------------");
            System.out.print("선택: ");
            int choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("입금액을 입력하세요: ");
                int deposit = sc.nextInt();
                balance = deposit(balance, deposit);
            } else if (choice == 2) {
                System.out.print("출금액을 입력하세요: ");
                int withdraw = sc.nextInt();
                balance = withdraw(balance, withdraw);
            } else if (choice == 3) {
                System.out.println("현재 잔액: " + balance + "원");
            } else if (choice == 4) {
                System.out.println("프로그램을 종료합니다.");
                break;
            } else {
                System.out.println("잘못입력하셨습니다.");
            }
        }
    }

    public static int deposit(int balance, int money){
        balance += money;
        System.out.println(money + "원을 입금하였습니다. 현재 잔액: " + balance + "원");
        return balance;
    }

    public static int withdraw(int balance, int money) {
        if (balance >= money) {
            balance -= money;
            System.out.println(money + "원을 출금하였습니다. 현재 잔액: " + balance + "원");
        } else {
            System.out.println(money + "원을 출금하려 했으나 잔액이 부족합니다.");
        }
        return balance;
    }
}
