package loop_반복문;
//  do-while 문은 while 문과 비슷하지만, 조건에 상관없이 무조건 한 번은 코드를 실행한다.
public class DoWhile1 {
    public static void main(String[] args) {
        int i =10;
        do{
            System.out.println("현재 숫자는: " + i);
            i++;
        } while(i < 3);
        //do-while 은 최초 한번은 실행되기에 현재숫자~ 가 출력되지만 조건식이 불만족하므로 성립은 하지않는 식이다
    }
}
/*
    do-while 문은 최초 한번은 항상 실행된다. 따라서 먼저 현재 숫자는:10 이 출력된다.
    코드 블럭을 실행 후에 조건식을 검증하는데, i=11 이기 때문에 while (i < 3) 조건식은 거짓이 된다. 따라서 do-while 문을 빠져나온다.
    do-while 문은 최초 한번은 코드 블럭을 꼭 실행해야 하는 경우에 사용하면 된다.
 */