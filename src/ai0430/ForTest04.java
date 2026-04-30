package ai0430;

import java.util.Scanner;

public class ForTest04 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i,sum = 0;
        System.out.println("정수 num1: 입력: ");
            int num1 = s.nextInt();

        if (num1> 1001) {
            for (i = 1001; i <= num1; i += 2) {
                sum += i;
            }
            System.out.printf("홀수의 합: %d", sum);
        }
            else
            System.out.println("값을 다시 입력하세요");

        s.close();
    }
}
