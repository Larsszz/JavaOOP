package Lesson1;

public class TriangleTest {
    public static void main(String[] args) {
        Triangle firtTriangle = new Triangle(2, 3, 4);
        Triangle secondTriangle = new Triangle(9, 3, 4);
        System.out.println(firtTriangle.toString());
        System.out.println(firtTriangle.getSquare());
        System.out.println(secondTriangle.toString());
        System.out.println(secondTriangle.getSquare());
    }
}
