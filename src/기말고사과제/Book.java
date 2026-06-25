package 기말고사과제;

public class Book {
    protected String title;
    protected String author;
    protected int borrowed; // 0: 대출 가능, 1: 대출 중

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.borrowed = 0;
    }

    public void borrowBook() {
        if (borrowed == 0) {
            borrowed = 1;
            System.out.println(title + " 도서를 대출했습니다.");
        } else {
            System.out.println(title + " 도서는 이미 대출 중입니다.");
        }
    }

    public void returnBook() {
        if (borrowed == 1) {
            borrowed = 0;
            System.out.println(title + " 도서를 반납했습니다.");
        } else {
            System.out.println(title + " 도서는 현재 대출 상태가 아닙니다.");
        }
    }

    public void showInfo() {
        String state;
        if (borrowed == 1) {
            state = "대출 중";
        } else {
            state = "대출 가능";
        }

        System.out.println("제목: " + title + ", 저자: " + author + ", 상태: " + state);
    }
}
