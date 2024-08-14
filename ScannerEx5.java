package scanner_스캐너.ex;

import java.util.Scanner;

public class ScannerEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("첫번째 숫자를 입력하세요 :");
        int num1 = scanner.nextInt();

        System.out.print("두번째 숫자를 입력하세요 :");
        int num2 = scanner.nextInt();
        int i = 0;

        if (num1 > num2){
            int temp = 0;
            temp = num1;
            num1 = num2;
            num2 = temp;
        }
        System.out.print("둘 사이의 모든 정수 : ");

        for (i= num1; i <= num2; i++){
            System.out.print(i);
            if(i != num2){
                System.out.print(",");
            }
        }
    }
}
