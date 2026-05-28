package ai0521.Rabbit;

public class RunRabbit {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        Rabbit rabbit2 = new Rabbit("좁은 네모");

        rabbit.setLocation(50, 50);
        rabbit2.setLocation(150, 70);

        rabbit.setShape("기본");
        rabbit.printInfo();
        rabbit2.printInfo();

        // 기본 모양의 토끼를 다이아몬드 모양의 토끼로 변경, 위치는 현재 x좌표에서 오른쪽으로 60 이동, 아래로 20 이동
        rabbit.setShape("다이아몬드");
        rabbit.setLocation(110, 30);
        rabbit.printInfo();

        // 좁은 네모 모양의 토끼가현재 위치에서 오른쪽 50, 왼쪽 20 이동
        rabbit2.printInfo();
        for (int i =1; i < 6; i++){
            rabbit2.changeLocation();
        }

        rabbit2.printInfo();

        for (int i =1; i < 3; i++){
            rabbit2.changeLocation2();
        }

        rabbit2.printInfo();

    }
}
