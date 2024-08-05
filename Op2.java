package operator_연산자;

public class Op2 {
    public static void main(String[] args) {
        // 자바는 특별하게 문자열에도 + 연산자를 사용할 수 있다. 문자열에 + 연산자를 사용하면 두 문자를 연결할 수 있다.

        //문자열과 문자열 더하기
        String result1 = "hello"+"world";
        System.out.println(result1);
        /*
            문자열과 문자열 더하기1
            String result1 = "hello " + "world"
            "hello " 문자열과 "world" 문자열을 더해서 "hello world" 문자열을 만든다.
            결과를 result1 에 저장한다.
         */

        //문자열과 문자열 더하기2
        String s1 = "string1";
        String s2 = "string2";
        String result2 = s1+s2;
        System.out.println(result2);
        /*
            문자열과 문자열 더하기1
            String result1 = "hello " + "world"
            "hello " 문자열과 "world" 문자열을 더해서 "hello world" 문자열을 만든다.
            결과를 result1 에 저장한다.
         */

        //문자열과 숫자 더하기
        String result3 = "a + b = "+10;
        System.out.println(result3);
        /*
            문자열과 숫자 더하기1
            다음 식은 문자열과 숫자를 더한다. 자바에서 문자와 숫자를 더하면 숫자를 문자열로 변경한 다음에 서로 더한다.
            "a + b = " + 10
            문자: "a + b = "
            숫자: 10
            계산 과정
            "a + b = "(String) + 10(int) //문자열과 숫자 더하기
            "a + b = "(String) + "10"(int -> String) //숫자를 문자열로 변경
            "a + b = " + "10" //문자열과 문자열 더하기
            "a + b = 10" //결과
         */

        //문자열과 숫자 더하기2
        int num = 20;
        String str = "a + b =";
        String result4 = str + num;
        System.out.println(result4);
        /*
            문자열과 숫자 더하기2
            변수에 담겨 있어도 문자와 숫자를 더하면 문자가 된다. 계산 과정을 확인해보자.
            계산 과정
            str(String) + num(int)
            "a + b = "(String) + num(int)               //str 변수에서 값 조회
            "a + b = "(String) + 20(int)                //num 변수에서 값 조회
            "a + b = "(String) + "20"(int -> String)    //숫자를 문자열로 변경
            "a + b = " + "20"                           //문자열과 문자열 더하기
            "a + b = 20"                                //결과
            자바는 문자열인 String 타입에 다른 타입을 더하는 경우 대상 타입을 문자열로 변경한다.
            쉽게 이야기해서 문자열에 더하는 것은 다 문자열이 된다
         */
    }
}
