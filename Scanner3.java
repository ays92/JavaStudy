package scanner_스캐너;

import java.util.Scanner;

public class Scanner3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("첫번째수를 입력하세요 : ");
        int a = scanner.nextInt();

        System.out.print("두번째수를 입력하세요 : ");
        int b = scanner.nextInt();

        if(a>b){
            System.out.println("더 큰숫자는 : " + a);
        } else if (a<b){
            System.out.println("더 큰숫자는 : " + b);
        } else {
            System.out.println("두 숫자는 같습니다");
        }
    }
}
