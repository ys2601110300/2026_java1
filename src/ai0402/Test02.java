package ai0402;

import java.util.Scanner;

public class Test02 {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);
        System.out.println("운전 면허 필기 시험 합격 여부 ");
        System.out.println("점수 입력: ");
        int n1 = s1.nextInt();
        String result = ""; //empty string

        if(n1 >=70 && n1<= 100)
           result = "합격";

        else
            result = "불합격";


        System.out.printf("%s",result);
        s1.close();
    }
}
