package scanner_스캐너.ex;

import java.util.Scanner;

public class ScannerEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("음식 이름을 입력해주세요 : ");
        String name = scanner.nextLine();

        System.out.println("음식 가격을 입력해주세요 : ");
        int price = scanner.nextInt();

        System.out.println("음식 수량을 입력해주세요 : ");
        int number = scanner.nextInt();

        int sum = number * price;
        System.out.println(name + number + "개를 주문하셨습니다. 총 가격은 " +sum+ " 입니다");
    }
}
