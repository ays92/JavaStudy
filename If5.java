package cond_조건문;
// if 문에 else if 를 함께 사용하는 것은 서로 연관된 조건일 때 사용한다.
// 그런데 서로 관련이 없는 독립 조건이면 else if 를 사용하지 않고 if 문을 각각 따로 사용해야 한다.
public class If5 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매시 1000원 할인");
        }
        if (age <= 10) {
            discount = discount + 1000;
            System.out.println("10살 이하시 1000원 할인");
        }
        System.out.println("총 할인금액 " + discount + " 원");

        /*
        이 코드에서는 각각 독립된 if 문이 있다. 따라서 해당하는 모든 할인을 적용한다.
        만약 else if 를 쓰면, 첫 번째로 충족하는 조건만 할인이 적용되고 나머지는 무시된다. 따라서 사용자는 나머지 할인을 놓칠 수 있다
        */
    }
}
/*
    if 문에 여러 조건이 있다고 항상 if-else 로 묶어서 사용할 수 있는 것은 아니다.
    조건이 서로 영향을 주지 않고 각각 수행해야 하는 경우에는 else if 문을 사용하면 안되고, 대신에 여러 if 문을 분리해서 사용해야 한다.
    여러 독립적인 조건을 검사해야 하는 경우가 그런 상황의 대표적인 예시이다.
    즉, 각 조건이 다른 조건과 연관되지 않고, 각각의 조건에 대해 별도의 작업을 수행해야 할 때 이런 상황이 발생한다.
 */