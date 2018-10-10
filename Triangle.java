package Extends;

public class Triangle extends Shape {
    private Point firstPoint = new Point();
    private Point secondPoint = new Point();
    private Point thirdPoint = new Point();

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        firstPoint.setX(x1);
        firstPoint.setY(y1);
        secondPoint.setX(x2);
        secondPoint.setY(y2);
        thirdPoint.setX(x3);
        thirdPoint.setY(y3);
    }

    public Triangle() {

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

    public Point getThirdPoint() {
        return thirdPoint;
    }

    public void setThirdPoint(Point thirdPoint) {
        this.thirdPoint = thirdPoint;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                ", thirdPoint=" + thirdPoint +
                '}';
    }

    @Override
    public double getPerimetr() {
        double firstSide = Point.distanceFromPointToPoint(getSecondPoint(),getFirstPoint());
        double secondSide = Point.distanceFromPointToPoint(getSecondPoint(),getThirdPoint());
        double thrirdSide = Point.distanceFromPointToPoint(getFirstPoint(),getThirdPoint());
        return firstSide + secondSide + thrirdSide;
    }

    @Override
    public double getArea() {
        double firstSide = Point.distanceFromPointToPoint(getSecondPoint(),getFirstPoint());
        double secondSide = Point.distanceFromPointToPoint(getSecondPoint(),getThirdPoint());
        double thrirdSide = Point.distanceFromPointToPoint(getFirstPoint(),getThirdPoint());
        double halfOfPerimetr = (firstSide + secondSide + thrirdSide) / 2;
        return Math.sqrt(halfOfPerimetr * (halfOfPerimetr - firstSide) * (halfOfPerimetr - secondSide) *
                (halfOfPerimetr - thrirdSide));
    }
}
