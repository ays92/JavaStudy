package array_배열.ex;

import java.util.Scanner;

public class ProductAdminEx {
    public static void main(String[] args) {
        int maxProducts = 10;
        String[] productNames = new String[maxProducts];
        int[] productPrices = new int[maxProducts];
        int productCount = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("1. 상품등록 | 2. 상품목록 | 3. 종료\n 메뉴를 선택하세요 : ");
            int menu = scanner.nextInt();
            scanner.nextLine();

            if (menu == 1){
                if (productCount > maxProducts){
                    System.out.println("더이상 상품을 등록할수 없습니다");
                    continue; // 끊기는게 아니라 다시 while 문으로 돌아가는것
                }

                System.out.print("상품이름을 입력하세요 : ");
                productNames[productCount] = scanner.nextLine();

                System.out.print("상품가격을 입력하세요 : ");
                productPrices[productCount] = scanner.nextInt();

                productCount++;

            } else if (menu == 2) {

                if (productCount == 0){
                    System.out.println("등록된 상품이 없습니다");
                    continue;
                }
                for (int i = 0; i < productCount; i++) {
                    System.out.println(productNames[i] + " : " + productPrices[i] + " 원");
                }
                
            } else if (menu == 3) {
                System.out.println("프로그램을 종료합니다");
                break;

            } else {
                System.out.println("잘못 입력하였습니다");
            }

        }



    }
}
