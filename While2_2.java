package loop_반복문;
//  변수를 사용해서 더 변경하기 쉬운 코드로 만들어보자. 변경되는 부분을 변수 i 로 바꾸어보자.
//  문제: i부터 하나씩 증가하는 수를 3번 더해라
public class While2_2 {
    //  변수를 사용해서 더 변경하기 쉬운 코드로 만들어보자. 변경되는 부분을 변수 i 로 바꾸어보자.
    //  문제: i부터 하나씩 증가하는 수를 3번 더해라
    public static void main(String[] args) {
        int count = 0;
        int i = 1;

        count = count + i;
        System.out.println(count);
        i++;

        count = count + i;
        System.out.println(count);
        i++;

        count = count + i;
        System.out.println(count);
        i++;
    }
    //  변수 i 를 사용한 덕분에 i 의 값만 변경하면 나머지 코드를 전혀 변경하지 않아도 된다.
    //  좋은 코드인지 아닌지는 변경 사항이 발생했을 때 알 수 있다. 변경 사항이 발생했을 때 변경해야 하는 부분이 적을수록 좋은 코드이다.
}
