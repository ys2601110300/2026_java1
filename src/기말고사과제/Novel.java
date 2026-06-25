package 기말고사과제;

public class Novel extends Book {
    private String genre;

    public Novel(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    @Override
    public void showInfo() {
        String state;
        if (borrowed == 1) {
            state = "대출 중";
        } else {
            state = "대출 가능";
        }

        System.out.println("[소설책] 제목: " + title + ", 저자: " + author + ", 장르: " + genre
                + ", 상태: " + state);
    }
}

