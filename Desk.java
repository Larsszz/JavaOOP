package Extends;

public class Desk {
    private Shape[] field = new Shape[4];

    public Desk() {
    }

    public Shape[] getField() {
        return field;
    }

    public void putShape(Shape shape) {
        for (int i = 0; i < field.length; i++) {
            if (field[i] == null) {
                field[i] = shape;
                return;
            }
        }
        System.out.println("Sorry, but desk is full.");
    }


    public void deleteShape(int position) {
        if (position >= 0 && position < 4) {
            field[position] = null;
        } else {
            System.out.println("Exit out desk");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : field) {
            if (shape == null) {
                continue;
            }
            sb.append(shape.toString()).append("/n");
        }
        return sb.toString() + getFullArea();
    }

    public String getFullArea() {
        double fullArea = 0;
        for (Shape shape : field) {
            if (shape == null) {
                continue;
            }
            fullArea += shape.getArea();
        }
        return "Full area of shapes on desk = " + fullArea;
    }
}
