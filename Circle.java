package Extends;

public class Circle extends Shape {
    private Point firstPoint = new Point();
    private Point secondPoint = new Point();

    public Circle(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Circle() {

    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public void setFirstPoint(Point firstPoint) {
        this.firstPoint = firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public void setSecondPoint(Point secondPoint) {
        this.secondPoint = secondPoint;
    }


    @Override
    public String toString() {
        return "Circle{" +
                "firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                '}';
    }

    @Override
    public double getPerimetr() {
        double radius = Point.distanceFromPointToPoint(getFirstPoint(),getSecondPoint());
        return 2*Math.PI*radius;
    }

    @Override
    public double getArea() {
        double radius = Point.distanceFromPointToPoint(getFirstPoint(),getSecondPoint());
        return Math.PI*Math.pow(radius,2);
    }
}
