package method;

public class MethodValue2 {
    public static void main(String[] args) {
        int number = 5;
        System.out.println("1. changeNumber 호출 전, number : " + number);
        changeNumber(number);       //1. changeNumber를 호출한다. main의number(5)
        System.out.println("4. changeNumber 호출 후, number : " + number);
                                    //3. 결과: main의 number(5), changeNumber의 number(5)
    }
    /*
    main() 도 사실은 메서드이다. 각각의 메서드 안에서 사용하는 변수는 서로 완전히 분리된 다른 변수이다. 물론 이름이 같아도 완전히 다른 변수다.
    따라서 main() 의 number 와 changeNumber() 의 number 는 서로 다른 변수이다.
     */

    public static void changeNumber(int number) {
        System.out.println("2. changeNumber 변경 전, number : " + number);
        number = number * 2;
        System.out.println("3. changeNumber 변경 후, number : " + number);
        //2. main의 number값 5가 changeNumber의 number에 복사된다.
        //4. changeNumber의 number에 값 10을 대입한다.
        //5. main의 number(5), changeNumber의 number(10)
    }
}
