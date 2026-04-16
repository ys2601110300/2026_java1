package ai0402;

import java.util.Scanner;

public class LabTest01 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.print("정수 1: ");
        int num1 = s1.nextInt();

        System.out.print("정수 2: ");
        int num2 = s1.nextInt();

        System.out.printf("%d + %d = %d\n", num1, num2 ,num1 + num2);
        System.out.printf("%d - %d = %d\n", num1, num2 ,num1 - num2);
        System.out.printf("%d × %d = %d\n", num1, num2 ,num1 * num2);
        System.out.printf("%d ÷ %d = %.2f\n", num1, num2 ,(double)num1 / num2);
        System.out.printf("%d %% %d = %d\n", num1, num2 ,num1 % num2);

        s1.close();
    }
}
