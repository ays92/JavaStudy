package array_배열;
/*
    배열 리펙토링 - 초기화
    배열은 {} 를 사용해서 생성과 동시에 편리하게 초기화 하는 기능을 제공한다.
 */
public class Array1Ref3 {
    public static void main(String[] args) {
        int[] students; //배열 변수 선언
        students = new int[]{90, 80, 70, 60, 50}; //배열 생성과 초기화

        //변수 값 사용
        for (int i = 0; i < students.length; i++) {
            System.out.println("학생" + (i+1) + "점수 : " + students[i]); //i가 0부터 시작이기때문에
        }
    }
}
