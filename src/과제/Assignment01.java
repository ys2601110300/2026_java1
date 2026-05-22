package 과제;

import java.util.Random;
import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {
        // 프로그래밍언어실습 중간고사 과제 2601110300, 장영서
        // 사용 언어: JAVA, 사용 기술: Scanner, Random, While, For, If, else if, else
        Scanner s = new Scanner(System.in);
        Random random = new Random();

        System.out.println("==== 숫자 맞추기 게임 ====");
        int gamestart = 1;                                         // 시작 명령어
        int maxnumber = 1;                                       // 1~숫자 범위
        int life = 0;                                              // 목숨

        while(gamestart == 1){
            System.out.println("*난이도*를 선택해주세요.");
            System.out.println("*1. Easy* (1 ~ 50)");
            System.out.println("*2. Normal* (1 ~ 100)");
            System.out.println("*3. Hard* (1 ~ 200)");
            System.out.println("*4. Extreme* (1 ~ 500)");
            System.out.printf("난이도 입력 : ");
            int level = s.nextInt();                                   // 레벨 인풋

                if (level == 1) {                                    //숫자. 1입력시 *쉬움* 단계 작동
                    System.out.println("\n쉬움 난이도가 선택되었습니다.(남은 목숨: 10)");
                    maxnumber = 50;                              // 1~50까지의 숫자
                    life = 10;                                     // 목숨: 10개
                    break;                                        // while문 종료
                }
                else if (level == 2) {                               //숫자.2 입력시 *보통* 단계 작동
                    System.out.println("\n보통 난이도가 선택되었습니다.(남은 목숨: 8)");
                    maxnumber = 100;                            // 1~100까지의 숫자
                    life = 8;                                     // 목숨: 8개
                    break;                                       // while문 종료
                }
                else if (level == 3) {                               //숫자.3 입력시 *어려움* 단계 작동
                    System.out.println("\n어려움 난이도가 선택되었습니다.(남은 목숨: 5)");
                    maxnumber = 200;                            // 1~200까지의 숫자
                    life = 5;                                     // 목숨: 5개
                    break;                                       // while문 종료
                }
                else if (level == 4) {                               // 숫자.4 입력시 *익스트림* 단계 작동
                    System.out.println("\n익스트림 난이도가 선택되었습니다.(남은 목숨: 5)");
                    maxnumber = 500;                            // 1~500까지의 숫자
                    life = 5;                                     // 목숨: 5개
                    break;                                       // while문 종료
                }
                else {
                    System.out.println("\n잘못된 난이도입니다. 다시 입력해주세요."); // 1번~4번 외의 숫자 입력시 while문 작동 다시 난이도 입력화면으로
                }
            }
        int c_answer = random.nextInt(maxnumber);                   // 정답을 (1부터 maxnumber 까지의)랜덤한 숫자로 지정
        System.out.println("1 ~ " + maxnumber + "까지의 숫자 중 정답을 맞춰보세요");
        for(int  i = life-1; i >= 0; i--){   // 반복횟수를 남은목숨-1로 잡아서 최초로 틀렸을 시 남은 목숨이 -1이 된 상태로 시작되게 설정, 이후 틀릴때마다 -1씩 차감
            System.out.printf("정답 입력: ");
            int u_answer = s.nextInt();     // 사용자가 입력할 답
            life = i;                     //  남은 목숨이 i 와 동일하게 표시
            if (life == 0){                // 목숨이 0이 됐을 경우
                System.out.println("게임 오버, 정답은 " + c_answer + " 입니다."); //게임 종료
                break;
            }
            if (u_answer == c_answer){    // 사용자의 답이 컴퓨터의 정답과 일치할 경우
                System.out.println("\n정답! 축하해요!");
                break;                                  //게임 종료
            }
            else if (u_answer > c_answer){        // 사용자의 답이 컴퓨터의 정답보다 큰 경우
                System.out.println("\n더 작은 수 입니다.\n남은 목숨: " + life);        // 정답이 더 작다고 표시됨으로써 사용자의 정답 유추에 대한
            }
            else
                System.out.println("\n더 큰 수 입니다.\n남은 목숨: " + life);         // 정답이 더 크다고 표시됨으로써 사용자의 정답 유추에 대한
        }                                                                 // 가능성을 높여주며 틀림으로써 반복문으로 차감된 사용자의 남은 목숨을 다시 표시
        s.close();
    }
}

