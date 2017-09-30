package lesson6;

/**
 * @author a.shestovsky
 */

public class Rectangle {
    private Point topLeft;
    private Point botRight;

    public Rectangle (Point topLeft, Point botRight) {
        this.topLeft = topLeft;
        this.botRight = botRight;
    }

    public double diagonal () {
        return botRight.distance(topLeft);
    }

    public int square () {
        return Math.abs((botRight.getX() - topLeft.getX()) * (topLeft.getY() - botRight.getY()));
    }
}