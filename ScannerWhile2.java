package scanner_스캐너;

import java.util.Scanner;

public class ScannerWhile2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("첫번째 숫자와 두번째 숫자 모두 0을 입력하면 종료됩니다");
            System.out.print("첫번째 수를 입력하세요 : ");
            int a = scanner.nextInt();
            System.out.print("두번쨰 수를 입력하세요 : ");
            int b = scanner.nextInt();

            if (a==0 && b==0){
                System.out.println("프로그램을 종료합니다");
                break;
            }
            System.out.println("두 수의 합은 : " + (a+b));
        }
    }
}