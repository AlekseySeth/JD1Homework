package lesson6;

import static java.lang.Math.*;

/**
 * @author a.shestovsky
 */

public class Point {
    private int x;
    private int y;
    private static final int FOR_ROUNDING = 100;

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

    public double distance (Point point) {
        return (double) (int) (sqrt(pow(this.x - point.x, 2) + pow(this.y - point.y, 2)) * FOR_ROUNDING) / FOR_ROUNDING;
    }
}