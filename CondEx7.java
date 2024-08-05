package cond_조건문.ex;

public class CondEx7 {
    public static void main(String[] args) {

        int x = 2;
        String result = (x % 2) == 1 ? "홀수":"짝수";
        System.out.println("x = " +x+","+result);
    }
}
