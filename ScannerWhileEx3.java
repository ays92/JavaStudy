package scanner_스캐너.ex;

import java.util.Scanner;

public class ScannerWhileEx3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum =0;
        int count = 0;
        int number = 0;
        System.out.print("숫자를 입력하세요. 입력을 중단하려면 -1을 입력하세요 : ");

        while (true) {
            number = scanner.nextInt();

            if (number == -1) {
                break;
            } //-1을 입력하면 프로그램을 중단시켜야 하므로 if문에는 break만 들어가는것이 맞다

            sum += number; //sum은 number를 전부 더해서 나오는 값이다.
            count++; // count는 입력한 숫자의 개수를 세는것이다
        }

        double average = (double)sum/count; //int/int 이기 때문에 "캐스팅"을 해주지 않으면 소수점이 사라지므로 더블을 붙여준다

        System.out.println("입력한 숫자들의 합 : " + sum);
        System.out.println("입력한 숫자들의 평균 : " + average);
    }
}
/*
    위의 코드를 더 축약하면
    while ((number = scanner.nextInt()) != -1) {
            sum += number;
            count++;
    }
    *scanner.nextint 가 사용자가 입력한 값을 말한다. 그것을 number에 대입시키는것이다 그러므로
    *넘버가 -1이 아니면 참이기때문에 계속해서 반복한다, -1이면 거짓이되기때문에 while문을 빠져나온다
    
    double average = (double)sum/count;
    System.out.println("입력한 숫자들의 합 : " + sum);
    System.out.println("입력한 숫자들의 평균 : " + average);

 */