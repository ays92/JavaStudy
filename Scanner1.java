package scanner_스캐너;
/*
지금은 Scanner 의 기능을 사용하기 위해 new 를 사용해서 Scanner 를 만든다 정도로 이해하면 된다.
Scanner 는 System.in 을 사용해서 사용자의 입력을 편리하게 받도록 도와준다.
Scanner scanner 코드는 scanner 변수를 선언하는 것이다.
이제부터 scanner 변수를 통해서 scanner 를 사용할 수 있다.
 */
import java.util.Scanner;

public class Scanner1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = scanner.nextLine(); //입력값을 intValue에 담아서 아랫줄에서 출력한다
        System.out.println("입력한 문자열: " + str);

        System.out.print("정수를 입력하세요 : ");
        int intValue = scanner.nextInt(); // 입력값을 intValue에 담아서 아랫줄에서 출력한다
        System.out.println("입력한 정수 : " + intValue);

        System.out.print("실수를 입력하세요 : ");
        double doubleValue = scanner.nextDouble();
        System.out.println("입력한 실수 : " + doubleValue);
        // 타입이 다르면 오류가 발생한다. 예제와 같이 숫자에 문자를 입력하면 오류가 발생한다.
    }
}
