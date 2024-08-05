package operator_연산자;

public class Op3 {
    /*
    수학에서 1 + 2 * 3 의 연산 결과는 무엇일까? 덧셈보다 곱셈이 우선순위가 더 높다. 따라서 다음과 같이 계산한다.
            1 + (2 * 3)         //곱셈(*)이 연산자 우선순위가 높다. 따라서 먼저 계산한다.
            1 + 6
            7                   //결과
     */
    public static void main(String[] args) {
        int sum1 = 1 + 2 * 3;
        int sum2 = (1 + 2) * 3;
        System.out.println("sum1 = " + sum1);
        System.out.println("sum2 = " + sum2);
    }
}
/*
    출력 결과를 보면 sum1 = 7 이 나왔다. 연산자 우선순위에 의해 곱셈이 먼저 계산된 것이다.
    연산자 우선순위를 변경하려면 수학과 마찬가지로 괄호 () 를 사용하면 된다. () 를 사용한 곳이 먼저 계산된다.
    sum2 는 괄호를 사용해서 덧셈이 먼저 처리되도록 했다.
 */