package ai0424;

import java.util.Scanner;

public class BMITest02 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("몸무게 입력: ");
        double weight = s1.nextDouble();

        System.out.println("키 입력: ");
        double height = s1.nextDouble();

        double bmi = weight/ Math.pow(height/100,2);
        System.out.printf("BMI: %f\n",bmi);
        String result = "0";

        if(bmi < 18.5)
            result = ("저체중");
        else if (bmi <23)
            result = ("정상");
        else if (bmi < 25)
            result = ("위험체중");
        else if (bmi < 30)
            result = ("1단계 비만");
        else
            result = ("2단계 비만");

        System.out.printf(result);

        s1.close();
    }
}
