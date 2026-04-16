package ai0416;

import java.util.Scanner;

public class OverLapTest {
    public static void main(String[] args) {
        System.out.println("----------- 짝수 / 홀수 판별 -------------");
        Scanner s = new Scanner(System.in);
        System.out.print("정수를 입력: ");
        int num = s.nextInt();

        if(num > 100){
            if(num < 1000)
                System.out.printf("input: %d = 100 < %d < 1000\n", num, num);
            else
                System.out.printf("input: %d = %d > 1000\n", num, num);
        }
        else {
            System.out.printf("input: %d = %d <100\n", num, num);
        }
        s.close();
    }
}
