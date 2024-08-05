package loop_반복문.ex;

public class LoopEx2 {
    public static void main(String[] args) {

        int num = 0;
        while(num<=20){
            num = num+2;
            System.out.println(num);
            if(num >=20) break;
        }

        System.out.println();

        for (num=0; num<=20; ){
            num = num+2;
            System.out.println(num);
            if(num >=20) break;

        }
    }
}
