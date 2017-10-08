package lesson7;

import static java.lang.Math.sqrt;

/**
 * @author a.shestovsky
 */

public abstract class Triangle implements Shape {
    private Point firstPoint;
    private Point secondPoint;
    private Point thirdPoint;

    protected Triangle() {
    }

    public Triangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        this.thirdPoint = thirdPoint;
    }

    public Point getFirstPoint() {
        return firstPoint;
    }

    public Point getSecondPoint() {
        return secondPoint;
    }

    public Point getThirdPoint() {
        return thirdPoint;
    }

    @Override
    public double perimeter() {
        return firstPoint.distanceBetween(secondPoint) + secondPoint.distanceBetween(thirdPoint)
                + thirdPoint.distanceBetween(firstPoint);
    }

    @Override
    public double area() {
        double sideA = firstPoint.distanceBetween(secondPoint);
        double sideB = secondPoint.distanceBetween(thirdPoint);
        double sideC = thirdPoint.distanceBetween(firstPoint);
        double halfPerimeter = perimeter() / 2;
        return sqrt(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC));
    }

    @Override
    public boolean isAreaEquals(Shape shape) {
        return area() == shape.area();
    }
}