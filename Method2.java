package method;
    // 매개변수가 없고, 반환 타입도 없는 메서드를 확인해보자
    // 원래 모든 메소드에는 return을 반드시 입력(호출)해야한다.


public class Method2 {
    public static void main(String[] args) {
        printHeader();
        System.out.println(" = 프로그램이 동작합니다 = ");
        printFooter();
    }
    // printHeader() , printFooter() 메서드는 매개변수가 없고, 반환 타입도 없다.


    public static void printHeader() {
        System.out.println(" = 프로그램을 시작합니다 = "); //
        return; // 이 메소드처럼 반환타입이 없는 void의 경우에는 return을 생략해도된다
    }
    /*
    매개변수가 없는 경우
    선언: public static void printHeader() 와 같이 매개변수를 비워두고 정의하면 된다.
    호출: printHeader(); 와 같이 인수를 비워두고 호출하면 된다.
    */


    public static void printFooter() {
        System.out.println(" = 프로그램을 종료합니다 = ");
        return;     //return을 생략해도 자바에서 알아서 인식한다
    }
    /*
    반환 타입이 없는 경우
    선언: public static void printHeader() 와 같이 반환 타입을 void 로 정의하면 된다.
    호출: printHeader(); 와 같이 반환 타입이 없으므로 메서드만 호출하고 반환 값을 받지 않으면 된다.
    String str = printHeader(); 반환 타입이 void 이기 때문에 이렇게 반환 값을 받으면 컴파일 오류가 발생한다.
    */
}
