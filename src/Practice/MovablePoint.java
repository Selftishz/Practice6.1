package Practice;

public class MovablePoint implements Movable {
    private int x, y, xSpeed, ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed)
    {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint {\n" +
                "x: " + x +
                "\n y: " + y +
                "\n xSpeed = " + xSpeed +
                "\n ySpeed = " + ySpeed +
                "\n}";
    }
    public void moveUp(int y) {this.y += y;}
    public void moveDown(int y) {this.y -= y;}
    public void moveRight(int x) {this.x += x;}
    public void moveLeft(int x) {this.x -= x;}

}
