package method.ex;
public class MethodEx3Ref_안좋은예 {

    public static void main(String[] args) {
        int deposit;
        System.out.println("최종잔액" + inOut(10000,20000,20000) + "원");
    }

    public static int inOut(int deposit, int in, int out){
        deposit = deposit + in;
        System.out.println(in + " 원이 입금되었습니다. 잔액은 " + deposit + " 원 입니다");

        if (out > deposit){
            System.out.println("잔액이 부족합니다. 현재 금액은 : " + deposit + " 원 입니다");
        } else {
            deposit = deposit - out;
            System.out.println(out + " 원이 출금되었습니다. 잔액은 " + deposit + " 원 입니다");
        }
        return deposit;
    }
}
// 코드는 짧아졌지만 가독성이 좋지않고 유지보수 하기가 어렵다. 하나의 메소드에는 하나의 기능만 들어가는것이 원칙이다.