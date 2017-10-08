package lesson7;

/**
 * @author a.shestovsky
 */

public class Main {
    public static void main(String[] args) {
        Point first = new Point(0, 0);
        Point second = new Point(5, 5);
        Point third = new Point(6, 8);

        Circle circle = new Circle(second, 10);
        Shape rectangle = new Rectangle(first, third);
        Rectangle square = new Square(second, 5);
        Shape equivalentSquare = new Square(first, second);
        Triangle equilateral = new EquilateralTriangle(first, 8);
        Triangle right = new RightTriangle(second, 10, 20);
        Shape versatile = new VersatileTriangle(first, second, third);

        System.out.println(circle + "\n");
        circle.roll(10);
        System.out.printf("Circumference %.2f\n", circle.perimeter());
        System.out.printf("Distance from zero point is %.2f \n\n", circle.distanceFromZeroPoint());

        System.out.println(rectangle + "\n");
        System.out.println("Is rectangle - " + ShapeUtils.isRectangle(rectangle) + "\n");

        System.out.println(square + "\n");
        System.out.println("Is area equals - " + square.isAreaEquals(equivalentSquare) + "\n");

        System.out.println(equilateral);
        System.out.println("Is triangle - " + ShapeUtils.isTriangle(equilateral) + "\n");

        System.out.println(right + "\n");

        System.out.println(versatile);
        System.out.printf("Perimeter is %.2f\n", versatile.perimeter());
        System.out.println("Is triangle - " + ShapeUtils.isTriangle(versatile) + "\n");

        System.out.printf("Distance from zero to third point is %.2f\n", third.distanceFromZeroPoint());

    }
}