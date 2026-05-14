package ai0514;

public class ContinueTest02 {
    public static void main(String[] args) {
        int sum = 0;

        for ( int i = 2; i <= 100; i ++){
            if (i % 2 == 1) {
                continue;
            }
            sum += i;
        }
        System.out.println("1~100 까지의 짝수의 합: " + sum);
    }
}
