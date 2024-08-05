package variable_변수;

public class Var2 {
    public static void main(String[] args) {
        int a; // 변수 선언
        a = 20; // 변수 초기화

        System.out.println(a);
        System.out.println(a);
        System.out.println(a);
        
    }
}
/*
    int a
    숫자 정수( integer )를 보관할 수 있는 이름이 a 라는 데이터 저장소를 만든다. 이것을 변수라 한다.
    이렇게 변수를 만드는 것을 변수 선언이라 한다. 이제 변수 a 에는 숫자 정수를 보관할 수 있다.
    숫자 정수 뿐만 아니라 문자, 소수와 같이 다양한 종류 값을 저장할 수 있는 변수들이 있다.
    우선은 숫자 정수를 저장하는 int 를 알아두자

    a = 10
    자바에서 = 은 오른쪽에 있는 값을 왼쪽에 저장한다는 뜻이다. 수학에서 이야기하는 두 값이 같다( equals )와는다른 뜻이다!
    숫자를 보관할 수 있는 데이터 저장소인 변수 a 에 값 10 을 저장한다.
    이처럼 선언한 변수에 처음으로 값을 대입해서 저장하는 것을 변수 초기화라 한다.

    System.out.println(a)
    변수에 저장되어 있는 값을 읽어서 사용하는 방법은 간단하다. 변수 이름을 적어주기만 하면 된다.
    변수 a 에 10 이 들어가 있다면 자바는 실행 시점에 변수의 값을 읽어서 사용한다. 따라서 다음과 같이 해석된다.
    System.out.println(a) //변수 a의 값을 읽음
    System.out.println(10) //a의 값인 10으로 변경, 숫자 10 출력
    참고로 변수의 값은 반복해서 읽을 수 있다. 변수의 값을 읽는다고 값이 없어지는 것이 아니다
*/
