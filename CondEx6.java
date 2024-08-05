package cond_조건문.ex;

public class CondEx6 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int max = (a > b) ? a : b; // a가 b보다 크면 a를 출력하고 그게 아니라면 b를 출력해라
        System.out.println(" 더 큰 숫자는 " + max + " 입니다");
    }
}
