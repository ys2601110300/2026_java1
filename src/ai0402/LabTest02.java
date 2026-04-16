package ai0402;

import java.util.Scanner;

public class LabTest02 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        System.out.println("파운드(lb): ");
        double num1 = s1.nextDouble();
        double num2 = num1 * 0.453592;
        System.out.printf("%.3f 파운드(lb)는 %.3f 킬로그램(kg)입니다.\n", num1, num2);

        System.out.println("킬로그램(kg): ");
        double num3 = s1.nextDouble();
        double num4 = num3 * 2.204623;
        System.out.printf("%.3f 킬로그램(kg)은 %.3f 파운드 입니다.\n",num3, num4);

        s1.close();
    }
}
