public class HelloJava {
// public class HelloJava
// HelloJava 를 클래스라 한다. 클래스(class)의 개념을 학습해야 이해할 수 있다. 클래스는 뒤에서 학습한다.
// 지금은 단순히 HelloJava.java 라는 파일을 만들었다고 이해하면 된다. 파일명과 클래스 이름이 같아야 한다.
// {} 블록을 사용해서 클래스의 시작과 끝을 나타낸다.

    public static void main(String[] args){
        // 중괄호 부분을 블록이라고 한다
        // public static void main(String[] args)
        // main 메서드라 한다. 함수, 메서드의 개념을 학습해야 이해할 수 있다. 함수, 메서드는 뒤에서 학습한다.
        // 자바는 main(String[] args) 메서드를 찾아서 프로그램을 시작한다. 지금은 단순히 main 은 프로그램의 시작점이라고 이해하면 된다.
        // {} 블록을 사용해서 메서드의 시작과 끝을 나타낸다

        System.out.println("hello java");
            // System.out.println() : 값을 콘솔에 출력하는 기능이다.
            // "hello java" : 자바는 문자열을 사용할 때 " (쌍따옴표)를 사용한다. 쌍따옴표 사이에 원하는 문자열을 감싸면 된다.
            // ;(세미콜론) : 자바는 세미콜론으로 문장을 구분한다. 문장이 끝나면 세미콜론을 필수로 넣어주어야 한다.
            // 소괄호 () , 중괄호 {} , 대괄호 []
    }
}
/*
    * 실행 과정
    1. HelloJava 프로그램을 실행한다.
    2. 자바는 시작점인 main() 메서드를 실행한다.
    3. System.out.println("hello java") 을 만나고, 문자열 hello java 을 출력한다.
    4. main() 메서드의 {} 블록이 끝나면 프로그램은 종료된다.


    자바 언어는 대소문자를 구분한다. 대소문자가 다르면 오류가 발생할 수 있다


 */
