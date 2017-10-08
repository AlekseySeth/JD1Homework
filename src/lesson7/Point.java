package lesson7;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/**
 * @author a.shestovsky
 */

public class Point implements Positioning {
    private int x;
    private int y;

    public Point (int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public double distanceBetween (Point point) {
        return sqrt(pow(this.x - point.x, 2) + pow(this.y - point.y, 2));
    }

    @Override
    public double distanceFromZeroPoint() {
        return sqrt(pow(x, 2) + pow(y, 2));
    }

    @Override
    public String toString() {
        return "Point with x = " + x + ", y = " + y;
    }
}