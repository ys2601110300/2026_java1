package ai0611.abstractTest;
//  추상 클래스
public abstract class Person {
    String name;
    int weight;
    int height;

    public void eat(String food){
        System.out.println(food + "를 먹는다.");
    }

    public void sleep(int hour){
        System.out.println(hour + "시간 잔다.");
    }

    //  추상 메소드
    public abstract void study();
}
