package loop_반복문;
//  문제: 1부터 하나씩 증가하는 수를 3번 더해라 (1 ~ 3 더하기)
public class While2_1 {
    public static void main(String[] args) {
        int count = 0;

        count = count + 1;
        System.out.println(count);

        count = count + 2;
        System.out.println(count);

        count = count + 3;
        System.out.println(count);
        //이 코드의 정답은 맞다. 하지만 개선할 점이 많이 있는데, 무엇보다 변경에 유연하지 않다.
    }
}
