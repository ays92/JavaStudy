package cond_조건문;
/*
    else if 문은 앞선 if 문의 조건이 거짓일 때 다음 조건을 검사한다. 만약 앞선 if 문이 참이라면 else if 를 실행하지 않는다
    쉽게 이야기해서 이렇게 전체 if 문을 하나로 묶는다고 보면 된다. 이렇게 하면 특정 조건이 만족하면 해당 코드를 실행하고 if 문 전체를 빠져나온다.
    특정 조건을 만족하지 않으면 다음 조건을 검사한다. 여기서 핵심은 순서대로 맞는 조건을 찾아보고, 맞는 조건이 있으면 딱 1개만 실행이 되는 것이다.
    참고로 else 는 생략할 수 있다.
*/
public class If4 {
    public static void main(String[] args) {
        int age = 5;

        if(age <= 7){ // 조건1이 참일 때 실행되는 코드
            System.out.println("미취학");
        } else if(age <= 13){ // 조건1이 거짓이고, 조건2가 참일 때 실행되는 코드
            System.out.println("초등학생");
        } else if(age <= 16){
            System.out.println("중학생");
        } else if(age <= 19){
            System.out.println("고등학생");
        } else{
            System.out.println("성인");
        }
    }
}
/*
        age = 7인 경우
        if(age <= 7) 의 조건이 참이다. "미취학"을 출력하고 전체 if 문 밖으로 나간다.

        age = 13인 경우
        if(age <= 7) 의 조건이 거짓이다. 다음 조건으로 넘어간다.
        else if(age <= 13) 의 조건이 참이다. "초등학생"을 출력하고 전체 if 문 밖으로 나간다.

        age = 50인 경우
        if(age <= 7) 의 조건이 거짓이다. 다음 조건으로 넘어간다.
        else if(age <= 13) 의 조건이 거짓이다. 다음 조건으로 넘어간다.
        else if(age <= 16) 의 조건이 거짓이다. 다음 조건으로 넘어간다.
        else if(age <= 19) 의 조건이 거짓이다. 다음 조건으로 넘어간다.
        else 만족하는 조건 없이 else 까지 왔다. else 에 있는 "성인"을 출력하고 전체 if 문 밖으로 나간다.
 */