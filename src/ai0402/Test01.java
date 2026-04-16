package ai0402;

public class Test01 {
    public static void main(String[] args) {
        int result = 0;

        result -= 900 * 10; // result = result - 900 * 10
        result += 1800 * 2; // result = result + 1800 *2
        result -= 3500 * 5; // result = result - 3500 * 5
        result += 4000 * 4; // result = result + 4000 * 4
        result += 1500; // result = result + 1500
        result += 2000 * 4; // result = result + 2000 * 4
        result += 1800 * 5; // result = result + 1800 * 5

        System.out.println("총매출액은 " + result + "원 입니다.");
    }
}
