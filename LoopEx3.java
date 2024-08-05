package loop_반복문.ex;

public class LoopEx3 {
    public static void main(String[] args) {

        int sum = 0;
        int max = 5;
        int i = 1;

        while(i <= max){
            sum += i;
            i++;
        }
        System.out.println(sum);

    }
}
