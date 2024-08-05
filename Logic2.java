package operator_연산자;

public class Logic2 {
    public static void main(String[] args) {
        int a = 15;
        //a는 10보다 크고 20보다 작다
        boolean result = a > 10 && a < 20; // (a > 10) && ( a < 20) 같은 내용이다
        // 10 < a && a < 20 으로 하면 10과 20사이에 a가 있어서 좀더 읽기에 좋아보인다
        System.out.println("result = " + result);
    }
}
