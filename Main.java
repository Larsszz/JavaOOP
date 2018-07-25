package LvL2;

public class Main {
    public static void main(String[] args) {
        Point p1 = new Point(1, 1);
        Point p2 = new Point(1, 2);
        Point p3 = new Point(2, 2);
        Point p4 = new Point(0,0);
        Triangle tr1 = new Triangle(p1, p2, p3);
        System.out.println(tr1.getPerimetr());
        System.out.println(tr1.getArea());

        Triangle tr2 = new Triangle(1, 1, 1, 2, 2, 2);
        System.out.println(tr2.getPerimetr());
        System.out.println(tr2.getArea());

        Circle cr1 = new Circle(p4,p3);
        System.out.println(cr1.getPerimetr());
        System.out.println(cr1.getArea());

        Rectangle rc1 = new Rectangle(p4,p3);
        System.out.println(rc1.getPerimetr());
        System.out.println(rc1.getArea());

    }
}
