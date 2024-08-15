package scanner_스캐너.ex;

import java.util.Scanner;

public class ScannerWhileEx1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("이름을 입력하세요 (종료를 입력하면 종료) : ");
            String name = scanner.nextLine();

            if (name.equals("종료")){
                System.out.println("프로그램을 종료합니다");
                break;
            }
                System.out.println("나이를 입력하세요 (종료를 입력하면 종료) : ");
                int age = scanner.nextInt();
                scanner.nextLine(); //nextint 에서 엔터를 치면 \n 으로 타이핑 친걸로 인식을해서 \n이 남아서 다시 반복돌면서 name 에서 공백을 친다
            //그래서 한줄 더 nextline 으로 \n을 읽고 값을 버리는 코드를 작성해주면 끝난다. (중요한건 아님)

                System.out.println("입력한이름 : " + name + "," + " 나이 : " + age);
        }
    }
}
