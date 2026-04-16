package ai0326;

import java.util.Scanner;

public class ScannerTest03 {
    public static void main(String[] args) {
        System.out.println("====== BMI 계산 ======");
        Scanner s = new Scanner(System.in);

        Scanner s1 = new Scanner(System.in);

        System.out.println("체중 입력:");
        double weight = s.nextDouble();

        System.out.println("키 입력:");
        double height = s.nextDouble();

        System.out.println("* 성명 입력:");
        String name = s1.nextLine();

        double bmi = weight/ Math.pow(height/100,2);

        System.out.printf("*%s 님의 BMI 지수 결과: %.2f㎏/㎡", name, bmi);

        s.close();
        s1.close();
    }
}
