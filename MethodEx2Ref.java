package method.ex;

public class MethodEx2Ref {

    public static void main(String[] args) {
        msg("정답!", 3);
    }

    public static void msg(String msg, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(msg);
        }
    }
}

