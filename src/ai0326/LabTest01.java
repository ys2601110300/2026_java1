package ai0326;

import java.util.Scanner;

public class LabTest01 {
    public static void main(String[] args) {
        System.out.println("## 택배 보내기입니다. 다음을 각각 입력하세요 ## ");

        Scanner s1 = new Scanner(System.in);
        Scanner s2 = new Scanner(System.in);

        System.out.println("* 받는 사람: ");
        String name = s1.nextLine();

        System.out.println("*주소 ");
        String add1 = s1.nextLine();

        System.out.println("*배송비 ");
        int num1 = s2.nextInt();

        System.out.println("** 받는 사람 ==>" + name);
        System.out.println("** 주소 사람 ==>" + add1);
        System.out.println("** 배송비 ==>" + num1 + "원");

        s1.close();
        s2.close();

    }
}
