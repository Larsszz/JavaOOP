package LvL2;

public class TriangleChange {
    private int side1;
    private int side2;
    private int side3;

    public TriangleChange(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public TriangleChange() {
    }

    public int getSide1() {
        return side1;
    }

    public void setSide1(int side1) {
        this.side1 = side1;
    }

    public int getSide2() {
        return side2;
    }

    public void setSide2(int side2) {
        this.side2 = side2;
    }

    public int getSide3() {
        return side3;
    }

    public void setSide3(int side3) {
        this.side3 = side3;
    }

    public double getSquare () {
        double halfOfP = (side1+side2+side3)/2;
        double square = Math.sqrt((halfOfP*(halfOfP-side1)*(halfOfP-side2)*(halfOfP-side3)));
        return square;
    }

    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
