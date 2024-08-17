package method;
    //  자동 형변환
    //  int < long < double
    //  메서드를 호출할 때 **매개변수에 값을 전달하는 것도 결국 변수에 값을 대입하는 것이다**. 따라서 앞서 배운 자동 형변환이 그대로 적용된다
public class MethodCasting2 {
    public static void main(String[] args) {
        int number = 100;
        printNumber(number);    // int에서 double로 자동 형변환
    }
    public static void printNumber(double n) {
        System.out.println("숫자 : " + n);   // double 형 매개변수(파라미터)에 int 형 인수를 전달하는데 문제없이 잘 동작한다
                                            // double형 파라미터 변수 n에 int형 값 100을 대입
                                            //double이 더 큰 숫자 범위이므로 자동 형변환 적용
                                            //자동 형변환 완료
    }
}
//  정리
//  메서드를 호출할 때는 전달하는 인수의 타입과 매개변수의 타입이 맞아야 한다. 단 타입이 달라도 자동 형변환이 가능한 경우에는 호출할 수 있다.