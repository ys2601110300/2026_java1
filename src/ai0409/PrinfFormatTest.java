package ai0409;

public class PrinfFormatTest {
    public static void main(String[] args) {
        System.out.printf("%d\n", 345);
        System.out.printf("%5d\n", 345);
        System.out.printf("%05d\n", 345);

        System.out.println("난생처음자바");;
        System.out.printf("%s", "난생처음자바\n");
        System.out.println("%30s,난생처음 자바\n");

    String s1 = " d인공지능 \'소프트웨어과 \'";
        System.out.println(s1);

        String s2 = "한국\n폴리\\텍n대\t학";
        System.out.println(s2);

    }
}
