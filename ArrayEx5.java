package array_배열.ex;

import java.util.Scanner;

public class ArrayEx5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("입력받을 숫자의 개수를 입력하세요 : ");
        int quantity = scanner.nextInt();

        int[] number = new int[quantity];
        int total = 0;
        double average = 0;

        System.out.println(quantity + "개의 정수를 입력하세요");

        for (int i = 0; i < number.length ;i++) {
            number[i] = scanner.nextInt();
            total += number[i];
        }

        average = (double) total/quantity;
        System.out.println("입력한 정수의 합 : " + total);
        System.out.println("입력한 정수의 평균 : " + average);
    }
}
