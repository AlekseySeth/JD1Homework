package lesson7;

import java.util.Formatter;

/**
 * @author a.shestovsky
 */

public class VersatileTriangle extends Triangle {

    public VersatileTriangle(Point firstPoint, Point secondPoint, Point thirdPoint) {
        super(firstPoint, secondPoint, thirdPoint);
    }

    @Override
    public String toString() {
        Formatter formatter = new Formatter();
        return formatter.format("Versatile triangle with three points at ("
                + super.getFirstPoint().getX() + ", " + super.getFirstPoint().getY() + "); ("
                + super.getSecondPoint().getX() + ", " + super.getSecondPoint().getY() + "); ("
                + super.getThirdPoint().getX() + ", " + super.getThirdPoint().getY() + ") "
                + "\nArea is %.2f", area()).toString();
    }
}