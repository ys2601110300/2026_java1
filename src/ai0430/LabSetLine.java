package ai0430;

import java.util.Scanner;

public class LabSetLine {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int fact = 1;
        System.out.println("학생 A부터 n명: ");
        int friends_num = s.nextInt();
        for ( int i = 1; i <= friends_num; i++)
        {
            fact = fact * i;
        }
        System.out.printf("A부터 n까지의 학생을 순서대로 세우는 경우의 수" + fact);
    }
}
