package ai0430;

import java.util.Scanner;

public class switchcaseTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println(" 1~10 까지의 숫자 중에서 정수 입력: ");
        int num = s.nextInt();
        String result = " ";

        switch (num){
            case 1:
            case 3:
            case 5:
            case 7:
            case 9:
                result = "홀수";
                break;
            case 2:
            case 4:
            case 6:
            case 8:
            case 10:
                result = "짝수";
                break;
        }

        System.out.printf("%d = %s", num, result);
        s.close();
    }

}
