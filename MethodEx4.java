package method.ex;

import java.util.Scanner;

public class MethodEx4 {
    public static void main(String[] args) {
        int balance = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------------------------");
            System.out.println("1. 입금 | 2. 출금 | 3. 잔액확인 | 4. 종료");
            System.out.println("--------------------------------------");
            System.out.print("선택 : ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("입금액을 입력하세요 : ");
                int deposit = scanner.nextInt();
                balance = deposit;
                System.out.println(deposit + " 원을 입금하였습니다. 현재 잔액은 " + balance + "원 입니다");

            } else if (menu == 2) {
                System.out.print("출금액을 입력하세요 : ");
                int withdraw = scanner.nextInt();
                if (balance < withdraw){
                    System.out.println("출금잔액이 부족합니다 현재 잔액은 " + balance + " 원 입니다");
                    continue;
                }
                balance = balance - withdraw;
                System.out.println(withdraw + " 원을 출금하였습니다. 현재 잔액은 " + balance + "원 입니다");

            } else if (menu == 3) {
                System.out.println("현재 잔액 : " + balance);
            } else if (menu == 4) {
                System.out.println("시스템을 종료합니다");
                break;
            }
        }
    }
}