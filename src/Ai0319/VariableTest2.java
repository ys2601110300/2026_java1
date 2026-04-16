package Ai0319;

public class VariableTest2 {
    public static void main(String[] args) {
        int num1, num2, result, result2,result3;

        num1 = 300;
        num2 = 500;
        result = num1 + num2;
        result2 = num1 * num2;
        result3 = num1 / num2;

        System.out.println(num1+ " + " + num2 + " = " + result);
        System.out.printf("%d + %d = %d\n", num1, num2 ,result);
        System.out.printf("%d × %d = %d%n", num1, num2 ,result2);
        System.out.printf("%d ÷ %d = %d", num1, num2 ,result3);
     //지역 변수는 반드시 int를 설정해야 한다,
    }
}
