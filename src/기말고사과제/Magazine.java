package 기말고사과제;

public class Magazine extends Book {
    private int issueNumber;

    public Magazine(String title, String author, int issueNumber) {
        super(title, author);
        this.issueNumber = issueNumber;
    }

    @Override
    public void showInfo() {
        String state;
        if (borrowed == 1) {
            state = "대출 중";
        } else {
            state = "대출 가능";
        }

        System.out.println("[잡지] 제목: " + title + ", 발행인: " + author + ", 호수: " + issueNumber
                + ", 상태: " + state);
    }
}