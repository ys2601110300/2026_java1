package ai0424;

import java.util.Random;
import java.util.Scanner;

public class RockTest {
    public static void main(String[] args) {
        System.out.println("가위바위보 게임");
        Scanner s = new Scanner(System.in);
        System.out.println("가위 바위 보 중에 하나를 입력: ");
        String me = s.nextLine();

        String[] computer = {"가위", "바위", "보"};
        Random random = new Random();
        int randNum = random.nextInt(3) - 1;
        String computerchoice = computer[randNum];

        System.out.println("컴퓨터의 가위, 바위, 보 : " + computer[randNum]);

        String result = " ";

        if (me.equals("가위")) {
            if (computerchoice.equals("가위"))
                result = "비겼습니다";
            else if (computerchoice.equals("바위"))
                result = "졌습니다";
            else
                result = "이겼습니다";
        } else if (me.equals("바위")) {
            if (computerchoice.equals("가위"))
                result = "이겼습니다";
            else if (computerchoice.equals("바위"))
                result = "비겼습니다";
            else
                result = "졌습니다";
        } else {
            if (computerchoice.equals("가위"))
                result = "졌습니다";
            else if (computerchoice.equals("바위"))
                result = "이겼습니다";
            else
                result = "비겼습니다";
        }
        System.out.printf(" 나는 %s, 컴퓨티 %s이므로 %s", me, computerchoice, result);
        s.close();
    }
}
