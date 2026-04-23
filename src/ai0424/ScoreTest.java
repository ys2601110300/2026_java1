package ai0424;

import java.util.Scanner;

public class ScoreTest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("나이 입력: ");
  //     System.out.println("* 프로그래밍 언어 실습 점수 입력");
  //       int score = s.nextInt();
        int age = s.nextInt();
        String result = "0";
        //      char result = '0';

        if (age <= 19)
            result = "출입 불가능";
        else
            result = "출입 가능";

        System.out.println("pc방은 만 19세 이상부터 오후10시 출입이 가능하므로\t" + result + "합니다");



       /* if(score >= 90)
            result = 'A';
        else if (score >=80)
        result = 'B';
        else if (score >=70)
            result = 'C';
        else if (score >=60)
        result = 'D';
        else
            result = 'F';

        System.out.println("*프로그래밍언어실습 과목의 학점은 " + result + "입니다."); */

        s.close();
    }
}
