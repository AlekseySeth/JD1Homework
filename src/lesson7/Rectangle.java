package lesson7;

import static java.lang.Math.abs;

/**
 * @author a.shestovsky
 */

public class Rectangle implements Shape {
    private Point lowerLeft;
    private Point upperRight;

    protected Rectangle() {}

    public Rectangle (Point lowerLeft, Point upperRight) {
        this.lowerLeft = lowerLeft;
        this.upperRight = upperRight;
    }

    public Point getLowerLeft() {
        return lowerLeft;
    }

    public Point getUpperRight() {
        return upperRight;
    }

    public double diagonal () {
        return lowerLeft.distanceBetween(upperRight);
    }

    @Override
    public double area() {
        return Math.abs((upperRight.getX() - lowerLeft.getX()) * (upperRight.getY() - lowerLeft.getY()));
    }

    @Override
    public double perimeter() {
        return 2 * (abs(upperRight.getX() - lowerLeft.getX()) + abs(upperRight.getY() - lowerLeft.getY()));
    }

    @Override
    public boolean isAreaEquals(Shape shape) {
            return area() == shape.area();
    }

    @Override
    public String toString() {
        return "Rectangle with start point at " + lowerLeft.getX() + ", " + lowerLeft.getY()
                + "\nDiagonal length is " + diagonal()
                + "\nArea is " + area();
    }
}