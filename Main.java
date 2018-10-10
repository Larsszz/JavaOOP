package Extends;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(0, 0);

        Circle cr1 = new Circle(p4, p3);
        Desk desk = new Desk();
        desk.putShape(cr1);
        System.out.println(desk);
    }
}
