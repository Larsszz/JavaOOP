package LvL2;

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
        double firstSide = Math.sqrt(Math.pow((secondPoint.getX() - firstPoint.getX()), 2)
                + Math.pow((secondPoint.getY() - firstPoint.getY()), 2));
        double secondSide = Math.sqrt(Math.pow((thirdPoint.getX() - secondPoint.getX()), 2)
                + Math.pow((thirdPoint.getY() - secondPoint.getY()), 2));
        double thrirdSide = Math.sqrt(Math.pow((thirdPoint.getX() - firstPoint.getX()), 2)
                + Math.pow((thirdPoint.getY() - firstPoint.getY()), 2));
        return firstSide + secondSide + thrirdSide;
    }

    @Override
    public double getArea() {
        double firstSide = Math.sqrt(Math.pow((secondPoint.getX() - firstPoint.getX()), 2)
                + Math.pow((secondPoint.getY() - firstPoint.getY()), 2));
        double secondSide = Math.sqrt(Math.pow((thirdPoint.getX() - secondPoint.getX()), 2)
                + Math.pow((thirdPoint.getY() - secondPoint.getY()), 2));
        double thrirdSide = Math.sqrt(Math.pow((thirdPoint.getX() - firstPoint.getX()), 2)
                + Math.pow((thirdPoint.getY() - firstPoint.getY()), 2));
        double halfOfPerimetr = (firstSide + secondSide + thrirdSide) / 2;
        return Math.sqrt(halfOfPerimetr * (halfOfPerimetr - firstSide) * (halfOfPerimetr - secondSide) * (halfOfPerimetr - thrirdSide));
    }
}
