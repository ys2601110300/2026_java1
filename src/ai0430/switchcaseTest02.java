package ai0430;

import java.util.Scanner;

public class switchcaseTest02 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("출생년도에 따른 12지");
        System.out.printf("출생년도: ");
        int birth = s.nextInt();
        String result = " ";

        switch(birth % 12) {
            case 0:
                result = "원숭이";
                break;
            case 1:
                result = "닭";
                break;
            case 2:
                result = "개";
                break;
            case 3:
                result = "돼지";
                break;
            case 4:
                result = "쥐";
                break;
            case 5:
                result = "소";
                break;
            case 6:
                result = "호랑이";
                break;
            case 7:
                result = "토끼";
                break;
            case 8:
                result = "용";
                break;
            case 9:
                result = "뱀";
                break;
            case 10:
                result = "말";
                break;
            case 11:
                result = "양";
                break;
        }
        System.out.printf("%d년생 = %s띠", birth, result);
        s.close();
    }
}
