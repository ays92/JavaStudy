package variable_변수;

public class Var5 {
    public static void main(String[] args) {

        int i; //변수선언
        i = 10; // 변수 초기화
        System.out.println(i);
        i = 50; // 변수 값 변경
        System.out.println(i);

        int a; // 변수선언, 초기화를 따로
        a = 1;
        System.out.println(a);

        int b = 2; // 변수선언, 초기화를 한번에
        System.out.println(b);

        int c = 3, d = 4; // 여러 변수의 선언과 초기화를 한번에
        System.out.println(c);
        System.out.println(d);


        // 변수는 반드시 초기화를 해야한다
        // 변수를 선언하고, 선언한 변수에 처음으로 값을 저장하는 것을 변수 초기화라 한다
        // System.out.println(a); // 컴파일 에러

        // 이렇게 초기화 안된 변수는 메모리만 잡아먹지 필요가 없기때문에 컴파일 단계에서 javac가(자바 컴파일러) 최적화를 해버린다(사라짐)
        // 사실 컴파일 에러는 동작 자체가 안된거기때문에 에러가 날거면 동작 자체가 안되는게 오히려 나음(좋은에러)
        // 런타임 에러가 나버리면 내 계좌에서 돈이 빠져나갓는데 상대방에게 입금이 안됨(나쁜에러)
    }
}
