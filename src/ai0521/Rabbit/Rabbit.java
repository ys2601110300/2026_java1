package ai0521.Rabbit;

public class Rabbit {
    // field
    private String shape; // 토끼 모양
    private int xPos; // x 포지션
    private int yPos; // y 포지션

    // constructor
    // shape
    public Rabbit(String shape) {
        this.shape = shape;
    }

    // default
    public Rabbit(){

    }

    // getter, setter
    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    public int getxPos() {
        return xPos;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }


}
