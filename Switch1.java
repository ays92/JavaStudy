package cond_조건문;
    //switch 문은 앞서 배운 if 문을 조금 더 편리하게 사용할 수 있는 기능이다.
    //참고로 if 문은 비교 연산자를 사용할 수 있지만, switch 문은 단순히 값이 같은지만 비교할 수 있다.
    //switch 문은 조건식에 해당하는 특정 값으로 실행할 코드를 선택한다
public class Switch1 {
    public static void main(String[] args) {
        int grade = 2;

        int coupon;
        if (grade == 1) {
            coupon = 1000;
        } else if (grade == 2) {
            coupon = 2000;
        } else if (grade == 3) {
            coupon = 3000;
        } else {
            coupon = 500;
        }
        System.out.println("coupon = " + coupon);
    }
}
