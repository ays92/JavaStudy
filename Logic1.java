package operator_연산자;

public class Logic1 {
    public static void main(String[] args) {
        System.out.println(" && : AND 연산"); //두 연산자가 모두 참이여야 true를 반환. 하나라도 거짓이면 false반환
        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && false);

        System.out.println(" ||: or 연산"); //두 연산자중 하나라도 참이면 true를 반환한다. 둘다 거짓이면 false반환
        System.out.println(true || true);
        System.out.println(true || false);
        System.out.println(false || false);

        System.out.println(" ! 연산 "); // !a 와 !b 는 각각의 논리적 부정을 반환한다
        System.out.println(!true);
        System.out.println(!false);

        System.out.println("변수 활용");
        boolean a = true;
        boolean b = false;
        System.out.println(a && b); // false
        System.out.println(a || b); // true
        System.out.println(!a); // false
        System.out.println(!b); // true
        /*
        a && b 는 false 를 반환한다. 왜냐하면 둘 중 하나인 b 가 거짓이기 때문이다.
        a || b 는 true 를 반환한다. 왜냐하면 둘 중 하나인 a 가 참이기 때문이다.
        !a 와 !b 는 각각의 논리적 부정을 반환한다
         */
    }
}
/*
    논리 연산자는 boolean 형인 true , false 를 비교하는데 사용한다.

    논리 연산자
    && (그리고) : 두 피연산자가 모두 참이면 참을 반환, 둘중 하나라도 거짓이면 거짓을 반환
    || (또는) : 두 피연산자 중 하나라도 참이면 참을 반환, 둘다 거짓이면 거짓을 반환
    ! (부정) : 피연산자의 논리적 부정을 반환. 즉, 참이면 거짓을, 거짓이면 참을 반환

    && : 두 피연산자가 모두 참이어야 true 를 반환한다. 둘중 하나라도 거짓이면 false 를 반환한다.
    || : 두 피연산자 중 하나라도 참이면 true 를 반환한다. 둘다 모두 거짓이면 false 를 반환한다.
    ! : 피연산자의 논리적 부정을 반환한다. 참이면 거짓을, 거짓이면 참을 반환한다.
 */