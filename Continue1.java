package loop_반복문;

public class Continue1 {
    public static void main(String[] args) {
        int i = 1;

        while (i <= 5){
            if(i == 3){
                i++;
                continue; //즉시 조건식으로 이동한다
            }
            System.out.println(i);
            i++;
        } // i가 5보다 작은 동안에 i를 출력하고 1씩 증가시킨다, i가 3이 될때 코드를 종료한다 그리고 i를 4로 다시 진행한다
    }
}
//  continue 를 만나면 i==3 가 실행되지 않고 다시 조건식으로 이동한다. 조건식이 참이면 while 문을 실행한다.
//  i==3 인 경우 i 를 하나 증가하고 continue 를 실행한다. 따라서 이 경우에는 i 를 출력하지 않고 바로 while (i<= 5) 조건식으로 이동한다.
//  실행 결과를 보면 3일 때는 출력하지 않은 것을 확인할 수 있다