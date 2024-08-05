package loop_반복문;
//  for문에서 초기식, 조건식, 증감식은 선택이다. 다음과 같이 모두 생략해도 된다. 단 생략해도 각 영역을 구분하는 세미콜론( ; )은 유지해야 한다
public class For2 {
    public static void main(String[] args) {
        int sum = 0;
        int endNum = 3;
        for (int i = 1; i <= endNum; i++){
            sum = i +sum;
            System.out.println("i = " + i + " sum = " + sum);
        }
    }
}
/*
    for문을 좀 더 편리하게 사용하도록 도와주는 향상된 for문 또는 for-each문으로 불리는 반복문도 있다. 이 부분은 뒤에서 설명한다
 */