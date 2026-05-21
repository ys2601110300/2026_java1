package ai0521.car;

public class RunCar {
    public static void main(String[] args) {
        car01 sonata = new car01("현대 자동차", "소나타", 1600, "은색", 4000000);
        System.out.println("===== 자동차 정보 =====");
        System.out.println("제조사: " + sonata.getProduct());
        System.out.println("자동차 모델: " + sonata.getName());
        System.out.println("배기량: " + sonata.getDisplacement() + "cc");
        System.out.println("색상: " + sonata.getColor());
        System.out.println("가격: " + sonata.getPrice());
        System.out.println();

        sonata.starton();
        sonata.drive();
        sonata.forward();
        sonata.rotate("좌회전");
        sonata.drive();
        System.out.println();

        car01 ev6 = new car01();
        ev6.setProduct("기아 자동차");
        ev6.setName("EV6");
        ev6.setDisplacement(2000);
        ev6.setColor("blue");
        ev6.setPrice(50000000);

        System.out.println("제조사: " + ev6.getProduct());
        System.out.println("자동차 모델: " + ev6.getName());
        System.out.println("배기량: " + ev6.getDisplacement() + "cc");
        System.out.println("색상: " + ev6.getColor());
        System.out.println("가격: " + ev6.getPrice());
        System.out.println();
    }
}
