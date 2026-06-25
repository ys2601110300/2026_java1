package 기말고사과제;

public class MajorBook extends Book {
    private String subject;

    public MajorBook(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    @Override
    public void showInfo() {
        String state;
        if (borrowed == 1) {
            state = "대출 중";
        } else {
            state = "대출 가능";
        }

        System.out.println("[전공책] 제목: " + title + ", 저자: " + author + ", 과목: " + subject
                + ", 상태: " + state);
    }
}
