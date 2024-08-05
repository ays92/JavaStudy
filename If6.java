package cond_조건문;

public class If6 {
    public static void main(String[] args) {
        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매 1000원 할인");
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("10살 이하시 1000원 할인");
        } else {
            System.out.println("할인금액 없음");
        }
        System.out.println("총 할인금액 " + discount + " 원");
    }
    //  여기서 else if 를 사용하면 if에서 조건을 만족했을때 바로 if문이 끝나버리기때문에 else if의 조건을 체크하지않음. 즉 할인 더받을수있는지 확인불가
    //  if 문을 각각 사용할지, if 와 else if 를 함께 묶어서 사용할지는 요구사항에 따라 다르다. 둘의 차이를 이해하고 적절하게 사용하면 된다.
}
/*
    참고 - if문 {} 중괄호 생략
    if 문 다음에 실행할 명령이 하나만 있을 경우에는 {} 중괄호를 생략할 수 있다. else if , else 도 마찬가지이다

    다음과 같은 경우에는 두번째 문장은 if 문과 무관하다. 만약 둘다 if 문 안에 포함하려면 {} 를 사용해야 한다.
    if (true)
     System.out.println("if문에서 실행됨");
     System.out.println("if문에서 실행 안됨");

    만약 둘다 if 문 안에 포함하려면 다음과 같이 {} 를 사용해야 한다.
    if (true) {
     System.out.println("if문에서 실행됨");
     System.out.println("if문에서 실행 안됨");
    }

    프로그래밍 스타일에 따라 다르겠지만, 일반적으로는 if 문의 명령이 한개만 있을 경우에도 다음과 같은 이유로 중괄호를 사용하는 것이 좋다.
    가독성: 중괄호를 사용하면 코드를 더 읽기 쉽게 만들어 준다. 조건문의 범위가 명확하게 표시되므로 코드의 흐름을 더 쉽게 이해할 수 있다.

    유지보수성: 중괄호를 사용하면 나중에 코드를 수정할 때 오류를 덜 발생시킬 수 있다.
    예를 들어, if 문에 또 다른 코드를 추가하려고 할 때, 중괄호가 없으면 이 코드가 if 문의 일부라는 것이 명확하지 않을 수 있다.
*/