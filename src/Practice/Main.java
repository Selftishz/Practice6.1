package Practice;
class Main {

    public static void main(String args[]) {

        MovableCircle movableCircle = new MovableCircle(63,23,0,0,5);
        System.out.println(movableCircle.toString());
        movableCircle.moveLeft(33);
        System.out.println(movableCircle.toString());
        MovableRectangle movableRectangle = new MovableRectangle(12,2,33,1,12,2);
        movableRectangle.moveUp(23);
        System.out.println(movableRectangle.toString());
        Planet planet = new Planet("Mars");
        System.out.println(planet.getName());

    }
}
