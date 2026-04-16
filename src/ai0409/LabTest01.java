package ai0409;

import java.util.Scanner;

public class LabTest01 {
    public static void main(String[] args) {
        Scanner d1 = new Scanner(System.in);

        System.out.println("과목 1 학점: ");
        double pjt1 = d1.nextDouble();

        System.out.println("과목 2 학점: ");
        double pjt2 = d1.nextDouble();

        System.out.println("과목 3 학점: ");
        double pjt3 = d1.nextDouble();

        double avg = (pjt1 + pjt2 + pjt3)/3 ;

        System.out.printf("\n평균학점: %.2f\n\n",avg);

        if (pjt1 >= 3) {
            System.out.println("과목 1: 합격");
        }
        else {
            System.out.println("과목 1: 불합격");
        }
        if (pjt2 >= 3) {
            System.out.println("과목 2: 합격");
        }
        else {
            System.out.println("과목 2: 불합격");
        }
        if (pjt3 >= 3) {
            System.out.println("과목 3: 합격");
        }
        else {
            System.out.println("과목 3: 불합격");
        }
        d1.close();
    }
}
