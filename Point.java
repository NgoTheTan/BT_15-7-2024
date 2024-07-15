import java.text.DecimalFormat;

public class Point extends Shape {
    private double x;
    private double y;

    public Point() {
        this.x = 0;
        this.y = 0;
    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("###.#");
        return "(" + df.format(x) + "," + df.format(y) + ")";
    }

    public void move(double distanceX, double distanceY) {
        this.x = this.x + distanceX;
        this.y = this.y + distanceY;
    }
}