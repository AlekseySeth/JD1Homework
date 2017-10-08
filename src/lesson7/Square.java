package lesson7;

import static java.lang.Math.pow;
import static java.lang.Math.abs;

/**
 * @author a.shestovsky
 */

public class Square extends Rectangle {
    private Point lowerLeft;
    private int sideLength;

    public Square(Point lowerLeft, int sideLength) {
        this.lowerLeft = lowerLeft;
        this.sideLength = sideLength;
    }

    public Square(Point lowerLeft, Point upperRight) {
        super(lowerLeft, upperRight);
    }

    @Override
    public double area() {
        return sideLength != 0 ? pow(sideLength, 2) : super.area();
    }

    @Override
    public double perimeter() {
        return sideLength != 0 ? 4 * sideLength : super.perimeter();
    }

    @Override
    public String toString() {
        return "Square with start point at "
                + (sideLength !=0 ? (lowerLeft.getX() + ", " + lowerLeft.getY())
                                  : (super.getLowerLeft().getX() + ", " + super.getLowerLeft().getY()))
                + "\nSide length is "
                + (sideLength != 0 ? sideLength : abs(super.getUpperRight().getX() - super.getLowerLeft().getX()))
                + "\nArea is " + area();
    }
}