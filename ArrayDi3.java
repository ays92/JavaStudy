package array_배열;
/*
    이 코드를 보니 2가지 개선할 부분이 있다.
    1. 초기화: 기존 배열처럼 2차원 배열도 편리하게 초기화 할 수 있다.
    2. for 문에서 배열의 길이 활용: 배열의 길이가 달라지면 for 문에서 row < 2 , column < 3 같은 부분을 같이 변경해야 한다.
    이 부분을 배열의 길이를 사용하도록 변경해보자. 배열이 커지거나 줄어들어도 for문의 코드를 변경하지 않고 그대로 유지할 수 있다.
 */
public class ArrayDi3 {
    public static void main(String[] args) {
        // 2x3 2차원 배열, 초기화
        int[][] array =  {
            {1, 2, 3},
            {4, 5, 6},
        };
        // 이제 배열의 초기화 부분만 다음과 같이 변경하면 바로 적용된 결과를 확인할 수 있다. 나머지 코드는 변경하지 않아도 된다.

        // 2차원 배열의 길이를 활용
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                System.out.print(array[row][column] + " ");
            }
            System.out.println(); // 한 행이 끝나면 라인변경
        }
        /*
            for 문에서 2차원 배열의 길이를 활용했다.
            array.length 는 행의 길이를 뜻한다. 여기서는 2가 출력된다.
                {{},{}} 를 생각해보면 array 배열은 {} , {} 2개의 "배열 요소"를 가진다.
            array[row].length 는 열의 길이를 뜻한다. 여기서는 3이 출력된다.
                array[0] 은 {1,2,3} 배열을 뜻한다. 이 배열에는 3개의 요소가 있다.
                array[1] 은 {4,5,6} 배열을 뜻한다. 이 배열에는 3개의 요소가 있다.
         */
    }
}
