package variable_변수;

public class Var1 {
    public static void main(String[] args) {
        System.out.println("10");
        System.out.println("10");
        System.out.println("10");
    }
}
/*
    숫자 10이라고 적혀 있는 곳을 모두 찾아서 숫자 20으로 변경해야 한다. 여기서는 총 3번의 코드 변경이 발생했다.
    단순한 예제여서 코드를 3번만 변경했지만, 만약 숫자 10을 출력하는 부분이 100개라면 100개의 코드를 모두 변경해야 한다.
    더 나아가서 사용자가 숫자를 입력하고, 사용자가 입력한 숫자를 출력하고 싶다면 어떻게 해야할까? 사용자가 입력한값은 항상 변한다.
    누군가는 100을 입력하고 누군가는 200을 입력할 수도 있다. (사용자 입력은 뒤에서 다룬다)
    결국 어딘가에 값을 보관해두고 필요할 때 값을 꺼내서 읽을 수 있는 저장소가 필요하다.
    쉽게 비유하자면 데이터를 담을 수 있는 그릇이 필요하다.
    모든 프로그래밍 언어는 이런 문제를 해결하기 위해 변수(variable)라는 기능을 제공한다.
    변수는 이름 그대로 변할 수있다는 뜻이다
 */