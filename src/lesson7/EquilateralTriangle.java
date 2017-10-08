package lesson7;

import java.util.Formatter;

import static java.lang.Math.sqrt;

/**
 * @author a.shestovsky
 */

public class EquilateralTriangle extends Triangle {
    private int sideLength;
    private Point lowerLeft;

    public EquilateralTriangle(Point lowerLeft, int sideLength) {
        this.sideLength = sideLength;
        this.lowerLeft = lowerLeft;
    }

    @Override
    public double perimeter() {
        return 3 * sideLength;
    }

    public double height() {
        return sqrt(3) / 2 * sideLength;
    }

    @Override
    public double area() {
        return height() * sideLength / 2;
    }

    @Override
    public String toString() {
        Formatter formatter = new Formatter();
        return formatter.format("Equilateral triangle with start point at " + lowerLeft.getX() + ", " + lowerLeft.getY()
                + "\nSide length is " + sideLength
                + "\nArea is %.2f", area()).toString();
    }
}