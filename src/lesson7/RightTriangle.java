package lesson7;

import java.util.Formatter;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

/**
 * @author a.shestovsky
 */

public class RightTriangle extends Triangle {
    Point lowerLeft;
    int sideA;
    int sideB;

    public RightTriangle(Point lowerLeft, int sideA, int sideB) {
        this.lowerLeft = lowerLeft;
        this.sideA = sideA;
        this.sideB = sideB;
    }

    @Override
    public double area() {
        return sideA * sideB / 2;
    }

    @Override
    public double perimeter() {
        return sideA + sideB + sqrt(pow(sideA, 2) + pow(sideB, 2));
    }

    @Override
    public String toString() {
        Formatter formatter = new Formatter();
        return formatter.format("Right triangle with start point at " + lowerLeft.getX() + ", " + lowerLeft.getY()
                + "\nSides lengths are " + sideA + ", " + sideB
                + "\nArea is %.2f", area()).toString();
    }
}