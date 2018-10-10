package Extends;

public class Rectangle extends Shape{
    private Point firstPoint = new Point();
    private Point secondPoint = new Point();
    private Point thirdPoint = new Point(firstPoint.getX(),secondPoint.getY());
    private Point fourPoint = new Point(secondPoint.getX(), firstPoint.getY());

    public Rectangle(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
    }

    public Rectangle() {
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

    public Point getFourPoint() {
        return fourPoint;
    }

    public void setFourPoint(Point fourPoint) {
        this.fourPoint = fourPoint;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "firstPoint=" + firstPoint +
                ", secondPoint=" + secondPoint +
                ", thirdPoint=" + thirdPoint +
                ", fourPoint=" + fourPoint +
                '}';
    }

    /*public void createPoints() {
        thirdPoint = new Point(firstPoint.getX(),secondPoint.getY());
        fourPoint = new Point(secondPoint.getX(), firstPoint.getY());
    }*/

    @Override
    public double getPerimetr() {
        double firstSide = Point.distanceFromPointToPoint(getFirstPoint(),getSecondPoint());
        double secondSide = Point.distanceFromPointToPoint(getSecondPoint(),getThirdPoint());
        return (firstSide+secondSide)*2;
    }

    @Override
    public double getArea() {
        double firstSide = Point.distanceFromPointToPoint(getFirstPoint(),getSecondPoint());
        double secondSide = Point.distanceFromPointToPoint(getSecondPoint(),getThirdPoint());
        return firstSide*secondSide;
    }
}
