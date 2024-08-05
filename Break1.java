package loop_반복문;
//  break 와 continue 는 반복문에서 사용할 수 있는 키워드다.
//  break 는 반복문을 즉시 종료하고 나간다. continue 는 반복문의 나머지 부분을 건너뛰고 다음 반복으로 진행하는데 사용된다.
//  참고로 while , do-while , for 와 같은 모든 반복문에서 사용할 수 있다.
public class Break1 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;
        while(true){ //while(true)는 무한반복을 의미한다
            sum = sum + i;
            if(sum > 10){
                System.out.println("합이 10보다 크면 종료 : i= " + i + " sum = " + sum);
                break; //즉시 while문 종료로 이동한다.
            }
            i++;
        } //while문 종료
    }
}
//  break 를 만나면 코드2 가 실행되지 않고 while문이 종료된다.
//  조건식을 잘 보면 true 라고 되어있다. 조건이 항상 참이기 때문에 이렇게 두면 while 문은 무한 반복된다.
//  물론 break 문이 있기 때문에 중간에 빠져나올 수 있다.
//  만약 sum > 10 조건을 만족하면 결과를 출력하고, break 를 사용해서 while 문을 빠져나간다
//  결과적으로 if의 조건에서 sum이 조건의 숫자보다 커지는 구간이 언제인가를 알아보기 위한 코드이다.