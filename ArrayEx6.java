package array_배열.ex;

import java.util.Scanner;

public class ArrayEx6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min, max;

        System.out.print("입력받을 숫자의 개수를 입력하세여 : ");
        int count = scanner.nextInt(); //count 라는 변수에, 입력한 정수의 값을 넣는다

        int [] number = new int[count]; // number 라는 배열을 선언하고, 그 배열의 크기는 카운트에 들어간 정수의 크기이다

        System.out.println(count + " 개의 정수를 입력하세요");

        for (int i = 0; i < number.length; i++) { // number 의 길이는(넣을 정수의 개수는) 카운트변수에 들어간 정수이고, 그만큼 반복한다는뜻
            number[i] = scanner.nextInt(); // 사용자가 스캐너로 입력한 정수를 이용해서 number 라는 배열을 만든다
        }

        min = max = number[0]; // 일단 min 과 max 의 값을, number 배열의 0번째 값과 같다고 치자(가정)

        for (int i = 0; i < number.length ; i++) {
            if (number[i] < min){ // min 의 값이 number 배열의 0번째값보다 크다면, number 배열의 0번째 값이 가장 작은 정수이다 (min 에 대입하겠다)
                min = number[i];
            }
            if (number[i] > max){ // max 의 값보다 number 배열의 0번째 값이 크다면, number 배열의 0번째 값을 max 에 대입하겠다.
                max = number[i];
            } // for 문을 number 배열의 길이만큼 반복해서 min 과 max 의 크기를 자동으로 비교해서 결론을 낸다
        }
        System.out.println("가장 큰 정수 : " + max);
        System.out.println("가장 작은 정수 : " + min);
    }
}
