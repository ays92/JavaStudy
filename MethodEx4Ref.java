package method.ex;

import java.util.Scanner;

public class MethodEx4Ref {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int balance = 0;

        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액확인 | 4. 종료");
            System.out.println("--------------------------------------");
            System.out.print("선택 : ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("입금액을 입력하세요 : ");
                int deposit = scanner.nextInt();
                balance = in(balance, deposit);
                System.out.println(deposit + "원이 입금되었습니다. 현재 금액은 " + balance + " 원 입니다");
            }
            else if (menu == 2) {
                System.out.print("출금액을 입력하세요 : ");
                int withdraw = scanner.nextInt();
                balance = out(balance, withdraw);
            }
            else if (menu == 3) {
                now(balance);
            }
             else if (menu == 4) {
                System.out.println("시스템을 종료합니다");
                break;
            }
        }
    }

    // 입금
    public static int in(int balance, int deposit) {
        balance += deposit;
        return balance;
    }
    // 출금
    public static int out(int balance, int withdraw) {
        if (balance < withdraw) {
            System.out.println("출금잔액이 부족합니다 현재 잔액은 " + balance + " 원 입니다");
        } else {
            balance -= withdraw;
            System.out.println(withdraw + " 원을 출금하였습니다. 현재 잔액은 " + balance + "원 입니다");
        }
        return balance;
    }
    // 조회
    public static void now(int balance){
        System.out.println("현재 잔액은 " + balance + " 원 입니다");
    }
}