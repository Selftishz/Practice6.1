package Practice;

public class MovableCircle implements Movable {
 private int radius;
 private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle {\n" +
                "\nradius: " + radius +
                "\n center: " + center +
                "\n}";
    }
    public void moveUp(int y) {center.moveUp(y);}
    public void moveDown(int y) {center.moveUp(y);}
    public void moveRight(int x) {center.moveRight(x);}
    public void moveLeft(int x) {center.moveLeft(x);}
}
