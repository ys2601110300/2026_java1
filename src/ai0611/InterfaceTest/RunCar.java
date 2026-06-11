package ai0611.InterfaceTest;

public class RunCar {
    public static void main(String[] args) {
        //  인터페이스는 추상 클래스처럼 new연산자로 객체 생성이 불가능하다.
        //  Car car = new Car();
        Sportage sportage = new Sportage();
        System.out.println(Car.PRODUCT);
        System.out.println(Car.ADDRESS);
        sportage.start();
        sportage.upSpeed(50);
        sportage.downSpeed(10);
        sportage.rotate("좌");
        sportage.stop();
    }
}
