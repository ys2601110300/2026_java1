package ai0611.lab.Car;

public class Car {
    // 상속관계에 있는 sub class (자식 클래스)만 접근이 가능
    protected int speed;

    public void upSpeed(int speed){
        this.speed += speed;
    }

    public int getSpeed() {
        return speed;
    }
}
