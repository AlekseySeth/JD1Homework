package lesson6;

/**
 * @author a.shestovsky
 */

public class PointMain {
    public static void main(String[] args) {
        Point firstPoint = new Point(2, 7);
        Point secondPoint = new Point(8, 2);
        Rectangle rectangle = new Rectangle(firstPoint, secondPoint);

        System.out.println("Distance = " + firstPoint.distance(secondPoint));
        System.out.println("Diagonal = " + rectangle.diagonal());
        System.out.println("Square = " + rectangle.square());
    }
}