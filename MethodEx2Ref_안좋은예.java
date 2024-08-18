package method.ex;

public class MethodEx2Ref_안좋은예 {

    public static void main(String[] args) {
        System.out.println(msg(1));
    }

    public static String msg(int i){
        String msg = "hello world";
        int count = i;

        for (i = 1; i < count; i++){
            System.out.println(msg);
        }
        return msg;
    }
}
/*
    위 코드가 열등한 코드인 이유
    위 코드는 반복해서 출력하라고 한 메시지를, 단순히 반복하게 만든 수준이다
    메시지가 반복할 횟수, 메시지의 내용을 전부 일일이 바꿔야 메소드가 작동한다
    그리고 메소드 내의 변수도 하나 더 많다 결론은 불편하다 리팩토링이 제대로 이루어지지않았다
 */
