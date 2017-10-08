package lesson7;

import java.util.Formatter;

import static java.lang.Math.PI;
import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * @author a.shestovsky
 */

public class Circle implements Shape, Rolling, Positioning {
    private Point center;
    private int radius;

    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * pow(radius, 2);
    }

    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }

    @Override
    public boolean isAreaEquals(Shape shape) {
        return area() == shape.area();
    }

    @Override
    public String toString() {
        Formatter formatter = new Formatter();
        return formatter.format("Circle with center point at " + center.getX() + ", " + center.getY()
                + "\nRadius is " + radius
                + "\nArea is %.2f", area()).toString();
    }

    @Override
    public void roll(int distanceToRoll) {
        System.out.println("Circle rolled distance " + distanceToRoll);
        center = new Point((center.getX() + distanceToRoll), center.getY());
        System.out.println("Current position of center point is " + center.getX() + ", " + center.getY());
    }

    @Override
    public double distanceFromZeroPoint() {
        return sqrt(pow(center.getX(), 2) + pow(center.getY(), 2));
    }
}