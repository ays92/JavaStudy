package array_배열;

public class ArrayDi1 {
    public static void main(String[] args) {
        //2차원 배열을 만든다
        int[][] array = new int[2][3]; // 행2, 열3 짜리 2차원 배열을 만든다.

        array[0][0] = 1; // 0행, 0열
        array[0][1] = 2; // 0행, 1열
        array[0][2] = 3; // 0행, 2열
        array[1][0] = 4; // 1행, 0열
        array[1][1] = 5; // 1행, 1열
        array[1][2] = 6; // 1행, 2열
        
        //반복문을 이용한 코드 리팩토링(개선)
        for (int row = 0; row < 2; row++) {
            System.out.print(array[row][0] + " "); //0열 출력
            System.out.print(array[row][1] + " "); //1열 출력
            System.out.print(array[row][2] + " "); //2열 출력
            System.out.println(); // 한 행이 끝나면 라인변경
        }
    }
}
/*
    for문을 통해서 행(row)을 반복해서 접근한다.
    각 행 안에서 열(column)이 3개이므로 arr[row][0] , arr[row][1] , arr[row][2] 3번 출력한다.
    이렇게하면 for문을 한번 도는 동안 3개의 열을 출력할 수 있다.
    row=0 의 for문이 실행되면 arr[0][0] , arr[0][1] , arr[0][2] 로 1 2 3 이 출력된다.
    row=1 의 for문이 실행되면 arr[1][0] , arr[1][1] , arr[1][2] 로 4 5 6 이 출력된다.
 */
