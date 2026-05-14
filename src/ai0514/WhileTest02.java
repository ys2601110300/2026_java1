package ai0514;

import java.util.Scanner;

public class WhileTest02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int h = 0;
        int num1, num2 = 0 ;

        while (true) {
            System.out.println("숫자 1 ==> ");
            num1 =  s.nextInt();
            System.out.println("숫자 2 ==> ");
            num2 =  s.nextInt();

            h = num1 + num2;
            System.out.println(num1 + " + " + num2 + " = "  + h);

            if ( num1 == -1){
                break;
            }
        }
    }
}
