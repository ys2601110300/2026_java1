package ai0430;

public class ForTest03 {
    public static void main(String[] args) {
        int num1 = 10;
        int i = 0;
        int sum = 0;
        for (i = 1; i <=num1; i++)
        {
            sum += i;
            if ( i < 10)
                System.out.printf(i + "+");
            else
                System.out.printf(i + "=");
        }
        System.out.printf( "%d", sum);

    }
}
