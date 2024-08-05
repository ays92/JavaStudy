package cond_조건문;
 // else 문은 if 문에서 만족하는 조건이 없을 때 실행하는 코드를 제공한다
public class If2 {
    public static void main(String[] args) {

        int age = 20;

        if(age >= 18){
            System.out.println("성인입니다");
        } else {
            System.out.println("미성년자입니다");
        }
    }
}
/*
    else 문을 사용하면 앞서 진행했던 프로그램을 다음과 같이 더 간략하게 바꿀 수도 있다.
    기존: 만약 18살 이상이면 "성인입니다"를 출력하고, 만약 18살 미만이라면 "미성년자입니다."를 출력해야 한다.
    변경: 만약 18살 이상이면 "성인입니다"를 출력하고, 그렇지 않으면 "미성년자입니다."를 출력해야 한다.
    쉽게 이야기해서 18살이 넘으면 성인이고, 그렇지 않으면 모두 미성년자이다.
 */