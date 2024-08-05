package cond_조건문.ex;

public class CondEx1 {
    public static void main(String[] args) {
        int score = 100;

        if(score >= 90){
            System.out.println("학점은 A 입니다");
        } else if (score >= 80) {
            System.out.println("학점은 B 입니다");
        } else if (score >= 70){
            System.out.println("학점은 C 입니다");
        } else if (score >= 60){
            System.out.println("학점은 D 입니다");
        } else {
            System.out.println("학점은 F 입니다");
        }
    }
}
