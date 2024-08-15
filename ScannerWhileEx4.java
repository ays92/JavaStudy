package scanner_스캐너.ex;

import java.util.Scanner;

public class ScannerWhileEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int total = 0;

        while (true) {
            System.out.println("1 : 상품 입력, 2 : 결제, 3 : 프로그램 종료");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if(menu == 1){
                System.out.print("상품명을 입력하세요 : ");
                String name = scanner.nextLine();
                System.out.print("상품가격을 입력하세요 : ");
                int price = scanner.nextInt();
                scanner.nextLine();
                System.out.print("구매수량을 입력하세요 : ");
                int quantity = scanner.nextInt();
                scanner.nextLine();

                sum = price * quantity;
                System.out.println("상품명 : " + name + " 상품가격 : " + price + " 구매수량 : " + quantity + " 합계 : " + sum);
                total += sum;

            } else if (menu == 2) {
                System.out.println("총 비용 : " + total);
                total = 0; // 결제후에 다시 총 비용을 0으로 초기화한다
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다");
                break;
            } else {
                System.out.println("올바른 메뉴번호를 입력하세요");
            } 
        }
    }
}
