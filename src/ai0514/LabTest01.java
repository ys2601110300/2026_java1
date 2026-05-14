package ai0514;

import java.util.Random;
import java.util.Scanner;

public class LabTest01 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner s = new Scanner(System.in);
        int i = 1;
        int USERnum = 0;
        int PCnum = 0;

        while (true) {
            PCnum = random.nextInt(5) + 1;
            System.out.println(" 게임 " + i + "회: 컴퓨터가 생각한 숫자는 무엇일까요?");
            USERnum = s.nextInt();
            if (PCnum == USERnum) {
                System.out.println("축하");
                break;
            }
            System.out.println("PCnum = " + PCnum + "\nUSERnum = " + USERnum);
            i++;
        }
        System.out.println("게임 종료 ");
        s.close();
    }
}
