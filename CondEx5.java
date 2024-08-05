package cond_조건문.ex;

public class CondEx5 {
    public static void main(String[] args) {

        String grade = "C";

        switch (grade){
            case "A" -> System.out.println(grade +" 탁월한 성과입니다");
            case "B" -> System.out.println(grade +" 좋은 성과입니다");
            case "C" -> System.out.println(grade +" 준수한 성과입니다");
            case "D" -> System.out.println(grade +" 향상이 필요합니다");
            case "F" -> System.out.println(grade +" 불합격입니다");
            default -> System.out.println(grade +" 잘못된 학점입니다");
        }
    }
}
