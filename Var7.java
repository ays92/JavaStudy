package variable_변수;

public class Var7 {
    public static void main(String[] args) {
        int a = 100; // 정수 리터럴
        double b = 10.5; // 실수 리터럴
        boolean c = true; // 불리언 리터럴 true, false만 입력가능
        char d = 'A'; // 캐릭터 리터럴. 문자 하나만 저장가능. 작은따옴표를 사용해야한다
        String e = "Hello Java"; // 문자열 리터럴. 문자열을 다루기 위한 특별한 타입. 큰따옴표 사용

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);

        // int타입, int형, int형식 전부 같은말
        // 위에서 100, 10.5, true, A, Hello Java 처럼 개발자가 직접 지정해놓은 값을 "리터럴" 이라고 부른다
    }
}
/*
    변수는 데이터를 다루는 종류에 따라 다양한 형식이 존재한다. 이러한 형식을 영어로는 타입 (type)이라 하고, 우리말로는 형식 또는 형 이라 한다.
    예를 들어서 int 타입, int 형식, int 형 등으로 부른다. 특별히 구분하지 않고 섞어서부르기 때문에 모두 같은 말로 이해하면 된다

    int : 정수를 다룬다. 예) 1 , 100 , 1000
    double : 실수를 다룬다. 예) 0.2 , 1.5 , 100.121
    boolean : 불리언 타입이라 한다. true , false 값만 사용할 수 있다. 주로 참과 거짓을 판단하는 곳에서 사용한다.
    char : 문자 하나를 다룰 때 사용한다. 작은따옴표( ' )를 사용해서 감싸야 한다. 예) 'A' , '가'
    String : 문자열을 다룬다. 큰따옴표를 사용해야 한다. 예) "hello java"

    참고: String 은 첫 글자가 대문자로 시작하는 특별한 타입이다. 이 부분은 뒤에 클래스를 배워야 자세히 이해할수 있다.
    지금은 문자열을 다루는 특별한 타입이라고 이해하면 된다. String 에 대한 자세한 내용은 별도로 다룬다.
 */

/*
    자신의 타입에 맞는 데이터 사용
    각 변수는 지정한 타입에 맞는 값을 사용해야 한다. 예를 들어서 다음의 앞의 두 코드는 컴파일 오류가 발생한다
    int a = "백원" : 정수 타입에 문자열(X)
    int a = "100" : 정수 타입에 문자열(X), 이것은 숫자 100이 아니라 문자열 "100" 이다. 문자를 나타내는 쌍따옴표( " )로 감싸져 있다.
    int a = 100 : 정수 타입에 정수 100(O)

    리터럴
    코드에서 개발자가 직접 적은 100 , 10.5 , true , 'A' , "Hello Java" 와 같은 고정된 값을 프로그래밍 용어로 리터럴(literal)이라 한다.
    int a = 100; //정수 리터럴
    double b = 10.5; //실수 리터럴
    boolean c = true; //불리언 리터럴
    char d = 'A'; //문자 하나 리터럴
    String e = "Hello Java"; //문자열 리터럴
    변수의 값은 변할 수 있지만 리터럴은 개발자가 직접 입력한 고정된 값이다. 따라서 리터럴 자체는 변하지 않는다.

    참고: 리터럴(literal)이라는 단어의 어원이 문자 또는 글자를 의미한다.
 */