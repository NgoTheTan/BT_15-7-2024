import java.text.DecimalFormat;

public class Rectangle extends Shape {
    private Point topLeft;
    private double width;
    private double length;

    public Rectangle(Point topLeft, double width, double length) {
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    public Rectangle(Point topLeft, double width, double length, String color, boolean filled) {
        super(color, filled);
        this.topLeft = topLeft;
        this.width = width;
        this.length = length;
    }

    public Point getTopLeft() {
        return this.topLeft;
    }

    public double getWidth() {
        return this.width;
    }

    public double getLength() {
        return this.length;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public String toString() {
        DecimalFormat df = new DecimalFormat("###.#");
        return "Rectangle[TopLeft=" + topLeft.toString() + ",width=" + df.format(this.width)
                + ",length=" + df.format(this.length) + ",color=" + this.getColor()
                + ",filled=" + String.valueOf(this.isFilled()) + "]";
    }

    public void move(double distanceX, double distanceY) {
        this.topLeft.move(distanceX, distanceY);
    }
}