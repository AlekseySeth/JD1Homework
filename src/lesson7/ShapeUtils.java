package lesson7;

/**
 * @author a.shestovsky
 */

public class ShapeUtils {

    public static boolean isRectangle(Shape shape){
        return shape instanceof Rectangle;
    }

    public static boolean isTriangle(Shape shape) {
        return shape instanceof Triangle;
    }
}