package array_배열;

public class ArrayDi2 {
    public static void main(String[] args) {
        //2차원 배열을 만든다
        int[][] array = new int[2][3]; // 행2, 열3 짜리 2차원 배열을 만든다.

        array[0][0] = 1; // 0행, 0열
        array[0][1] = 2; // 0행, 1열
        array[0][2] = 3; // 0행, 2열
        array[1][0] = 4; // 1행, 0열
        array[1][1] = 5; // 1행, 1열
        array[1][2] = 6; // 1행, 2열

        //열 출력 반복 개선
        for (int row = 0; row < 2; row++) {
            for (int column = 0; column < 3; column++){
                System.out.print(array[row][column] + " "); //0열 출력
            }
            System.out.println(); // 한 행이 끝나면 라인변경
        }

        /*
            for문을 2번 중첩해서 사용하는데, 첫번째 for문은 행을 탐색하고, 내부에 있는 두번째 for문은 열을 탐색한다.
            내부에 있는 for문은 앞서 작성한 다음 코드와 같다. for문을 사용해서 열을 효과적으로 출력했다.
        */
    }
}
