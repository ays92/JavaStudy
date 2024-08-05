package cond_조건문;

public class Switch2 {
    public static void main(String[] args) {
        int grade = 1;
        int coupon;
        switch (grade){
            case 1: // 조건식의 결과 값이 case1일 때 실행되는 코드
                coupon = 1000;
                break;
            case 2: // 조건식의 결과 값이 case2일 때 실행되는 코드
                coupon = 2000;
                break;
            case 3: // 조건식의 결과 값이 case3일 때 실행되는 코드
                coupon = 3000;
                break;
            default: // 조건식의 결과 값이 위의 어떤 값에도 해당하지 않을 때 실행되는 코드
                coupon = 500;
        }
        System.out.println(coupon);
    }
}
/*
    조건식의 결과 값이 어떤 case 의 값과 일치하면 해당 case 의 코드를 실행한다.
    break 문은 현재 실행 중인 코드를 끝내고 switch 문을 빠져나가게 하는 역할을 한다.
    만약 break 문이 없으면, 일치하는 case 이후의 모든 case 코드들이 순서대로 실행된다.
    default 는 조건식의 결과값이 모든 case 의 값과 일치하지 않을 때 실행된다. if 문의 else 와 같다.
    default 구문은 선택이다. if , else-if , else 구조와 동일하다.
 */