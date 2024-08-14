package scanner_스캐너.ex;
// a 와 b의 값을 바꿔서 출력
public class ChangeVarEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = 0;
        // a 와 b 만으로 값을 바꿔서 출력할수는 없다 바꾸려면 어쨋든 서로 대입을해서 뭔가 해야하는데 대입하는중에 한가지 값은 사라진다 그래서 다른 변수가 필요

        temp = a;
        a = b;
        b = temp;
        // a를 우선 temp에 대입한다. (10이라는 값을 temp에 저장함)
        // b를 a에 대입한다 (a를 20으로 바꿈)
        // 10이 들어있는 temp를 b에 대입한다
        // 그러면 a는 b의 값을 받고, b는 a의 값을 받는다.

        System.out.println("a = "+a);
        System.out.println("b = "+b);
    }
}
