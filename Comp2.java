package operator_연산자;

public class Comp2 {
    public static void main(String[] args) {
        //문자열비교. 문자열비교를 할때는 .equals() 메소드를 사용해야한다.
        // == 을 사용했을때 성공할때도 있지만 실패할때도 있다.

        String str1 = "문자열1";
        String str2 = "문자열2";

        boolean result1 = "hello".equals("hello"); // 리터럴 비교
        boolean result2 = str1.equals("문자열1"); // 문자열 변수, 리터럴 비교
        boolean result3 = str1.equals(str2); // 문자열 변수 비교

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
    }
}
/*
    문자열이 같은지 비교할 때는 == 이 아니라 .equals() 메서드를 사용해야 한다.
    == 를 사용하면 성공할 때도 있지만 실패할 때도 있다.
    지금은 이 부분을 이해하기 어려우므로 지금은 단순히 문자열의 비교는 .equals() 메서드를 사용해야 한다 정도로 알고 있자, 자세한 내용은 별도로 다룬다.
 */