package 기말고사과제;

import java.util.Scanner;

public class LibraryManager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Book[] books = new Book[3];
        books[0] = new Novel("어린 왕자", "생텍쥐페리", "동화");
        books[1] = new MajorBook("자바 프로그래밍", "홍길동", "프로그래밍");
        books[2] = new Magazine("과학 잡지", "과학출판사", 202);

        int choice;

        do {
            System.out.println("\n=== 도서관 도서 관리 프로그램 ===");
            System.out.println("1. 전체 도서 정보 보기");
            System.out.println("2. 도서 대출");
            System.out.println("3. 도서 반납");
            System.out.println("4. 종료");
            System.out.print("메뉴 선택: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("\n[전체 도서 정보]");
                    for (int i = 0; i < books.length; i++) {
                        System.out.print((i + 1) + ". ");
                        books[i].showInfo();
                    }
                    break;

                case 2:
                    System.out.print("대출할 도서 번호 입력: ");
                    int borrowNum = scanner.nextInt();
                    if (borrowNum >= 1 && borrowNum <= books.length) {
                        books[borrowNum - 1].borrowBook();
                    } else {
                        System.out.println("잘못된 번호입니다.");
                    }
                    break;

                case 3:
                    System.out.print("반납할 도서 번호 입력: ");
                    int returnNum = scanner.nextInt();
                    if (returnNum >= 1 && returnNum <= books.length) {
                        books[returnNum - 1].returnBook();
                    } else {
                        System.out.println("잘못된 번호입니다.");
                    }
                    break;

                case 4:
                    System.out.println("프로그램을 종료합니다.");
                    break;

                default:
                    System.out.println("올바른 메뉴를 선택하세요.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

