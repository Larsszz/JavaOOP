package Lesson1;

public class Triangle {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }


    public String getSquare () {
        double halfOfP =(double) (side1+side2+side3)/2;
        double square = Math.sqrt((halfOfP*(halfOfP-side1)*(halfOfP-side2)*(halfOfP-side3)));
        if (square==0 || Double.isNaN(square)) return "There is no such triangle";
        return "Square = "+ square;
    }

    public String toString() {
        return "Triangle{" +
                "side1=" + side1 +
                ", side2=" + side2 +
                ", side3=" + side3 +
                '}';
    }
}
