package loop_반복문;

public class Break2 {
    public static void main(String[] args) {
        int sum = 0;
        int i = 1;

        for (;;){ //while(true)는 무한반복을 의미한다
            sum = sum + i;
            if(sum > 10){
                System.out.println("합이 10보다 크면 종료 : i= " + i + " sum = " + sum);
                break;
            }
            i++;
        }
        /*
                for (; ; ) 를 보면 조건식이 없다. for문은 조건이 없으면 무한 반복한다.
                sum > 10 조건을 만족하면 break 를 사용해서 while문을 빠져나간다.
         */

        // 결과적으로 if의 조건에서 sum이 조건의 숫자보다 커지는 구간이 언제인가를 알아보기 위한 코드이다.
        // Break1 의 while문을 for문으로 바꾸고 조건부분에 ;;(무한반복) 설정을 함으로써 사실상 while(true)와 같은 뜻이다.
    }
}
