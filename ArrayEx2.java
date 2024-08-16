package array_배열.ex;

import java.util.Scanner;

public class ArrayEx2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] number = new int[5]; //5개의 정수가 들어가는 배열을 선언하겠다는 뜻
        System.out.println("5개의 정수를 입력하세요");

        for (int i = 0; i < number.length; i++){
            number[i] = scanner.nextInt();
        } //스캐너를 반복시켜서 돌려서 사용자가 입력한 숫자대로 배열을 만듬

        System.out.println("출력");

        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]);
            if (i < number.length - 1) {
                System.out.print(", ");
            }
        }
    }
}
