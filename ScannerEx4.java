package scanner_스캐너.ex;

import java.util.Scanner;

public class ScannerEx4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("구구단의 단수를 입력해주세요 : ");
        int dan = scanner.nextInt();

        System.out.println(dan + " 의 구구단 :");
        for (int a = dan; a<=dan; a++){
            for (int b=1; b<=9; b++){
                System.out.println(a +" * "+ b + " = " + a*b);
            }
        }
    }
}
