package array_배열.ex;
// Array1 클래스를 배열로 바꿔보는 문제
public class ArrayEx1 {
    public static void main(String[] args) {

        int[] student = {90,80,70,60,50};
        int total = 0;

        for(int i = 0; i < student.length; i++){
            System.out.println("student " + (i+1) + " 점수는 " + student[i]);
            total += student[i];
        }

        double average = (double) total/5;
        System.out.println("점수 총합 : " + total);
        System.out.println("점수 평균 : " + average);
        //total += student;
    }
}
