package array_배열;
/*
    지금까지 학습한 배열은 단순히 순서대로 나열되어 있었다. 이것을 1차원 배열이라 한다.
    이번에 학습할 2차원 배열은 이름 그대로 하나의 차원이 추가된다. 2차원 배열은 행과 열로 구성된다.
    2차원 배열은 int[][] arr = new int[2][3] 와 같이 선언하고 생성한다.
    그리고 arr[1][2] 와 같이 사용하는데, 먼저 행 번호를 찾고, 그 다음에 열 번호를 찾으면 된다.
  * 행은 영어로 row(로우), 열은 영어로 column(컬럼)이라 한다. 자주 사용하는 단어이니 알아두자.
    2차원 배열의 사용법은 [] 가 하나 추가되는 것을 제외하고는 앞서본 1차원 배열과 같다.
    그림의 배열에 들어있는 데이터는 다음과 같다.
    arr[행][열] , arr[row][column]
 */
public class ArrayDi0 {
    public static void main(String[] args) {
        //2차원 배열을 만든다
        int[][] array = new int[2][3]; // 행2, 열3 짜리 2차원 배열을 만든다.

        array[0][0] = 1; // 0행, 0열
        array[0][1] = 2; // 0행, 1열
        array[0][2] = 3; // 0행, 2열
        array[1][0] = 4; // 1행, 0열
        array[1][1] = 5; // 1행, 1열
        array[1][2] = 6; // 1행, 2열

        // 0행 출력
        System.out.print(array[0][0] + " "); //0열 출력
        System.out.print(array[0][1] + " "); //1열 출력
        System.out.print(array[0][2] + " "); //2열 출력
        System.out.println(); // 한 행이 끝나면 라인변경
        // 1행 출력
        System.out.print(array[1][0] + " "); //0열 출력
        System.out.print(array[1][1] + " "); //0열 출력
        System.out.print(array[1][2] + " "); //0열 출력
        System.out.println(); // 한 행이 끝나면 라인변경
    }
}
/*
    이 코드는 2차원 배열을 만들고, 배열에 값을 1부터 6까지 순서대로 직접 입력한다.
    다음과 같은 결과를 만들기 위해 0행에 있는 0,1,2열을 출력한다. 그리고 다음으로 1행에 있는 0,1,2열을 출력한다.
 */