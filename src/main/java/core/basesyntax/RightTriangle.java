package core.basesyntax;

public class RightTriangle extends Shape implements Drawable, Figure {
    // right triangle formula area is 1/2 * h * b;
    private static final double HALF = 0.5;
    private int height;
    private int base;

    @Override
    public void draw() {
        System.out.println();
    }

    @Override
    public double getArea() {
        return HALF * height * base;
    }
}