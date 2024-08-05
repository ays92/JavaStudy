package loop_반복문;
//  새로운 문제: i부터 하나씩 증가하는 수를 endNum(마지막 수)까지 더해라
public class While2_3 {
    public static void main(String[] args) {
        int count = 0;
        int i = 1;
        int endNum = 3;

        while(i <= endNum){
            count = count + i;
            System.out.println("i = "+ i + " count "+ count);
            i++;
        }
    //  이 문제를 제대로 풀기 위해서는 코드가 실행되는 횟수를 유연하게 변경할 수 있어야 한다. 한마디로 같은 코드를 반복 실행할 수 있어야 한다
    }
}
