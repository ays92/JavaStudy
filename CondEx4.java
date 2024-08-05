package cond_조건문.ex;

public class CondEx4 {
    public static void main(String[] args) {

        double rating = 3;

        if(rating >= 9){

            System.out.println("어바웃타임을 추천합니다");

        } else if(rating >= 8){

            System.out.println("어바웃타임을 추천합니다");
            System.out.println("토이스토리를 추천합니다");

        } else {

            System.out.println("어바웃타임을 추천합니다");
            System.out.println("토이스토리를 추천합니다");
            System.out.println("고질라를 추천합니다");
        }
    }
}
