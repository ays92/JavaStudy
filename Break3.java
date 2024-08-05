package loop_반복문;

public class Break3 {
    public static void main(String[] args) {
        int sum = 0;


        for (int i = 1; ; i++){ //while(true)는 무한반복을 의미한다
            sum = sum + i;
            if(sum > 10){
                System.out.println("합이 10보다 크면 종료 : i= " + i + " sum = " + sum);
                break;
            }

        } // 결과적으로 if의 조건에서 sum이 조건의 숫자보다 커지는 구간이 언제인가를 알아보기 위한 코드이다.
        // Break 2에서의 초기식, 증감식을 for문의 형태로 집어 넣었다
    }
}
